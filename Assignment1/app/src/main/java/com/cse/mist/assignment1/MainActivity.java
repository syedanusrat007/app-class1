package com.cse.mist.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


   private RadioGroup sex;
    private RadioButton item;
    private Button done;
    private ToggleButton on;
    private Switch switch1;
    private CheckBox java,c;
    private RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sex = (RadioGroup) findViewById(R.id.etRadiogroup);
        java = (CheckBox) findViewById(R.id.java);
        c = (CheckBox) findViewById(R.id.c);
        done = (Button) findViewById(R.id.etDone);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectid = sex.getCheckedRadioButtonId();
                item = (RadioButton) findViewById(selectid);
                String s1 = item.getText().toString();
                if (java.isChecked()) {
                    Toast.makeText(MainActivity.this, "selected gender : " + s1 + "java", Toast.LENGTH_LONG).show();
                }
                if (c.isChecked()) {
                    Toast.makeText(MainActivity.this, "selected gender : " + s1 + "c++", Toast.LENGTH_LONG).show();
                }
            }


        });

    }}