package com.olaover.inmortaltech.ola.Activity;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.olaover.inmortaltech.ola.R;

public class Splash extends AppCompatActivity {

    private final int SPLASH_DISPLAY_TIMER = 2000;
    private String device_token = "";
    private static final int PERMISSION_REQUEST_CODE = 12;



    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       // checkPermissions();





        if(checkPermissions()) {

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {

                    Intent mainIntent = new Intent(Splash.this, HomePage.class);
                    startActivity(mainIntent);
                    finish();

                }
            }, SPLASH_DISPLAY_TIMER);
        }

}



    @RequiresApi(api = Build.VERSION_CODES.M)
    private boolean checkPermissions() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION,}, PERMISSION_REQUEST_CODE);
            return false;
        } else {
            return true;
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            switch (requestCode) {
                case PERMISSION_REQUEST_CODE:
                    try {
                        startActivity(new Intent(Splash.this, HomePage.class));
                        finish();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
        } else {
           Toast.makeText(this, "Please accept permissions due to security purpose", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.fromParts("package", getPackageName(), null));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();

            checkPermissions();
        }


    }

}

    


