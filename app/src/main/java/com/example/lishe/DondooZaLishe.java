package com.example.lishe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DondooZaLishe extends AppCompatActivity {
    public Button button_darasalalishe;
    public Button button_maswalinamajibu;
    public Button button_vipeperushi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dondoo_za_lishe);

        /*Code for Darasa la lishe Button*/
        button_darasalalishe = (Button) findViewById(R.id.imageButtonVideos);

        button_darasalalishe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DondooZaLishe.this,DarasaVideos.class);
                startActivity(intent);
            }
        });

        /*Code for Maswali na majibu Button*/
        button_maswalinamajibu = (Button) findViewById(R.id.imageButtonQuestionsandAnswers);

        button_maswalinamajibu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DondooZaLishe.this,MaswaliNaMajibu.class);
                startActivity(intent);
            }
        });

        /*Code for Vipeperushi Button*/
        button_vipeperushi = (Button) findViewById(R.id.imageButtonPrintMaterials);

        button_vipeperushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DondooZaLishe.this,Vipeperushi.class);
                startActivity(intent);
            }
        });
    }
}