package com.olaover.inmortaltech.ola.Activity;

import android.content.Context;
import android.os.Trace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Toast;

import com.olaover.inmortaltech.ola.Adapter.AtmAdapter;
import com.olaover.inmortaltech.ola.Adapter.TrainRoutDetailAdapter;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.AtmResponse;
import com.olaover.inmortaltech.ola.beans.TrainRoutesDetaiilsResponse;
import com.olaover.inmortaltech.ola.beans.TrainRoutesListResponse;
import com.olaover.inmortaltech.ola.retrofit.ApiClientConnection;
import com.olaover.inmortaltech.ola.retrofit.ApiInterface;
import com.olaover.inmortaltech.ola.retrofit.MyDialog;

import java.io.IOException;
import java.util.List;

import okhttp3.Request;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TrainsRoutesDetails extends AppCompatActivity {
    Context context;
    List<TrainRoutesDetaiilsResponse.RouteBean>trainroutesdetaildata;
    List<TrainRoutesListResponse.TrainsBean>trainrouteslistdata;
    TrainRoutDetailAdapter trainroutesdetailsadapter;
    RecyclerView rv_trnrout_detail;
    TextView tv_num,tv_name,tv_startfrom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trains_routes_details);

        context=TrainsRoutesDetails.this;

        tv_num=(TextView)findViewById(R.id.tv_num);
        tv_name=(TextView)findViewById(R.id.tv_name);
        tv_startfrom=(TextView)findViewById(R.id.tv_startfrom);

        rv_trnrout_detail=(RecyclerView)findViewById(R.id.rv_trnrout_detail);
        rv_trnrout_detail.setLayoutManager(new LinearLayoutManager(this));

        trainsRoutesService();
        trainRoutesListService();
    }


    private void trainsRoutesService() {
        try{
            MyDialog.getInstance(context).showDialog();
            RequestBody profile_body;
            ApiInterface apiInterface= ApiClientConnection.getInstance().createApiInterfaceIndianRailway();
            Call<TrainRoutesDetaiilsResponse>call=apiInterface.trainRoutesDetails("12006",
                    "zltmpfae00");
            call.enqueue(new retrofit2.Callback<TrainRoutesDetaiilsResponse>() {
                @Override
                public void onResponse(Call<TrainRoutesDetaiilsResponse> call, Response<TrainRoutesDetaiilsResponse> response) {
                    MyDialog.getInstance(context).hideDialog();

                    if (response.isSuccessful()) {
                        TrainRoutesDetaiilsResponse body = response.body();

                        trainroutesdetaildata=response.body().getRoute();
                        trainroutesdetailsadapter=new TrainRoutDetailAdapter(context,trainroutesdetaildata);
                        rv_trnrout_detail.setAdapter(trainroutesdetailsadapter);

                        tv_startfrom.setText(trainroutesdetaildata.get(0).getStation().getName());

                    } else {
                        Toast.makeText(context, "Error!", Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onFailure(Call<TrainRoutesDetaiilsResponse> call, Throwable t) {
                    t.printStackTrace();
                    MyDialog.getInstance(context).hideDialog();
                    String s = "";
                }
            });

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    private void trainRoutesListService() {

        try{
            MyDialog.getInstance(context).showDialog();
            RequestBody profile_body;
            ApiInterface apiInterface= ApiClientConnection.getInstance().createApiInterfaceIndianRailway();
            Call<TrainRoutesListResponse>call=apiInterface.routListDetails("shiv",
                    "zltmpfae00");
            call.enqueue(new retrofit2.Callback<TrainRoutesListResponse>() {
                @Override
                public void onResponse(Call<TrainRoutesListResponse> call, Response<TrainRoutesListResponse> response) {
                    MyDialog.getInstance(context).hideDialog();

                    if (response.isSuccessful()) {
                        TrainRoutesListResponse body = response.body();

                        trainrouteslistdata=response.body().getTrains();

                        tv_num.setText(trainrouteslistdata.get(0).getNumber());
                        tv_name.setText("- "+trainrouteslistdata.get(0).getName());



                    } else {
                        Toast.makeText(context, "Error!", Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onFailure(Call<TrainRoutesListResponse> call, Throwable t) {
                    t.printStackTrace();
                    MyDialog.getInstance(context).hideDialog();
                    String s = "";
                }
            });

        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
