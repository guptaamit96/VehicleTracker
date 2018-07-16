package com.olaover.inmortaltech.ola.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.TrainRoutesDetaiilsResponse;

import java.util.List;

public class TrainRoutDetailAdapter extends RecyclerView.Adapter<TrainRoutDetailAdapter.MyViewHolder> {

    Context context;
    List<TrainRoutesDetaiilsResponse.RouteBean>trainroutesdetaildata;

    public TrainRoutDetailAdapter(Context context, List<TrainRoutesDetaiilsResponse.RouteBean> trainroutesdetaildata) {

        this.context=context;
        this.trainroutesdetaildata=trainroutesdetaildata;

    }

    @NonNull
    @Override
    public TrainRoutDetailAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemtype = LayoutInflater.from(parent.getContext()).inflate(R.layout.train_routes_detail_list, parent, false);
        return new TrainRoutDetailAdapter.MyViewHolder(itemtype);
    }

    @Override
    public void onBindViewHolder( TrainRoutDetailAdapter.MyViewHolder holder, int position) {

        holder.tv_code.setText(trainroutesdetaildata.get(position).getStation().getCode());
        holder.tv_sta_name.setText("- "+trainroutesdetaildata.get(position).getStation().getName());
        holder.tv_arri_at.setText(trainroutesdetaildata.get(position).getScharr());
        holder.tv_dist.setText(String.valueOf(trainroutesdetaildata.get(position).getDistance()+"KM"));
        holder.tv_day.setText(String.valueOf(trainroutesdetaildata.get(position).getDay()));

    }

    @Override
    public int getItemCount() {
        return trainroutesdetaildata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_code,tv_sta_name,tv_arri_at,tv_dist,tv_day;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_code=(TextView)itemView.findViewById(R.id.tv_code);
            tv_sta_name=(TextView)itemView.findViewById(R.id.tv_sta_name);
            tv_arri_at=(TextView)itemView.findViewById(R.id.tv_arri_at);
            tv_dist=(TextView)itemView.findViewById(R.id.tv_dist);
            tv_day=(TextView)itemView.findViewById(R.id.tv_day);

        }
    }
}
