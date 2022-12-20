package com.example.lishe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DarasaVideos extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darasa_videos);

        listView = (ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add(getString(R.string.mlo_kamili_animation));
        arrayList.add(getString(R.string.mlo_kamili_kwaya));
        arrayList.add(getString(R.string.mlo_kamili_singeli));
        arrayList.add(getString(R.string.umuhimu_wa_tangawizi));
        arrayList.add(getString(R.string.umuhimu_wa_matunda));

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //clicked Mlo Kamili (Animation)

                    startActivity(new Intent(DarasaVideos.this,MloKamiliAnimation.class));

                }else if(position==1){
                    //clicked Mlo Kamili Kwaya

                    startActivity(new Intent(DarasaVideos.this,MloKamiliKwaya.class));

                }else if(position==2){
                    //clicked Mlo Kamili Singeli

                    startActivity(new Intent(DarasaVideos.this,MloKamiliSingeli.class));

                }else if(position==3){
                    // clicked Umuhimu wa Tangawizi

                    startActivity(new Intent(DarasaVideos.this,UmuhimuTangawizi.class));

                }else if(position==4){
                    // clicked Umuhimu wa Matunda

                    startActivity(new Intent(DarasaVideos.this,UmuhimuMatunda.class));

                }
            }
        });

    }
}