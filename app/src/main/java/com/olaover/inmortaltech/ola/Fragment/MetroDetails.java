package com.olaover.inmortaltech.ola.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.olaover.inmortaltech.ola.Adapter.MetroAdapter;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.MetroResponce;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MetroDetails extends Fragment {
    View view;
    private MetroAdapter metroAdapter;
    ArrayList<MetroResponce> metro_data = new ArrayList<>();
    private RecyclerView rv_metro;


    public MetroDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_metro_detaills, container, false);




        rv_metro = (RecyclerView) view.findViewById(R.id.rv_metro);
        rv_metro.setLayoutManager(new LinearLayoutManager(getContext()));

        MetroResponce responce = new MetroResponce();

        for (int i = 0; i < 20; i++) {
            responce.setStation_name("Noida City Center");
            responce.setKilo_meter("5 km Away");
            responce.setElevated("Elavated");


            metro_data.add(responce);

        }

        metroAdapter = new MetroAdapter(getContext(), metro_data);

        rv_metro.setAdapter(metroAdapter);

        return view;
    }

}
