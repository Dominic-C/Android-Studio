package com.example.dominic.hellworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.dominic.hellworldapp.MESSAGE"; // unique key

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
    }

    public void sendMessage(View view) // called onclick
    {
        // building intent
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText); // just used to get text from edit text view so we can pass it later
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message); // key, value
        startActivity(intent);
    }
}