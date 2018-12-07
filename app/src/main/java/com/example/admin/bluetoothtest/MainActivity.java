package com.example.admin.bluetoothtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.admin.bluetoothtest.client.ClientActivity;

public class MainActivity extends AppCompatActivity {
    private Button ClientButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ClientButton=findViewById(R.id.button_client);
        ClientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ClientActivity.class);
                startActivity(intent);
            }
        });
    }
}
