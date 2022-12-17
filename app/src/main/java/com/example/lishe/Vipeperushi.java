package com.example.lishe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Vipeperushi extends AppCompatActivity {
    ListView listViewVipeperushi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vipeperushi);

        listViewVipeperushi = (ListView)findViewById(R.id.listview3);

        ArrayList<String> arrayList3=new ArrayList<>();

        arrayList3.add("Episode 1");
        arrayList3.add("Episode 2");
        arrayList3.add("Episode 3");
        arrayList3.add("Episode 4");
        arrayList3.add("Episode 5");

        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList3);
        listViewVipeperushi.setAdapter(arrayAdapter3);
    }
}