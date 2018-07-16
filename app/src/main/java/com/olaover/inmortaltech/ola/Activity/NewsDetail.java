package com.olaover.inmortaltech.ola.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.olaover.inmortaltech.ola.R;
import com.squareup.picasso.Picasso;

public class NewsDetail extends AppCompatActivity {

    ImageView iv_newsdetail_img;
    TextView tv_newsdetail_title,tv_newsdet_description,tv_newsdetail_published;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

       initView();
        setUpActions();
    }

    private void initView() {


        iv_newsdetail_img = (ImageView)findViewById(R.id.iv_newsdetail_img);
        tv_newsdetail_title = (TextView)findViewById(R.id.tv_newsdetail_title);
        tv_newsdet_description = (TextView) findViewById(R.id.tv_newsdet_description);
        tv_newsdetail_published = (TextView)findViewById(R.id.tv_newsdetail_published);

    }

    private void setUpActions() {
        Bundle data=getIntent().getExtras();
        if(!data.isEmpty()){
            String title=data.getString("title");
            String publish=data.getString("publish");
            String description=data.getString("description");
            String url=data.getString("url");

            Picasso.with(NewsDetail.this)
                    .load(url)
                    .into(iv_newsdetail_img);


            tv_newsdetail_title.setText(title);
            tv_newsdetail_published.setText(publish);
            tv_newsdet_description.setText(description);



        }

    }
}
