package com.example.dominic.hellworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // get reference to intent
        Intent intent = getIntent();
        // get message out of intent
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // reference text view
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}
