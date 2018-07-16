package com.olaover.inmortaltech.ola.Adapter;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.RestaurantsResponse;
import com.squareup.picasso.Picasso;


import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.MyViewHolder>{

    Context context;
    List<RestaurantsResponse.ResultsBean>restradata;

    public RestaurantAdapter(Context context, List<RestaurantsResponse.ResultsBean> restradata) {
        this.context=context;
        this.restradata=restradata;

    }


    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemtype = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_layout, parent, false);
        return new RestaurantAdapter.MyViewHolder(itemtype);



    }


    @Override
    public void onBindViewHolder(RestaurantAdapter.MyViewHolder holder, int position) {


        Picasso.with(context)
                .load(restradata.get(position).getIcon())
                .into(holder.iv_restra);

        holder.tv_restra_name.setText(restradata.get(position).getName());
        holder.tv_atm_address.setText(restradata.get(position).getVicinity());


    }

    @Override
    public int getItemCount() {
        return restradata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_restra;
        TextView tv_restra_name,tv_atm_address,tv_restra_dista;

        public MyViewHolder(final View itemView) {
            super(itemView);

            iv_restra = (ImageView) itemView.findViewById(R.id.iv_restra);
            tv_restra_name = (TextView) itemView.findViewById(R.id.tv_restra_name);
            tv_atm_address = (TextView) itemView.findViewById(R.id.tv_atm_address);
            tv_restra_dista = (TextView) itemView.findViewById(R.id.tv_restra_dista);


        }
    }
}
