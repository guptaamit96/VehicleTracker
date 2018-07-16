package com.olaover.inmortaltech.ola.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.olaover.inmortaltech.ola.Adapter.TaxiUberAdapter;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.LoginInner;
import com.olaover.inmortaltech.ola.beans.LoginResponse;
import com.olaover.inmortaltech.ola.beans.UberTimeResponse;
import com.olaover.inmortaltech.ola.beans.UberTimeInner;
import com.olaover.inmortaltech.ola.retrofit.ApiClientConnection;
import com.olaover.inmortaltech.ola.retrofit.ApiInterface;
import com.olaover.inmortaltech.ola.retrofit.MyDialog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class UberTaxiDetails extends Fragment {
    View view;
    private RecyclerView rv_taxi_uber;
    String Authorization = "Bearer KA.eyJ2ZXJzaW9uIjoyLCJpZCI6InFyalp4d1JRVEZ5SEM1SlFCMThpVWc9PSIsImV4cGlyZXNfYXQiOjE1MjgzNzczMTAsInBpcGVsaW5lX2tleV9pZCI6Ik1RPT0iLCJwaXBlbGluZV9pZCI6MX0.JkavUTuxegYvolklDU6ige1VQvvmWGJO34cYNQJNAqc";
    private TaxiUberAdapter taxiUberAdapter;
    private ArrayList<LoginInner> uber_data;
    private ArrayList<UberTimeInner> uber_time_data;

    private static ApiClientConnection apiClientConnection = null;
    private static ApiInterface apiInterface = null, distanceMatrixInterface = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_uber_taxi_details, container, false);

        uber_data = new ArrayList<>();
        uber_time_data = new ArrayList<>();

        uberPriceService();
        uberTimeService();

        rv_taxi_uber = view.findViewById(R.id.rv_taxi_uber);
        rv_taxi_uber.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }

/*
    public ApiInterface createApiInterface() {
        if (apiInterface == null) {

            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder()
                    .connectTimeout(80, TimeUnit.SECONDS)
                    .readTimeout(80, TimeUnit.SECONDS);

            httpBuilder.addInterceptor(loggingInterceptor);
//            Gson gson = new GsonBuilder()
//                    .setLenient()
//                    .create();
            Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpBuilder.build());

            Retrofit retrofit = builder.build();
            apiInterface = retrofit.create(ApiInterface.class);


        }
        return apiInterface;
    }


    private Map<String, RequestBody> setUpMapData(String Authorization, String contentype, String language) {

        Map<String, RequestBody> fields = new HashMap<>();

        RequestBody authorized = RequestBody.create(MediaType.parse("text/plain"), Authorization);
        RequestBody content_type = RequestBody.create(MediaType.parse("text/plain"), "application/json");

        RequestBody language_type = RequestBody.create(MediaType.parse("text/plain"), "en_US");

        fields.put("Authorization", authorized);

        fields.put("Contact-Type", content_type);

        fields.put("Accept-Language", language_type);


        return fields;
    }
    */

    private void uberPriceService() {
        try {
            MyDialog.getInstance(getActivity()).showDialog();


            if (!Authorization.isEmpty()) {

                ApiInterface apiInterface = ApiClientConnection.getInstance().createApiInterface();
                Call<LoginResponse> call = apiInterface.personaldetails(Authorization);
                call.enqueue(new retrofit2.Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        MyDialog.getInstance(getActivity()).hideDialog();

                        if (response.isSuccessful()) {
                            LoginResponse body = response.body();


                            uber_data = response.body().getPrices();
                            taxiUberAdapter = new TaxiUberAdapter(getActivity(), uber_data, uber_time_data);
                            rv_taxi_uber.setAdapter(taxiUberAdapter);


                        } else {
                            Toast.makeText(getActivity(), "Error!", Toast.LENGTH_SHORT).show();

                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
                        t.printStackTrace();
                        MyDialog.getInstance(getActivity()).hideDialog();
                        String s = "";
                    }
                });

            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    private void uberTimeService() {
        try {
            MyDialog.getInstance(getActivity()).showDialog();
            if (!Authorization.isEmpty()) {

                ApiInterface apiInterface = ApiClientConnection.getInstance().createApiInterface();

                Call<UberTimeResponse> call = apiInterface.Timedetails(Authorization);
                call.enqueue(new retrofit2.Callback<UberTimeResponse>() {
                    @Override
                    public void onResponse(Call<UberTimeResponse> call, Response<UberTimeResponse> response) {
                        MyDialog.getInstance(getActivity()).hideDialog();

                        if (response.isSuccessful()) {
                            UberTimeResponse body = response.body();


                            uber_time_data = response.body().getTimes();
                            taxiUberAdapter = new TaxiUberAdapter(getActivity(), uber_data, uber_time_data);
                            rv_taxi_uber.setAdapter(taxiUberAdapter);


                        } else {
                            Toast.makeText(getActivity(), "Error!", Toast.LENGTH_SHORT).show();

                        }
                    }

                    @Override
                    public void onFailure(Call<UberTimeResponse> call, Throwable t) {
                        t.printStackTrace();
                        MyDialog.getInstance(getActivity()).hideDialog();
                        String s = "";
                    }
                });

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}