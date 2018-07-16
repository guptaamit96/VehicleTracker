package com.olaover.inmortaltech.ola.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocomplete;
import com.google.android.gms.maps.model.LatLng;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.retrofit.Constants;


import java.io.IOException;
import java.util.List;
import java.util.Locale;

import Map.AllStoreMap;
import Map.GPSTracker;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;
import static android.content.ContentValues.TAG;
import static android.content.Context.MODE_PRIVATE;


@SuppressLint("ValidFragment")
public class MapFragment extends Fragment{
    AllStoreMap mapFragment;
    int PLACE_AUTOCOMPLETE_REQUEST_CODE = 1;
    private TextView current_address_text_id,pick_up_Location;
    private LinearLayout ll_taxi_uber,ll_taxi_ola;
    private OlaTaxiDetails olataxidetails;
    private UberTaxiDetails ubertaxidetails;
    GPSTracker gpsTracker;
    String address;

    Context context;
    private SharedPreferences sharedPreferences;


    public MapFragment(Context context) {
        this.context=context;

        gpsTracker = new GPSTracker(context);
        if (gpsTracker.canGetLocation()) {

        } else gpsTracker.buildAlertMessageNoGps();
        setDefaultAddrss();
    }



   /*public MapFragment(Context applicationContext) {
        // Required empty public constructor
    }
    */


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_map2, container, false);





    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        initView( view );
        setUpActions();


        mapFragment= new AllStoreMap(context);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.map,mapFragment).commit();
    }




//for get id:
    private void initView(View view ) {
        current_address_text_id= view.findViewById(R.id.current_address_text_id);
        pick_up_Location= view .findViewById(R.id.pick_up_Location);
        ll_taxi_uber= view .findViewById(R.id.ll_taxi_uber);
        ll_taxi_ola= view .findViewById(R.id.ll_taxi_ola);






        //for instance
        olataxidetails=new OlaTaxiDetails();
        ubertaxidetails=new UberTaxiDetails();


    }





//perform action on id:
    private void setUpActions() {

        current_address_text_id.setText(address);



        current_address_text_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                currentAddress(PLACE_AUTOCOMPLETE_REQUEST_CODE);
            }
        });


       pick_up_Location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                currentAddress(13);

            }
        });
        current_address_text_id.setText(address);








        ll_taxi_ola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_taxi_ola.setBackgroundColor(getResources().getColor(R.color.redmain));
                getFragmentManager().beginTransaction().replace(R.id.fl_taxi_container,olataxidetails).commit();
                ll_taxi_uber.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });



        ll_taxi_uber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_taxi_uber.setBackgroundColor(getResources().getColor(R.color.redmain));
                getFragmentManager().beginTransaction().replace(R.id.fl_taxi_container,ubertaxidetails).commit();
                ll_taxi_ola.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });


        }



    private void currentAddress(int requestCode) {

        try {
            Intent intent =
                    new PlaceAutocomplete.IntentBuilder(PlaceAutocomplete.MODE_FULLSCREEN)
                            .build(getActivity());
            startActivityForResult(intent, requestCode);
        } catch (GooglePlayServicesRepairableException e) {
            // TODO: Handle the error.
        } catch (GooglePlayServicesNotAvailableException e) {
            // TODO: Handle the error.
        }
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PLACE_AUTOCOMPLETE_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                Place place = PlaceAutocomplete.getPlace(getActivity(), data);
                Log.i(TAG, "Place: " + place.getName());
                current_address_text_id.setText(place.getAddress());
                //changeAddress =(String)place.getAddress();
             /* double lat = place.geometry.location.lat(),
                      lng = place.geometry.location.lng();*/
//                final LatLng location = place.getLatLng();
//                LatLng latLng=place.getLatLng();
//            float droplat= (float)latLng.latitude;
//                float droplong=(float)latLng.longitude;
//                mapFragment.setMarker(place.getLatLng());
//
//
//                SharedPreferences sharedPreferences = PreferenceManager
//                        .getDefaultSharedPreferences(context);
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//
//                editor.putFloat("droplat", droplat);
//                editor.putFloat("droplong", droplong);
//                editor.apply();
//
//
//                SharedPreferences sharedPreferencesn = PreferenceManager
//                        .getDefaultSharedPreferences(context);
//                float droplata = sharedPreferencesn.getFloat("droplat", 12.344f);
//                float droplonga = sharedPreferencesn.getFloat("droplat", 12.344f);
//
//                Constants.DropLat=droplata;
//                Constants.DropLon=droplonga;



            } else if (resultCode == PlaceAutocomplete.RESULT_ERROR) {
                Status status = PlaceAutocomplete.getStatus(getActivity(), data);
                // TODO: Handle the error.
                Log.i(TAG, status.getStatusMessage());

            } else if (resultCode == RESULT_CANCELED) {
                // The user canceled the operation.
            }
        }else if (requestCode==13)
        {
            if (resultCode == RESULT_OK) {
                Place place = PlaceAutocomplete.getPlace(getActivity(), data);
                Log.i(TAG, "Place: " + place.getName());
                pick_up_Location.setText(place.getAddress());
                //changeDestination =(String)place.getAddress();

                final LatLng location = place.getLatLng();
                LatLng latLng=place.getLatLng();
                float droplat= (float)latLng.latitude;
                float droplong=(float)latLng.longitude;
                mapFragment.setMarker(place.getLatLng());


                SharedPreferences sharedPreferences = PreferenceManager
                        .getDefaultSharedPreferences(context);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putFloat("droplat", droplat);
                editor.putFloat("droplong", droplong);
                editor.apply();




                SharedPreferences sharedPreferencesn = PreferenceManager
                        .getDefaultSharedPreferences(context);
                float droplata = sharedPreferencesn.getFloat("droplat", 12.344f);
                float droplonga = sharedPreferencesn.getFloat("droplong", 12.344f);

                Constants.DropLat=droplata;
                Constants.DropLon=droplonga;


            } else if (resultCode == PlaceAutocomplete.RESULT_ERROR) {
                Status status = PlaceAutocomplete.getStatus(getActivity(), data);
                // TODO: Handle the error.
                Log.i(TAG, status.getStatusMessage());

            } else if (resultCode == RESULT_CANCELED) {
                // The user canceled the operation.
            }


        }


    }


    private void setDefaultAddrss() {

        Geocoder geocoder;
        List<Address> addresses = null;
        geocoder = new Geocoder(context, Locale.getDefault());

        try {
            addresses = geocoder.getFromLocation(gpsTracker.getLatitude(), gpsTracker.getLongitude(), 1); // Here 1 represent max location result to returned, by documents it recommended 1 to 5


         /*   Context context = getActivity();
            SharedPreferences sharedPref = context.getSharedPreferences(
                    getString(R.string.preference_file_key), Context.MODE_PRIVATE);*/


        } catch (IOException e) {
            e.printStackTrace();
        }

       double satartLat=gpsTracker.getLatitude();
        double startlong=gpsTracker.getLongitude();




        float latitude= (float) gpsTracker.getLatitude();
        float longitude= (float) gpsTracker.getLongitude();
        //   String e = email.getText().toString();
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();;

        editor.putFloat("latitude", latitude);
        editor.putFloat("longitude", longitude);
        editor.apply();


        SharedPreferences sharedPreferencesn = PreferenceManager
                .getDefaultSharedPreferences(context);
        float lat = sharedPreferencesn.getFloat("latitude", 12.344f);
        float lon = sharedPreferencesn.getFloat("longitude", 12.344f);
        Constants.LAT=lat;
        Constants.LON=lon;




      address = addresses.get(0).getAddressLine(0); // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
        String city = addresses.get(0).getLocality();
        String state = addresses.get(0).getAdminArea();
        String country = addresses.get(0).getCountryName();
        String postalCode = addresses.get(0).getPostalCode();
        String knownName = addresses.get(0).getFeatureName(); // Only if available else return NULL
        // mapFragment.picUpAddress(address);
    }




}





