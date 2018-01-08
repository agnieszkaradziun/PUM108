package com.example.agnieszka.laboratoriumpum2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Druga_aktywnosc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga_aktywnosc2);



        TextView listy = (TextView) findViewById(R.id.lista);

        Bundle mikoloaj = getIntent().getExtras();

        String przekazanytekst = mikoloaj.getString("tekst");
        listy.setText(przekazanytekst);


    }
}
