package com.olaover.inmortaltech.ola.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.BusResponse;
import java.util.List;

public class BusDetailsAdapter extends RecyclerView.Adapter<BusDetailsAdapter.MyViewHolder> {
  List<BusResponse.RoutesBean> busdata;
    Context context;

    public BusDetailsAdapter(Context context, List<BusResponse.RoutesBean> busdata) {
        this.busdata=busdata;
        this.context=context;
    }


    @Override
    public BusDetailsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemtype = LayoutInflater.from(parent.getContext()).inflate(R.layout.bus_list_layout, parent, false);
        return new BusDetailsAdapter.MyViewHolder(itemtype);
    }


    @Override
    public void onBindViewHolder(BusDetailsAdapter.MyViewHolder holder, int position) {

        holder.tv_source_bus.setText(busdata.get(position).getLegs().get(0).getStart_address());
        holder.tv_destination.setText(busdata.get(position).getLegs().get(0).getEnd_address());
        holder.tv_arr_time.setText(busdata.get(position).getLegs().get(0).getArrival_time().getText());
        holder.tv_dep_time.setText(busdata.get(position).getLegs().get(0).getDeparture_time().getText());
        holder.tv_num_stop.setText(String.valueOf(busdata.get(position).getLegs().get(0).getSteps().get(0).getTransit_details().getNum_stops()));
        holder.tv_bus_name.setText(busdata.get(position).getLegs().get(0).getSteps().get(0).getTransit_details().getLine().getVehicle().getName());
        //holder.tv_bus_num.setText(busdata.get(position).getLegs().get(0).getSteps().get(0).getTransit_details().getLine());
        holder.tv_distance.setText(String.valueOf(busdata.get(position).getLegs().get(0).getSteps().get(0).getDistance().getText()));
        holder.tv_time.setText(busdata.get(position).getLegs().get(0).getSteps().get(0).getDuration().getText());
    }

    @Override
    public int getItemCount() {
        return busdata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_source_bus,tv_destination,tv_bus_name,tv_bus_num,tv_arr_time,tv_dep_time,tv_num_stop,
                tv_distance,tv_time;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_source_bus = (TextView) itemView.findViewById(R.id.tv_source_bus);
            tv_destination = (TextView) itemView.findViewById(R.id.tv_destination);
            tv_bus_name = (TextView) itemView.findViewById(R.id.tv_bus_name);
            tv_bus_num = (TextView) itemView.findViewById(R.id.tv_bus_num);
            tv_arr_time = (TextView) itemView.findViewById(R.id.tv_arr_time);
            tv_dep_time = (TextView) itemView.findViewById(R.id.tv_dep_time);
            tv_num_stop = (TextView) itemView.findViewById(R.id.tv_num_stop);
            tv_distance = (TextView) itemView.findViewById(R.id.tv_distance);
            tv_time = (TextView) itemView.findViewById(R.id.tv_time);


        }
    }

}
