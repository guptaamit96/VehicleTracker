package com.olaover.inmortaltech.ola.Activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.TrainSearchResponse;
import com.olaover.inmortaltech.ola.retrofit.ApiClientConnection;
import com.olaover.inmortaltech.ola.retrofit.ApiInterface;
import com.olaover.inmortaltech.ola.retrofit.MyDialog;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;

public class SearchTrains extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_trains);

        context=SearchTrains.this;

        trainSearchService();
    }

    private void trainSearchService() {

        try {
            MyDialog.getInstance(context).showDialog();
            RequestBody profile_body;
            ApiInterface apiInterface = ApiClientConnection.getInstance().createApiInterfaceIndianRailway();
            Call<TrainSearchResponse> call = apiInterface.trainSearchDetails("12-07-2018",
                    "zltmpfae00");
            call.enqueue(new retrofit2.Callback<TrainSearchResponse>() {
                @Override
                public void onResponse(Call<TrainSearchResponse> call, Response<TrainSearchResponse> response) {
                    if(response.isSuccessful()){
                        TrainSearchResponse body=response.body();


                    }

                    else {

                        Toast.makeText(SearchTrains.this, "Error!", Toast.LENGTH_SHORT).show();
                    }

                }

                @Override
                public void onFailure(Call<TrainSearchResponse> call, Throwable t) {

                }
            });

        }catch (Exception e){
            e.printStackTrace();
            MyDialog.getInstance(context).hideDialog();
            String s="";
        }

    }
}
