package com.example.smartseller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

public class Maintenance extends AppCompatActivity {
    Spinner category,maintenanaceparts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);
        category=findViewById(R.id.category);
        maintenanaceparts=findViewById(R.id.maintpart);
    }
}
