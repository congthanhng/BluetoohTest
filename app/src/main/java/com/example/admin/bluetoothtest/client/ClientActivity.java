package com.example.admin.bluetoothtest.client;

import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.admin.bluetoothtest.R;

public class ClientActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);
        setTitle("ClientActivity");
    }

    @Override
    protected void onResume() {
        if(!getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE))
        {
            Toast.makeText(this,"fail",Toast.LENGTH_SHORT).show();
            finish();
        }
        else {Toast.makeText(this,"ok",Toast.LENGTH_SHORT).show();}
        super.onResume();
    }
}
