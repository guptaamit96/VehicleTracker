package com.olaover.inmortaltech.ola.Activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import com.olaover.inmortaltech.ola.Adapter.RestaurantAdapter;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.RestaurantsResponse;
import com.olaover.inmortaltech.ola.retrofit.ApiClientConnection;
import com.olaover.inmortaltech.ola.retrofit.ApiInterface;
import com.olaover.inmortaltech.ola.retrofit.MyDialog;
import java.util.List;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;

public class Restaurant extends AppCompatActivity {

    RecyclerView rv_rst;
    RestaurantAdapter restaurantadapter;

   Context context;
    List<RestaurantsResponse.ResultsBean>restradata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        context=Restaurant.this;
        rv_rst=findViewById(R.id.rv_rst);
        rv_rst.setLayoutManager(new LinearLayoutManager(this));
        restaurantsService();
    }

    private void restaurantsService() {


        try {
            MyDialog.getInstance(context).showDialog();

            RequestBody profile_body;
            ApiInterface apiInterface = ApiClientConnection.getInstance().createApiInterfaceRestra();
            Call<RestaurantsResponse> call = apiInterface.restaurantsDetails("restaurant",
                    "2000",
                    "37.785834,-122.406417",
                    "distance",
                    "AIzaSyCgF_TyLwHRN14u7vPmG_ed0tv5URZWQHg");
            call.enqueue(new retrofit2.Callback<RestaurantsResponse>() {
                @Override
                public void onResponse(Call<RestaurantsResponse> call, Response<RestaurantsResponse> response) {
                    MyDialog.getInstance(context).hideDialog();

                    if (response.isSuccessful()) {
                        RestaurantsResponse body = response.body();


                        restradata = response.body().getResults();
                        restaurantadapter = new RestaurantAdapter(context, restradata);
                        rv_rst.setAdapter(restaurantadapter);


                    } else {
                        Toast.makeText(context, "Error!", Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onFailure(Call<RestaurantsResponse> call, Throwable t) {
                    t.printStackTrace();
                    MyDialog.getInstance(context).hideDialog();
                    String s = "";
                }
            });


        } catch (Exception e) {
            e.printStackTrace();
        }


//        try {
//           MyDialog.getInstance(context).showDialog();
//
//
//            RequestBody profile_body;
//
//            ApiInterface apiInterface=ApiClientConnection.getInstance().createApiInterfaceRestra();
//            Call<RestaurantsResponse>call=apiInterface.restaurantsDetails("restaurant",
//                    "2000",
//                    "37.785834,-122.406417",
//                    "distance",
//                    "AIzaSyCgF_TyLwHRN14u7vPmG_ed0tv5URZWQHg");
//            call.enqueue(new retrofit2.Callback<RestaurantsResponse>(){
//
//
//                @Override
//                public void onResponse(Call<RestaurantsResponse> call, Response<RestaurantsResponse> response) {
//                    MyDialog.getInstance(context).hideDialog();
//                    if(response.isSuccessful())
//                    {
//                        RestaurantsResponse body= response.body();
//                        restradata=response.body().getResults();
//                        restaurantadapter=new RestaurantAdapter(context,restradata);
//                        rv_rst.setAdapter(restaurantadapter);
//
//                    }
//
//                    else
//                    {
//                        Toast.makeText(Restaurant.this, "Error!", Toast.LENGTH_SHORT).show();
//                    }
//                }
//
//                @Override
//                public void onFailure(Call<RestaurantsResponse> call, Throwable t) {
//                    MyDialog.getInstance(context).hideDialog();
//                    String s="";
//                }
//            });
//
//        } catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
