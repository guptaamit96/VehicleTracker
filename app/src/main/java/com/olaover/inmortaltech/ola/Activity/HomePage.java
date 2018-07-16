package com.olaover.inmortaltech.ola.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.olaover.inmortaltech.ola.Adapter.SlidingImage_Adapter;
import com.olaover.inmortaltech.ola.Fragment.MetroDetails;
import com.olaover.inmortaltech.ola.R;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class HomePage extends AppCompatActivity {
   private LinearLayout ll_cab,ll_bus,ll_metro,ll_ralwy,ll_news,ll_restrant,ll_atm,ll_video;
   private FrameLayout containerh;

    MetroDetails metrodetails;
    IndianRailway indianrailway;

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private static final Integer[] IMAGES= {R.drawable.first,R.drawable.second,R.drawable.third};
    private ArrayList ImagesArray = new ArrayList();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        inIt();
        init();
        setUpActions();
    }

    private void inIt() {
        ll_cab=findViewById(R.id.ll_cab);
        ll_bus=findViewById(R.id.ll_bus);
        ll_metro=findViewById(R.id.ll_metro);
        ll_ralwy=findViewById(R.id.ll_ralwy);
        ll_news=findViewById(R.id.ll_news);
        ll_restrant=findViewById(R.id.ll_restrant);
        ll_atm=findViewById(R.id.ll_atm);
        ll_video=findViewById(R.id.ll_video);
        containerh=findViewById(R.id.containerh);



        //for instance
        metrodetails=new MetroDetails();
        indianrailway=new IndianRailway();

    }



    private void setUpActions() {

        ll_cab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(HomePage.this,MainActivity.class);
               startActivity(intent);
            }
        });


        ll_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomePage.this,Bus.class);
                startActivity(intent);
            }
        });

        ll_metro.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {

              FragmentManager fragmentManager = getSupportFragmentManager();
              FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
              MetroDetails fragment2 = new MetroDetails();
              fragmentTransaction.add(R.id.containerh,fragment2 , "fragment");
              fragmentTransaction.addToBackStack(null).commit();

            }
        });

        ll_ralwy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomePage.this,IndianRailway.class);
                startActivity(intent);

            }
        });

        ll_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomePage.this,News.class);
                startActivity(intent);
            }
        });

        ll_restrant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomePage.this,Restaurant.class);
                startActivity(intent);
            }
        });


        ll_atm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomePage.this,Atm.class);
                startActivity(intent);
            }
        });


        ll_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=bzSTpdcs-EI"));
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

    }





    private void init() {
        for(int i=0;i<IMAGES.length;i++)
            ImagesArray.add(IMAGES[i]);

        mPager = (ViewPager) findViewById(R.id.pager);


        mPager.setAdapter(new SlidingImage_Adapter(HomePage.this,ImagesArray));


        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;


        indicator.setRadius(5 * density);

        NUM_PAGES =IMAGES.length;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

    }
}
