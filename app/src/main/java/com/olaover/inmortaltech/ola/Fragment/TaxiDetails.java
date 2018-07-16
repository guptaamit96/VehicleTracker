package com.olaover.inmortaltech.ola.Fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.olaover.inmortaltech.ola.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TaxiDetails extends Fragment {
    private TextView tv_taxiola_viw,tv_taxiuber_viw;
    private LinearLayout id_taxi_bothitem;

    View view;


    private OlaTaxiDetails olataxidetails;
    private UberTaxiDetails ubertaxidetails;


    public TaxiDetails() {
        // Required empty public constructor

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_taxi_details, container, false);


        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        initView();
        setUpActions();
    }



    private void initView() {

        tv_taxiola_viw=view.findViewById(R.id.tv_taxiola_viw);
        tv_taxiuber_viw=view.findViewById(R.id.tv_taxiuber_viw);
        id_taxi_bothitem=view.findViewById(R.id.id_taxi_bothitem);





        //for fragment instance

        olataxidetails=new OlaTaxiDetails();
        ubertaxidetails=new UberTaxiDetails();

    }




    private void setUpActions() {


        tv_taxiuber_viw.setTextColor(getResources().getColor(R.color.colorPrimary));
        getFragmentManager().beginTransaction().replace(R.id.fl_taxi_container,ubertaxidetails).commit();


        tv_taxiola_viw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_taxiola_viw.setTextColor(getResources().getColor(R.color.colorPrimary));
                getFragmentManager().beginTransaction().replace(R.id.fl_taxi_container,olataxidetails).commit();;
                tv_taxiuber_viw.setTextColor(getResources().getColor(R.color.black));

                }
        });





        tv_taxiuber_viw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_taxiuber_viw.setTextColor(getResources().getColor(R.color.colorPrimary));
                getFragmentManager().beginTransaction().replace(R.id.fl_taxi_container,ubertaxidetails).commit();
                tv_taxiola_viw.setTextColor(getResources().getColor(R.color.black));


                }
        });





    }


}
