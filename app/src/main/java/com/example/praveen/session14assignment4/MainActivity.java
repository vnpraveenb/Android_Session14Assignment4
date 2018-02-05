package com.example.praveen.session14assignment4;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            //Request Permission to access Camera
            if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(MainActivity.this,new String[] {Manifest.permission.CAMERA},1);
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            // Request Permission to use Call Phone
            if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(MainActivity.this,new String[] {Manifest.permission.CALL_PHONE},2);
            }
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            // Request Permission to send SMS
            if (checkSelfPermission(Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(MainActivity.this,new String[] {Manifest.permission.SEND_SMS},3);
            }
        }
    }

}
