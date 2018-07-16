package com.olaover.inmortaltech.ola.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.RunningStatusRespponse;
import java.util.List;

public class RunningStatusAdapter<s> extends RecyclerView.Adapter<RunningStatusAdapter.MyViewHolder> {
    Context context;
    List<RunningStatusRespponse.RouteBean>runsttdata;

    public RunningStatusAdapter(Context context, List<RunningStatusRespponse.RouteBean> runsttdata) {
        this.context=context;
        this.runsttdata=runsttdata;

    }


    public RunningStatusAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemtype = LayoutInflater.from(parent.getContext()).inflate(R.layout.runstatus_list_layout, parent, false);
        return new RunningStatusAdapter.MyViewHolder(itemtype);



    }


    @Override
    public void onBindViewHolder(RunningStatusAdapter.MyViewHolder holder, int position) {

        holder.tv_run_iden.setText(runsttdata.get(position).getStation().getCode());
        holder.tv_run_stname.setText("- "+runsttdata.get(position).getStation().getName());
        holder.tv_act_arr.setText(runsttdata.get(position).getActarr());
        holder.tv_act_dep.setText(runsttdata.get(position).getActdep());
        holder.tv_exp_arr.setText(runsttdata.get(position).getScharr());
        holder.tv_exp_dep.setText(runsttdata.get(position).getSchdep());
        holder.tv_distance.setText(String.valueOf(runsttdata.get(position).getDistance()+"KM"));
        holder.tv_day_run.setText(String.valueOf(runsttdata.get(position).getDay()));
        holder.tv_min.setText(String.valueOf(runsttdata.get(position).getLatemin()));
      }

    @Override
    public int getItemCount() {
        return runsttdata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView tv_run_iden,tv_run_stname,tv_exp_arr,tv_exp_dep,tv_day_run,tv_act_arr,tv_act_dep,tv_distance,tv_min;

        public MyViewHolder(final View itemView) {
            super(itemView);

            tv_run_iden = (TextView) itemView.findViewById(R.id.tv_run_iden);
            tv_run_stname = (TextView) itemView.findViewById(R.id.tv_run_stname);
            tv_exp_arr = (TextView) itemView.findViewById(R.id.tv_exp_arr);
            tv_exp_dep = (TextView) itemView.findViewById(R.id.tv_exp_dep);
            tv_day_run = (TextView) itemView.findViewById(R.id.tv_day_run);
            tv_act_arr = (TextView) itemView.findViewById(R.id.tv_act_arr);
            tv_act_dep = (TextView) itemView.findViewById(R.id.tv_act_dep);
            tv_distance = (TextView) itemView.findViewById(R.id.tv_distance);
            tv_min = (TextView) itemView.findViewById(R.id.tv_min);


        }
    }

}
