package com.olaover.inmortaltech.ola.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.olaover.inmortaltech.ola.R;

public class IndianRailway extends AppCompatActivity {
    private LinearLayout ll_pnr,ll_runstts,ll_trnrouts,ll_srchtrn,ll_seatavil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_railway);

        inIt();
        setUpActions();
    }


    private void inIt() {
        ll_pnr=findViewById(R.id.ll_pnr);
        ll_runstts=findViewById(R.id.ll_runstts);
        ll_trnrouts=findViewById(R.id.ll_trnrouts);
        ll_srchtrn=findViewById(R.id.ll_srchtrn);
        ll_seatavil=findViewById(R.id.ll_seatavil);
    }



    private void setUpActions() {
        ll_pnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndianRailway.this,PnrStatus.class);
                startActivity(intent);
            }
        });


        ll_runstts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndianRailway.this,RunningStatus.class);
                startActivity(intent);
            }
        });

        ll_trnrouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(IndianRailway.this,TrainRoutes.class);
                startActivity(intent);
            }
        });

        ll_srchtrn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndianRailway.this,SearchTrains.class);
                startActivity(intent);
            }
        });


        ll_seatavil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndianRailway.this,SeatAvailability.class);
                startActivity(intent);
            }
        });

    }


}
