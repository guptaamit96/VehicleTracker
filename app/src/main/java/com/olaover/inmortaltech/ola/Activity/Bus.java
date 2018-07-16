package com.olaover.inmortaltech.ola.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.BusResponse;

import java.util.List;

import static java.lang.Integer.parseInt;

public class Bus extends AppCompatActivity {
    //Context context;
    private TextView tv_bus_source,tv_bus_destination;
    private RelativeLayout rl_serch_bus;

   private String sourceaddress;
   private String destinationaddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

      // context=Bus.this;

        inIt();
        setUpActions();
    }

    private void inIt() {
        tv_bus_source=(TextView)findViewById(R.id.tv_bus_source);
        tv_bus_destination=(TextView)findViewById(R.id.tv_bus_destination);
        rl_serch_bus=(RelativeLayout)findViewById(R.id.rl_serch_bus);

    }



    private void setUpActions() {


        sourceaddress=(tv_bus_source.getText().toString());
        destinationaddress=(tv_bus_destination.getText().toString());

        if(!sourceaddress.isEmpty() && !destinationaddress.isEmpty()){


            rl_serch_bus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Bus.this, BusBeriefDetails.class);
                    startActivity(intent);
                }
            });

        }else{
            Toast.makeText(this, "please fill all required field", Toast.LENGTH_SHORT).show();
        }





    }

}
