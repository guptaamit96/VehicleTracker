package com.olaover.inmortaltech.ola.Adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.LoginInner;
import com.olaover.inmortaltech.ola.beans.NewsResponse;
import com.olaover.inmortaltech.ola.beans.TaxiOlaInner;
import com.olaover.inmortaltech.ola.beans.TaxiOlaResponse;
import com.olaover.inmortaltech.ola.beans.UberTimeInner;

import java.util.ArrayList;
import java.util.List;

public class TaxiOlaAdapter<s> extends RecyclerView.Adapter<TaxiOlaAdapter.MyViewHolder> {

    List<TaxiOlaResponse.CategoriesBean> olaTaxiData;
    List<TaxiOlaResponse.CategoriesBean.FareBreakupBean> olaTaxiFareData;
    Context context;



    public TaxiOlaAdapter(FragmentActivity activity, List<TaxiOlaResponse.CategoriesBean> olaTaxiData,List<TaxiOlaResponse.CategoriesBean.FareBreakupBean>olaTaxiFareData) {
            this.context=activity;
            this.olaTaxiData=olaTaxiData;
            this.olaTaxiFareData=olaTaxiFareData;
    }



    @Override
    public TaxiOlaAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemtype = LayoutInflater.from(parent.getContext()).inflate(R.layout.taxi_ola_list_layout, parent, false);
        return new TaxiOlaAdapter.MyViewHolder(itemtype);
    }

    @Override
    public void onBindViewHolder(TaxiOlaAdapter.MyViewHolder holder, int position) {

        if (olaTaxiData!=null && olaTaxiData.size()>0) {
            holder.tv_taxiola_dis.setText(olaTaxiData.get(position).getDisplay_name());

            holder.tv_txola_fare.setText("rs " + olaTaxiData.get(position).getFare_breakup().get(0).getMinimum_fare() + "-" + olaTaxiData.get(position).getFare_breakup().get(0).getBase_fare());

            holder.tv_txola_time.setText(olaTaxiData.get(position).getFare_breakup().get(0).getMinimum_time()+" minute");

        }



    }

    @Override
    public int getItemCount() {
        return olaTaxiData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_txola_fare,tv_txola_time,tv_taxiola_dis;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_txola_fare = (TextView) itemView.findViewById(R.id.tv_txola_fare);
            tv_txola_time = (TextView) itemView.findViewById(R.id.tv_txola_time);
            tv_taxiola_dis = (TextView) itemView.findViewById(R.id.tv_taxiola_dis);



        }
    }
}
