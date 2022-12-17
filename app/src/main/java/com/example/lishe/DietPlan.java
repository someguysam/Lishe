package com.example.lishe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DietPlan extends AppCompatActivity {
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_plan);
        text = findViewById(R.id.asubuhiparagraph);

        //Edit the text in green to add or remove something from the paragraph in Diet plan
        text.setText("MFANO WA MPANGILIO WA MFANO MLO KAMILI  KWA SIKU KWA MTU MZIMA\n\n" +
                "KIFUNGUA KINYWA\n" +
                "		Chai ya rangi au ya maziwa yenye sukari kidogo.\n" +
                "	   Mkate uliopakwa siagi, jamu au parachichi au aina yoyote ya kitafunwa kinachoweza kupatikana kama vile mhogo uliochemshwa, maandazi n.k.\n" +
                "		Mboga mboga  kama vile karoti au matango\n" +
                "	   Aina yoyote ile ya matunda mfano kipande cha papai\n" +
                "	   Juisi yoyote ya matunda inaweza kutumika\n" +
                "	   Maji (safi na salama)\n\n" +

                "Asusa\n" +
                "Kabla ya chakula cha mchana unaweza kupata asusa/kitafunwa kama utapendelea. Vitafunwa ni pamoja na matunda,  kipande cha mhogo au viazi vitamu, mbogamboga kama vile matango, karoti; karanga n.k.\n\n" +

                "Chakula cha mchana\n"+
"	Ugali/ndizi\n" +
"	Maharagwe/nyama/samaki\n" +
"	Mboga za majani zilizowekwa karanga au aina nyingine ya mafuta\n" +
"	Kipande cha tunda kama vile papai, nanasi au embe\n" +
"	Maji ya kunywa (yaliyochemshwa).\n\n" +

                "Asusa ya adhuhuri\n" +
        "Kikombe cha maziwa/juisi ya matunda  na karanga, kipande cha mhogo au ndizi ya kuchoma.\n\n" +

        "Chakula cha jioni\n" +
"	Wali na maharagwe\n" +
"	Kipande cha samaki au dagaa\n" +
"	Kachumbari ya karoti na matango\n" +
"	Ndizi mbivu/ chungwa\n" +
"	Maji ya kunywa (yaliyochemshwa\n\n\n" + "Kumbuka: Kutumia vyakula vinavyopatikana katika mazingira unayoishi");

        String[] para = text.getText().toString().split("\r\r ");
        Toast.makeText(DietPlan.this, "" + para.length, Toast.LENGTH_LONG).show();
    }
}