package com.example.farmerhelperapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Farmer Helper - REG NO: 23ITXXX");
        setContentView(R.layout.activity_main);

        Spinner crop = findViewById(R.id.spCrop);
        String[] crops = {"Paddy","Wheat","Cotton","Maize"};

        crop.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, crops));
    }
}
