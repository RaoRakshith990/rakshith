package com.example.smartseller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class Repairing extends AppCompatActivity {
    Spinner Repairingcateg,repairingparts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repairing);
        Repairingcateg=findViewById(R.id.repairdrop);
        repairingparts=findViewById(R.id.partsrepid);
    }
}
