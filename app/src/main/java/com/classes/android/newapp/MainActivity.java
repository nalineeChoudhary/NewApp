package com.classes.android.newapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText e1;
    EditText e2;
    TextView tv;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);

    }


        public void onClick (View view)
    {
        String s = e1.getText().toString();//this is to store the input
        String s2 =  e2.getText().toString();
        int a= Integer.parseInt(s);

        int b = Integer.parseInt(s2);

        int y = a+b;

        tv.setText(Integer.toString(y));


    }





}
