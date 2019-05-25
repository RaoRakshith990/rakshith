package com.example.smartseller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Passwordc extends AppCompatActivity {
    EditText createpass,confirmpass;
    Button finishid;
    CheckBox tickbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwordc);
        createpass=findViewById(R.id.crepassid);
        confirmpass=findViewById(R.id.confpassid);
        tickbox=findViewById(R.id.tickid);
      finishid=findViewById(R.id.finishid);
     finishid.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent=new Intent(getApplicationContext(),Login.class);
             startActivity(intent);
         }
     });


    }
}
