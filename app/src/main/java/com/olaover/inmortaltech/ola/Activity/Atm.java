package com.olaover.inmortaltech.ola.Activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.olaover.inmortaltech.ola.Adapter.AtmAdapter;
import com.olaover.inmortaltech.ola.Adapter.NewsAdapter;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.AtmResponse;
import com.olaover.inmortaltech.ola.beans.NewsResponse;
import com.olaover.inmortaltech.ola.retrofit.ApiClientConnection;
import com.olaover.inmortaltech.ola.retrofit.ApiInterface;
import com.olaover.inmortaltech.ola.retrofit.MyDialog;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;

public class Atm extends AppCompatActivity {
    List<AtmResponse.ResultsBean>atmdata;

    AtmAdapter atmadapter;

    RecyclerView rv_atm;


    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm);

        context = Atm.this;
        rv_atm=(RecyclerView)findViewById(R.id.rv_atm);
        rv_atm.setLayoutManager(new LinearLayoutManager(this));

        atmService();
    }

    private void atmService() {

        try {
            MyDialog.getInstance(context).showDialog();

            RequestBody profile_body;
            ApiInterface apiInterface = ApiClientConnection.getInstance().createApiInterfaceAtm();
            Call<AtmResponse> call = apiInterface.atmDetails("atm",
                    "2000",
                    "37.785834,-122.406417",
                    "distance",
                    "AIzaSyCgF_TyLwHRN14u7vPmG_ed0tv5URZWQHgAIzaSyCgF_TyLwHRN14u7vPmG_ed0tv5URZWQHg");
            call.enqueue(new retrofit2.Callback<AtmResponse>() {
                @Override
                public void onResponse(Call<AtmResponse> call, Response<AtmResponse> response) {
                    MyDialog.getInstance(context).hideDialog();

                    if (response.isSuccessful()) {
                        AtmResponse body = response.body();
                        atmdata = response.body().getResults();
                        atmadapter = new AtmAdapter(context, atmdata);
                        rv_atm.setAdapter(atmadapter);


                    } else {
                        Toast.makeText(context, "Error!", Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onFailure(Call<AtmResponse> call, Throwable t) {
                    t.printStackTrace();
                    MyDialog.getInstance(context).hideDialog();
                    String s = "";
                }
            });


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
