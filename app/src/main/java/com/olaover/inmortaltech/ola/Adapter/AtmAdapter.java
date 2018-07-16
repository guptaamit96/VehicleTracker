package com.olaover.inmortaltech.ola.Adapter;

import android.content.Context;
import android.location.Location;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.olaover.inmortaltech.ola.Fragment.MapFragment;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.AtmResponse;

import com.squareup.picasso.Picasso;

import java.util.List;

import Map.GPSTracker;

public class AtmAdapter<s> extends RecyclerView.Adapter<AtmAdapter.MyViewHolder> {

List<AtmResponse.ResultsBean>atmdata;
    Context context;

    MapFragment mapfragment;
    GPSTracker gpstracker;


    public AtmAdapter(Context context, List<AtmResponse.ResultsBean> atmdata) {
        this.atmdata=atmdata;
        this.context=context;

        gpstracker= new GPSTracker(context);


    }

    @Override
    public AtmAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemtype = LayoutInflater.from(parent.getContext()).inflate(R.layout.atm_list_layout, parent, false);
        return new AtmAdapter.MyViewHolder(itemtype);



    }


    @Override
    public void onBindViewHolder(AtmAdapter.MyViewHolder holder, int position) {


        Picasso.with(context)
                .load(atmdata.get(position).getIcon())
                .into(holder.iv_atm);

        holder.tv_atm_name.setText(atmdata.get(position).getName());
        holder.tv_atm_address.setText(atmdata.get(position).getVicinity());






        Location loc1 = new Location("");
        loc1.setLatitude(gpstracker.getLatitude());
        loc1.setLongitude(gpstracker.getLongitude());

        Location loc2 = new Location("");
        loc2.setLatitude(atmdata.get(position).getGeometry().getLocation().getLat());
        loc2.setLongitude(atmdata.get(position).getGeometry().getLocation().getLng());

        float distanceInMeters = loc1.distanceTo(loc2);
        float distanceInKM=distanceInMeters/1000;

        holder.tv_atm_dista.setText((int) distanceInKM+ "km");
    }

    @Override
    public int getItemCount() {
        return atmdata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_atm;
        TextView tv_atm_name,tv_atm_address,tv_atm_dista;


        public MyViewHolder(final View itemView) {
            super(itemView);

            iv_atm = (ImageView) itemView.findViewById(R.id.iv_atm);
            tv_atm_name = (TextView) itemView.findViewById(R.id.tv_atm_name);
            tv_atm_address = (TextView) itemView.findViewById(R.id.tv_atm_address);
            tv_atm_dista = (TextView) itemView.findViewById(R.id.tv_atm_dista);


        }
    }
}

