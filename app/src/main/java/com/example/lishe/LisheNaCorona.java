package com.example.lishe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class LisheNaCorona extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lishe_na_corona);

        ViewPager viewPager = findViewById(R.id.lisheNaCoronaViewPager);

        CoronaNaLisheAdapter adapter = new CoronaNaLisheAdapter(this);
        viewPager.setAdapter(adapter);

    }
}