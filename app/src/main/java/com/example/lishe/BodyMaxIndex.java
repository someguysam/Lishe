package com.example.lishe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import java.text.DecimalFormat;

public class BodyMaxIndex extends AppCompatActivity {
    private Button button_calculatebmi;
    private EditText edit_uzito, edit_urefu, edit_bmiyako, edit_ushauri;
    private RadioGroup radio_group;
    private static final DecimalFormat decfor = new DecimalFormat("0.00");;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_max_index);

        /*CODE FOR GENDER RADIO BUTTON*/
        radio_group = (RadioGroup)findViewById(R.id.radioGroup);
        button_calculatebmi = (Button)findViewById(R.id.calculatebmi);
        edit_uzito = (EditText)findViewById(R.id.uzitowako);
        edit_urefu = (EditText)findViewById(R.id.urefuwako);
        edit_bmiyako = (EditText)findViewById(R.id.bmi_yako_ni);
        edit_ushauri = (EditText)findViewById(R.id.ushauri);

        radio_group.clearCheck();

        radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override

                    // The flow will come here when
                    // any of the radio buttons in the radioGroup
                    // has been clicked

                    // Check which radio button has been clicked
                    public void onCheckedChanged(RadioGroup group,
                                                 int checkedId)
                    {

                        // Get the selected Radio Button
                        RadioButton
                                radioButton
                                = (RadioButton)group
                                .findViewById(checkedId);
                    }
                });


        /*CODE FOR BMI CALCULATIO BUTTON BUTTON*/
        button_calculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Test to see if Gender has been selected
                int selectedId = radio_group.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(BodyMaxIndex.this,
                            "No gender has been selected",
                            Toast.LENGTH_SHORT)
                            .show();
                }
                else {

                    RadioButton radioButton
                            = (RadioButton)radio_group
                            .findViewById(selectedId);

                    // Now display the value of selected item
                    // by the Toast message
                    Toast.makeText(BodyMaxIndex.this,
                            radioButton.getText(),
                            Toast.LENGTH_SHORT)
                            .show();
                }

                // Test to see if the fields of weight and height have been filled
                if(edit_uzito.getText().toString().equals("")||edit_urefu.getText().toString().equals(""))
                {
                    Toast.makeText(BodyMaxIndex.this,"Please enter some details", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    // This is the BMI formula
                    edit_uzito.getText().toString();
                    edit_urefu.getText().toString();
                    double e1 = Float.valueOf(edit_uzito.getText().toString());
                    double e2 = Float.valueOf(edit_urefu.getText().toString());
                    double e3 = e1 / (e2 * e2);

                    // An if-else loop to give the user advice based on the results of the BMI calculation
                    if(e3<=16.0)
                    {
                        edit_ushauri.setText("UTAPIA MLO MKALI:\n Ongeza kiasi cha chakula na chunguza afya");
                    }
                    else if(e3<=18.4)
                    {
                        edit_ushauri.setText("UTAPIA MLO WA KADIRI:\n Ongeza kiasi cha chakula na chunguza afya");
                    }
                    else if(e3<=24.9)
                    {
                        edit_ushauri.setText("HALI NZURI YA LISHE:\n Zingatia ulaji unaofaa na ushughulishe mwili");
                    }
                    else if(e3<=29.9)
                    {
                        edit_ushauri.setText("UZITO ULIOZIDI:\n Punguza kiasi chakula unachokula na ushughulishe mwili");
                    }
                    else if(e3>=30)
                    {
                        edit_ushauri.setText("UNENE:\n Punguza kiasi chakula unachokula na ushughulishe mwili");
                    }
                    else
                    {
                        edit_ushauri.setText("Ingiza urefu na uzito");
                    }
                    // Fetching the reult of the BMI calculation and converting into a string
                    edit_bmiyako.setText(String.valueOf(decfor.format(e3)));
                }

            }
        });
    }
}