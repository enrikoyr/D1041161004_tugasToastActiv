package com.example.d1041161004_tugastoastactiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView text;
    String string;

    TextView num;
    Button btninc;
    Button btndec;
    int nim = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        text = findViewById(R.id.welcome);
        string = getIntent().getExtras().getString("Value");
        text.setText(string);

        num = findViewById(R.id.num);
        btninc = findViewById(R.id.btninc);
        btndec = findViewById(R.id.btndec);

        num.setText("4");

        btninc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nim++;
                num.setText(String.valueOf(nim));
            }
        });
        
        btndec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nim--;
                num.setText(String.valueOf(nim));
            }
        });
    }
}
