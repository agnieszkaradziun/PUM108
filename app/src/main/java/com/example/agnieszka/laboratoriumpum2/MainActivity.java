package com.example.agnieszka.laboratoriumpum2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView miasta;
    TextView temp;
    TextView komentarz;
    EditText tekst;
    Button zmien;
    Button pokaz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     miasta = (TextView) findViewById(R.id.miasto);
     temp = (TextView)findViewById(R.id.temp);
     komentarz = (TextView) findViewById(R.id.komentarz);
     tekst = (EditText)findViewById(R.id.tekst);
         zmien = (Button)findViewById(R.id.zmien);
         pokaz = (Button) findViewById(R.id.pokaz);



        zmien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                miasta.setText(tekst.getText().toString());
            }
        });


        pokaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpisanytekst =miasta.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("tekst",wpisanytekst);
                Intent intent = new Intent(getApplicationContext(), Druga_aktywnosc.class);
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });












    }
}
