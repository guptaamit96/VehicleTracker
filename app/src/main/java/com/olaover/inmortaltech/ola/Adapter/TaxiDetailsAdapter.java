package com.olaover.inmortaltech.ola.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.olaover.inmortaltech.ola.R;

public class TaxiDetailsAdapter extends RecyclerView.Adapter<TaxiDetailsAdapter.ViewHolder> {



@NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View itemView = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.fragment_taxi_details,parent,false);
    return new TaxiDetailsAdapter.ViewHolder(itemView);
}

    @Override
    public void onBindViewHolder(@NonNull TaxiDetailsAdapter.ViewHolder holder, int position) {

    }




    @Override
    public int getItemCount() {
        return 1;
    }

static class ViewHolder extends RecyclerView.ViewHolder {

    public ViewHolder(View itemView) {
        super(itemView);
    }
}


}

