package com.example.lishe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    public Button button;
    private ImageView change_language;
    private String LANG_CURRENT = "en";
    public Button button_bmi;
    public Button button_dietplan;
    SliderView sliderView;
    int[] images = {R.drawable.maswali_na_majibu_01,
            R.drawable.maswali_na_majibu_01,
            R.drawable.maswali_na_majibu_03,
            R.drawable.maswali_na_majibu_04,
            R.drawable.maswali_na_majibu_05,
            R.drawable.maswali_na_majibu_06};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*CODE FOR IMAGE SLIDER*/
        /*Code for Image Slider*/
        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        /*CODE FOR BUTTONS*/

        /*Code for Language change Button*/
        change_language = (ImageView) findViewById(R.id.imageButtonLanguage) ;
        change_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (LANG_CURRENT.equals("en")) {
                    changeLang(MainActivity.this, "sw");
                } else {
                    changeLang(MainActivity.this, "en");
                }
                finish();
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });

        /*Code for Dondoo Button*/
        button = (Button) findViewById(R.id.imageButtonNutritionFacts);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DondooZaLishe.class);
                startActivity(intent);
            }
        });

        /*Code for BMI Button*/
        button_bmi = (Button) findViewById(R.id.imageButtonBMIcalculator);

        button_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BodyMaxIndex.class);
                startActivity(intent);
            }
        });

        /*Code for Diet Plan Button*/
        button_dietplan = (Button) findViewById(R.id.imageButtonDietPlan);

        button_dietplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DietPlan.class);
                startActivity(intent);
            }
        });

    }
    public void changeLang(Context context, String lang) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Language", lang);
        editor.apply();
    }

    @Override
    protected void attachBaseContext(Context newBase) {

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(newBase);
        LANG_CURRENT = preferences.getString("Language", "en");

        super.attachBaseContext(MyContextWrapper.wrap(newBase, LANG_CURRENT));
    }

}