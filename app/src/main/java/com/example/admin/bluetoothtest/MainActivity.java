package com.example.admin.bluetoothtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    private CheckBox bluetoothCheckbox;
    private RecyclerView bluetoothListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bluetoothCheckbox=findViewById(R.id.bluetooth_checkBox);
        bluetoothListView=findViewById(R.id.bluetooth_listView);
    }
}
