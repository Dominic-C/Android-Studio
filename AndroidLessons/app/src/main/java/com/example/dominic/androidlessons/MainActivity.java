package com.example.dominic.androidlessons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import java.util.*;

public class MainActivity extends AppCompatActivity{

    ArrayList<Integer> images;
    Button charaButton, resetButton;
    ImageView charaImage;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Text view widget
        TextView textView = findViewById(R.id.textViewRandomImages);
        textView.setText("New Text view!");

        // image view widget
        images = new ArrayList<Integer>();
        images.add(R.drawable.pikachu);
        images.add(R.drawable.bartsimpson);
        images.add(R.drawable.ashketchum);
        images.add(R.drawable.yoda);
        charaImage = findViewById(R.id.charaImages);

        // create random generator
        // to give a random number between 1 to n, r.nextInt(n);

        // button widget
        charaButton = findViewById(R.id.charaButton);
        charaButton.setText("Next image maybe?");
        charaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int randomIndex = r.nextInt(images.size());

                int id = images.get(randomIndex);
                // we are not putting an integer into setImageResource, but rather the image
                charaImage.setImageResource(id);

            }
        });

        // reset button
        resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charaImage.setImageResource(images.get(0));
            }
        });


    }
}