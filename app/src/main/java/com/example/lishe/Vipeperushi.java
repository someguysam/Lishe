package com.example.lishe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.AdapterView;
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

        arrayList3.add(getString(R.string.makundi_ya_chakula));
        arrayList3.add(getString(R.string.ulaji_unaofaa));
        arrayList3.add(getString(R.string.unyonyeshaji_na_covid19));


        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList3);
        listViewVipeperushi.setAdapter(arrayAdapter3);
        listViewVipeperushi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //clicked Nutrition and COVID-19


                    DownloadManager mManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    DownloadManager.Request mRqRequest = new DownloadManager.Request(
                            Uri.parse("https://drive.google.com/file/d/1EpBNOoPK7zCBiU-wti8d2yjZDOn1AkKe/view?usp=share_link"));
                    mRqRequest.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    mRqRequest.setDescription("Food Groups");
                    String title = URLUtil.guessFileName(String.valueOf(mRqRequest), null, null);
                    mRqRequest.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
                    mManager.enqueue(mRqRequest);

                }else if(position==1){
                    //clicked Mlo Kamili Kwaya

                    DownloadManager mManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    DownloadManager.Request mRqRequest = new DownloadManager.Request(
                            Uri.parse("https://drive.google.com/file/d/1QBtAnJYLGTNEhRgrtnxoP9yGHYyPeprM/view?usp=share_link"));
                    mRqRequest.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    mRqRequest.setDescription("Balanced Diet");
                    String title = URLUtil.guessFileName(String.valueOf(mRqRequest), null, null);
                    mRqRequest.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
                    mManager.enqueue(mRqRequest);

                }else if(position==2){
                    //clicked Mlo Kamili Singeli

                    DownloadManager mManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    DownloadManager.Request mRqRequest = new DownloadManager.Request(
                            Uri.parse("https://drive.google.com/file/d/17EMuQAZhGj38ydN1iWnruu-jE3LP5-kh/view?usp=share_link"));
                    mRqRequest.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    mRqRequest.setDescription("Breastfeeding and COVID-19");
                    String title = URLUtil.guessFileName(String.valueOf(mRqRequest), null, null);
                    mRqRequest.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
                    mManager.enqueue(mRqRequest);

                }
            }
        });

    }
}