package com.olaover.inmortaltech.ola.Activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import com.olaover.inmortaltech.ola.Adapter.BusDetailsAdapter;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.BusResponse;
import com.olaover.inmortaltech.ola.retrofit.ApiClientConnection;
import com.olaover.inmortaltech.ola.retrofit.ApiInterface;
import com.olaover.inmortaltech.ola.retrofit.MyDialog;
import java.util.List;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;

public class BusBeriefDetails extends AppCompatActivity {
    Context context;
   List<BusResponse.RoutesBean>busdata;
    RecyclerView rv_bus;
    BusDetailsAdapter busdetailsadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_berief_details);

        context=BusBeriefDetails.this;

        rv_bus=(RecyclerView)findViewById(R.id.rv_bus);
        rv_bus.setLayoutManager(new LinearLayoutManager(this));

        busDetailsService();

    }




    private void busDetailsService() {

        try {
            MyDialog.getInstance(context).showDialog();

            RequestBody profile_body;
            ApiInterface apiInterface = ApiClientConnection.getInstance().createApiInterfaceBus();
            Call<BusResponse> call = apiInterface.busDetails("ghaziabad",
                    "delhi",
                    "transit",
                    "bus",
                    "true",
                    "AIzaSyCgF_TyLwHRN14u7vPmG_ed0tv5URZWQHg");
            call.enqueue(new retrofit2.Callback<BusResponse>() {
                @Override
                public void onResponse(Call<BusResponse> call, Response<BusResponse> response) {
                    MyDialog.getInstance(context).hideDialog();

                    if (response.isSuccessful()) {
                        BusResponse body = response.body();

                        busdata=response.body().getRoutes();
                        busdetailsadapter=new BusDetailsAdapter(context,busdata);
                        rv_bus.setAdapter(busdetailsadapter);


                    } else {
                        Toast.makeText(context, "Error!", Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onFailure(Call<BusResponse> call, Throwable t) {
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

