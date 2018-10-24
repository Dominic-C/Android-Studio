package com.example.dominic.myapptesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class HelloWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        // create variables to represent your views (We are using kotlyn?)
        // val is for things that don't change
        // var is for things that do

        val rollButton = findViewById<Button>(R.id.RollButton);
    }
}
