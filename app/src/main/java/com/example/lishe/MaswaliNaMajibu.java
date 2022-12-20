package com.example.lishe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MaswaliNaMajibu extends AppCompatActivity {

    ListView listViewMaswalinaMajibu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maswali_na_majibu);

        listViewMaswalinaMajibu = (ListView)findViewById(R.id.listview2);

        ArrayList<String> arrayList2=new ArrayList<>();

        arrayList2.add(getString(R.string.ulaji_unaofaa_));
        arrayList2.add(getString(R.string.nutrition_and_covid19));
        //arrayList2.add("Episode 3");
        //arrayList2.add("Episode 4");
        //arrayList2.add("Episode 5");

        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList2);
        listViewMaswalinaMajibu.setAdapter(arrayAdapter2);

        listViewMaswalinaMajibu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //clicked Mlo Kamili (Animation)

                    startActivity(new Intent(MaswaliNaMajibu.this,UlajiUnaofaa.class));

                }else if(position==1){
                    //clicked Mlo Kamili Kwaya

                    startActivity(new Intent(MaswaliNaMajibu.this,LisheNaCorona.class));

                }else if(position==2){
                    //clicked Mlo Kamili Singeli

                    //startActivity(new Intent(MaswaliNaMajibu.this,MloKamiliSingeli.class));

                }else if(position==3){
                    // clicked Umuhimu wa Tangawizi

                    //startActivity(new Intent(MaswaliNaMajibu.this,UmuhimuTangawizi.class));

                }else if(position==4){
                    // clicked Umuhimu wa Matunda

                    //startActivity(new Intent(MaswaliNaMajibu.this,UmuhimuMatunda.class));

                }
            }
        });

    }
}