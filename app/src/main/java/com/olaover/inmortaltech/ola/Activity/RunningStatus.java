package com.olaover.inmortaltech.ola.Activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.olaover.inmortaltech.ola.Adapter.RestaurantAdapter;
import com.olaover.inmortaltech.ola.Adapter.RunningStatusAdapter;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.RunningStatusRespponse;
import com.olaover.inmortaltech.ola.retrofit.ApiClientConnection;
import com.olaover.inmortaltech.ola.retrofit.ApiInterface;
import com.olaover.inmortaltech.ola.retrofit.MyDialog;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;

public class RunningStatus extends AppCompatActivity {
    Context context;
   private RecyclerView rv_run_status;
    List<RunningStatusRespponse.RouteBean>runsttdata;
    RunningStatusAdapter runningstatusadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running_status);

        context=RunningStatus.this;

        rv_run_status=(RecyclerView)findViewById(R.id.rv_run_status);
        rv_run_status.setLayoutManager(new LinearLayoutManager(this));
        
        runstatusService();
        
    }

    private void runstatusService() {

        try {
            MyDialog.getInstance(context).showDialog();

            RequestBody profile_body;
            ApiInterface apiInterface = ApiClientConnection.getInstance().createApiInterfaceIndianRailway();
            Call<RunningStatusRespponse> call = apiInterface.runStatusDetails("12555",
                    "11-07-2018",
                    "zltmpfae00");
            call.enqueue(new retrofit2.Callback<RunningStatusRespponse>() {
                @Override
                public void onResponse(Call<RunningStatusRespponse> call, Response<RunningStatusRespponse> response) {
                    MyDialog.getInstance(context).hideDialog();

                    if (response.isSuccessful()) {
                        RunningStatusRespponse body = response.body();



                        runsttdata=response.body().getRoute();
                        runningstatusadapter=new RunningStatusAdapter(context,runsttdata);
                        rv_run_status.setAdapter(runningstatusadapter);





                    } else {
                        Toast.makeText(context, "Error!", Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onFailure(Call<RunningStatusRespponse> call, Throwable t) {
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
