package com.olaover.inmortaltech.ola.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.LoginInner;
import com.olaover.inmortaltech.ola.beans.UberTimeInner;

import java.util.ArrayList;

public class TaxiUberAdapter<S> extends RecyclerView.Adapter<TaxiUberAdapter.MyViewHolder> {
    ArrayList<LoginInner> uber_data;
    ArrayList<UberTimeInner> uber_time_data;
    Context context;
    //int star;


    public TaxiUberAdapter(Context context, ArrayList<LoginInner> uber_data,ArrayList<UberTimeInner> uber_time_data) {
        this.context = context;
        this.uber_data = uber_data;
        this.uber_time_data = uber_time_data;

    }





    @Override
    public TaxiUberAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemtype = LayoutInflater.from(parent.getContext()).inflate(R.layout.taxi_uber_list_layout, parent, false);
        return new TaxiUberAdapter.MyViewHolder(itemtype);
    }


    @Override
    public void onBindViewHolder(TaxiUberAdapter.MyViewHolder holder, int position) {

       /* holder.tv_taxiuber_fare.setText(Taxi_Uber_Data.get(position).getUberFare());
        holder.tv_taxiuber_time.setText(Taxi_Uber_Data.get(position).getUberTime());*/


/*
      for(int i=1;i<=uber_data.size();i++)
       {
           for (int j=1;j<=uber_time_data.size();j++) {
               if (uber_data.get(i).getDisplay_name().equals(uber_time_data.get(j).getDisplay_name()))

               {
                   holder.tv_taxiuber_fare.setText(uber_data.get(position).getEstimate());
                   System.out.print(i+""+j);

               }
           }
       }*/



















        //holder.tv_taxiuber_fare.setText(uber_data.get(position).getLow_estimate()+"-"+uber_data.get(position).getHigh_estimate());
        if(uber_data != null && uber_data.size()>0){
           holder.tv_taxiuber_fare.setText(uber_data.get(position).getEstimate());
            holder.tv_uber_dname.setText(uber_data.get(position).getDisplay_name());
        }

        if(!uber_time_data.get(position).getEstimate().equalsIgnoreCase("")) {

            String seconds = uber_time_data.get(position).getEstimate();
             int i = Integer.parseInt(seconds)/60;
             String s = String.valueOf(i);

            holder.tv_taxiuber_time.setText(s+" min");
        }



    }

    @Override
    public int getItemCount() {
        return uber_data.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_taxiuber_fare, tv_taxiuber_time, tv_uber_dname;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_taxiuber_fare = (TextView) itemView.findViewById(R.id.tv_taxiuber_fare);
            tv_taxiuber_time = (TextView) itemView.findViewById(R.id.tv_taxiuber_time);
            tv_uber_dname = (TextView) itemView.findViewById(R.id.tv_uber_dname);


        }
    }



}
