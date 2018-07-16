package com.olaover.inmortaltech.ola.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.olaover.inmortaltech.WebService.ApiInterface;
import com.olaover.inmortaltech.WebService.Callback;
import com.olaover.inmortaltech.WebService.WebServiceRequests;
import com.olaover.inmortaltech.ola.Adapter.NewsAdapter;
import com.olaover.inmortaltech.ola.Adapter.TaxiOlaAdapter;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.NewsResponse;
import com.olaover.inmortaltech.ola.beans.TaxiOlaResponse;
import com.olaover.inmortaltech.ola.retrofit.ApiClientConnection;
import com.olaover.inmortaltech.ola.retrofit.Constants;
import com.olaover.inmortaltech.ola.retrofit.MyDialog;


import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;

public class News extends AppCompatActivity {
    Context context;
    private NewsAdapter newsadapter;
    RecyclerView rv_news;
    RelativeLayout rl_news;
    List<NewsResponse.ArticlesBean> newsdata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);


        context = News.this;
        rl_news = (RelativeLayout) findViewById(R.id.rl_news);
        rv_news = (RecyclerView) findViewById(R.id.rv_news);
        rv_news.setLayoutManager(new LinearLayoutManager(this));
        newsService();


    }

    private void newsService() {

        try {
            MyDialog.getInstance(context).showDialog();

            RequestBody profile_body;
            com.olaover.inmortaltech.ola.retrofit.ApiInterface apiInterface = ApiClientConnection.getInstance().createApiInterfaceNews();
            Call<NewsResponse> call = apiInterface.newsDetailMain("in",
                    "business",
                    "7f7dc220e30b4a3591dc74277b059c8e");
            call.enqueue(new retrofit2.Callback<NewsResponse>() {
                @Override
                public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                    MyDialog.getInstance(context).hideDialog();

                    if (response.isSuccessful()) {
                        NewsResponse body = response.body();


                        newsdata = response.body().getArticles();
                        newsadapter = new NewsAdapter(context, newsdata);
                        rv_news.setAdapter(newsadapter);


                    } else {
                        Toast.makeText(context, "Error!", Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onFailure(Call<NewsResponse> call, Throwable t) {
                    t.printStackTrace();
                    MyDialog.getInstance(context).hideDialog();
                    String s = "";
                }
            });


        } catch (Exception e) {
            e.printStackTrace();
        }


//WebServiceRequests.getInstance().getNews(new Callback<NewsResponse>("in",
//        "business",
//        "7f7dc220e30b4a3591dc74277b059c8e") {
//    @Override
//    public void onNetworkFailure() {
//        Log.d("onfailure ","onfailure");
//    }
//
//    @Override
//    public void onServiceResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
//        if (response.isSuccessful()) {
//            Log.d("success ","success");
//            if(response.body().getStatus().equalsIgnoreCase("OK")) {
//
//
//                newsdata=response.body().getArticles();
//                newsadapter = new NewsAdapter(context,newsdata);
//                rv_news.setAdapter(newsadapter);
//                rv_news.setHasFixedSize(true);
//
//            }else {
//                Toast.makeText(context, "Data is not found", Toast.LENGTH_SHORT).show();
//            }
//        }
//    }
//
//
//
//    @Override
//    public void onFailure(Call<NewsResponse> call, Throwable t) {
//        Log.d("failure ","failure");
//    }
//});


    }
    public void changeActivity(String title,String url,String description,String published){


     /*   Bundle bundle = new Bundle();
        bundle.putString("title",title);
        bundle.putString("url",url);
        bundle.putString("description",description);
        bundle.putString("published",published);
*/
        Intent intent=new Intent(News.this,NewsDetail.class);

       // intent.putExtras(bundle);
        startActivity(intent);
        finish();

    }
}


