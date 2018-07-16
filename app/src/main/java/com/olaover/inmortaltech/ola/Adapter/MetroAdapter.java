package com.olaover.inmortaltech.ola.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.MetroResponce;

import java.util.ArrayList;



public class MetroAdapter extends RecyclerView.Adapter<MetroAdapter.MyViewHolder> {
    ArrayList<MetroResponce> metro_data;
    Context context;

    public MetroAdapter(Context context, ArrayList<MetroResponce> metro_data) {
        this.context = context;
        this.metro_data = metro_data;
    }

    public MetroAdapter() {

    }

    @Override
    public MetroAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemtype = LayoutInflater.from(parent.getContext()).inflate(R.layout.metro_list_layout, parent, false);
        return new MetroAdapter.MyViewHolder(itemtype);
    }

    @Override
    public void onBindViewHolder(MetroAdapter.MyViewHolder holder, int position) {

        holder.tv_station_name.setText(metro_data.get(position).getStation_name());
        holder.tv_km.setText(metro_data.get(position).getKilo_meter());
        holder.tv_elavated.setText(metro_data.get(position).getElevated());




    }

    @Override
    public int getItemCount() {
        return metro_data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_station_name,tv_km,tv_elavated;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_station_name = (TextView) itemView.findViewById(R.id.tv_station_name);
            tv_km = (TextView) itemView.findViewById(R.id.tv_km);
            tv_elavated = (TextView) itemView.findViewById(R.id.tv_elavated);


        }
    }
}

