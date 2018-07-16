package com.olaover.inmortaltech.ola.Activity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.olaover.inmortaltech.ola.Fragment.MapFragment;
import com.olaover.inmortaltech.ola.R;

public class MainActivity extends AppCompatActivity  {
    private Button ideNowbtnr;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  if (checkPermission()){}
        else requestPermission();*/


        switchFragment(new MapFragment(getApplicationContext()), false);


        inItView();
        setUpActions();




    }


    private void setUpActions() {


    }

    private void inItView() {

    }


    public void switchFragment(Fragment fragment, boolean isBack) {
        if (isBack)
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).addToBackStack(null).commitAllowingStateLoss();
        else
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commitAllowingStateLoss();
    }

    /*private boolean checkPermission() {
        int result = ContextCompat.checkSelfPermission(this, Manifest.permission);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    private void requestPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)) {
            Toast.makeText(this, "GPS permission allows us to access location data. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACC}, 123);
        }
    }*/

//    @Override
//    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
//        switch (requestCode) {//            case PERMISSION_REQUEST_CODE://                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {//////                } else {////                }//                break;        }    }Sent on:6:23 pm
//        }
//    }
//
//    @Override
//    public void onNavigationItemReselected(@NonNull MenuItem item) {
//        Fragment fragment = null;
//
//
//        switch (item.getItemId()) {
//            case R.id.metro_img: {
//                switchFragment(new MetroDetails(), true);
//                break;
//            }
//            case R.id.taxi_img: {
//                switchFragment(new TaxiDetails(), true);
//                break;
//            }
//            case R.id.bus_img: {
//                switchFragment(new BusDetails(), true);
//                break;
//            }
//            case R.id.auto_img: {
//                switchFragment(new AutoDetails(), true);
//                break;
//            }
//
//            default: {
//                switchFragment(new MetroDetails(), true);
//            }
//
//        }
//    }








}


