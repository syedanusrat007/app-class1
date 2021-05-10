package com.cse.mist.myfirstproject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private EditText etPhonenumber,etEmail,etLevel,etUniversity,etName,etPassword;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        iniui();
    }

    private void iniui() {
        etLevel=(EditText)findViewById(R.id.etLevel);
        etName=(EditText)findViewById(R.id.etName);
        etPhonenumber=(EditText)findViewById(R.id.etPhonenumber);
        etEmail=(EditText)findViewById(R.id.etEmail);
        etUniversity=(EditText)findViewById(R.id.etUniversity);
       // etPassword=(EditText)findViewById(R.id.etPassword);
      /*  btn.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();
                String university = etUniversity.getText().toString();
                String level = etLevel.getText().toString();
                String email =etEmail.getText().toString();
                String phonenumber = etPhonenumber.getText().toString();
                String Password = etPassword.getText().toString();

              //  Toast.makeText(context,"Name: "+name+" ,level : "+level+ " ,university : "+university+" ,Email: "+email+ " , Password:"+Password+" ,phone number : " + phonenumber,Toast.LENGTH_LONG).show();
            }
        });*/

    }
}
