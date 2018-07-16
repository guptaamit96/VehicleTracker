package com.olaover.inmortaltech.ola.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.olaover.inmortaltech.ola.Adapter.TaxiOlaAdapter;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.TaxiOlaInner;
import com.olaover.inmortaltech.ola.beans.TaxiOlaResponse;

import com.olaover.inmortaltech.ola.retrofit.ApiClientConnection;
import com.olaover.inmortaltech.ola.retrofit.ApiInterface;
import com.olaover.inmortaltech.ola.retrofit.Constants;
import com.olaover.inmortaltech.ola.retrofit.MyDialog;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;

import static com.olaover.inmortaltech.ola.retrofit.Constants.DropLat;
import static com.olaover.inmortaltech.ola.retrofit.Constants.DropLon;

/**
 * A simple {@link Fragment} subclass.
 */
public class OlaTaxiDetails extends Fragment {

    View view;
    private TaxiOlaAdapter taxiolaadapter;
    String Authorization = "Bearer 96121212f12ff12f12f1f12f1f12fe2";
    String xapptoken = "2e987510441744ceabbbe8b4f9382e93";
    RecyclerView rv_taxiola;
List<TaxiOlaResponse.CategoriesBean> olaTaxiData;
    List<TaxiOlaResponse.CategoriesBean.FareBreakupBean> olaTaxiFareData;


    public OlaTaxiDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_ola_taxi_details, container, false);




        taxiOlaService();

        rv_taxiola = (RecyclerView) view.findViewById(R.id.rv_taxiola);
        rv_taxiola.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;

    }


    private void taxiOlaService() {
        try {
            MyDialog.getInstance(getActivity()).showDialog();
            if (!Authorization.isEmpty()) {
                RequestBody profile_body;
                ApiInterface apiInterface = ApiClientConnection.getInstance().createApiInterfacecopy();
                Call<TaxiOlaResponse> call = apiInterface.taxiOladetails(Authorization, xapptoken, Constants.LAT,Constants.LON,Constants.DropLat,Constants.DropLon,"p2p");
                call.enqueue(new retrofit2.Callback<TaxiOlaResponse>() {
                    @Override
                    public void onResponse(Call<TaxiOlaResponse> call, Response<TaxiOlaResponse> response) {
                        MyDialog.getInstance(getActivity()).hideDialog();

                        if (response.isSuccessful()) {
                            TaxiOlaResponse body = response.body();




//                            String display_name = response.body().getCategories().get(1).getDisplay_name();
//                            taxi_ola_data = response.body().getCategories().get(1).getFare_breakup();
//
//                            // Put elements to the hashMap
//                            hashMap.put(display_name, new Integer(1));


                            olaTaxiData=response.body().getCategories();
                            olaTaxiFareData=response.body().getFareBreakup();
                            taxiolaadapter = new TaxiOlaAdapter(getActivity(), olaTaxiData,olaTaxiFareData);
                            rv_taxiola.setAdapter(taxiolaadapter);

                        /*taxi_ola_data = response.body().getCategoriesola();
                             taxi_ola_data=response.body().getFare_breakup();


                               taxiolaadapter = new TaxiOlaAdapter(getActivity(), taxi_ola_data);
                                rv_taxiola.setAdapter(taxiolaadapter);*/



                        } else {
                            Toast.makeText(getActivity(), "Error!", Toast.LENGTH_SHORT).show();

                        }
                    }

                    @Override
                    public void onFailure(Call<TaxiOlaResponse> call, Throwable t) {
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
