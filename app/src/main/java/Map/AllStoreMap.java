package Map;


import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;


import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.olaover.inmortaltech.ola.R;

import java.io.IOException;
import java.util.List;
import java.util.Locale;


@SuppressLint("ValidFragment")
public class AllStoreMap extends SupportMapFragment implements OnMapReadyCallback {

    public GoogleMap mMap;
    Context context;
    //SupportPlaceAutocompleteFragment autocompleteFragment;
    MapFragment mapFragment;
    GPSTracker gpsTracker;

    @SuppressLint("ValidFragment")
    public AllStoreMap(Context context) {
        this.context = context;

        gpsTracker = new GPSTracker(context);
        if (gpsTracker.canGetLocation()) {

        } else gpsTracker.buildAlertMessageNoGps();


        setDefaultAddrss();

    }

    /*@SuppressLint("ValidFragment")
    public AllStoreMap(MapFragment mapFragment) {

        this.mapFragment = mapFragment;

        gpsTracker = new GPSTracker(context);
        if (gpsTracker.canGetLocation()) {

        } else gpsTracker.buildAlertMessageNoGps();


        setDefaultAddrss();

    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.getUiSettings().setCompassEnabled(false);
        mMap.getUiSettings().setZoomControlsEnabled(false);
        mMap.isMyLocationEnabled();
        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);
        mMap.isTrafficEnabled();





//        currMarker = mMap.addMarker(new MarkerOptions()
//                .position(new LatLng(gps.getLatitude(),gps.getLongitude()))
//                .icon(BitmapDescriptorFactory.fromResource(R.drawable.my_loc))
//        );

       /* LatLng currentLocation =new LatLng(28.535517,  77.39102);*/
        LatLng currentLocation =new LatLng(gpsTracker.getLatitude(), gpsTracker.getLongitude());

setMarker(currentLocation);



    }


   public void  setMarker(LatLng latLng) {
mMap.clear();
       mMap.addMarker(new MarkerOptions().position(latLng).title("inmortal")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.greenlocation12));

       mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 12.0f));



   }








    private void setDefaultAddrss() {

        Geocoder geocoder;
        List<Address> addresses = null;
        geocoder = new Geocoder(context, Locale.getDefault());

        try {
            addresses = geocoder.getFromLocation(20.80, 20.57, 1); // Here 1 represent max location result to returned, by documents it recommended 1 to 5
        } catch (IOException e) {
            e.printStackTrace();
        }

        String address = addresses.get(0).getAddressLine(0); // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
        String city = addresses.get(0).getLocality();
        String state = addresses.get(0).getAdminArea();
        String country = addresses.get(0).getCountryName();
        String postalCode = addresses.get(0).getPostalCode();
        String knownName = addresses.get(0).getFeatureName(); // Only if available else return NULL
      // mapFragment.picUpAddress(address);
    }




}