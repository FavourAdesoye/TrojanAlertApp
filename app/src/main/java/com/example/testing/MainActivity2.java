package com.example.testing;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity2 extends AppCompatActivity {
ImageButton imageButton_emg;
    ImageButton imageButton_finaid;
    ImageButton imageButton_events;
    ImageButton imageButton_news;
    ImageButton imageButton_map;
    ImageButton imageButton_dining;
    ImageButton imageButton_transit;
    ImageButton imageButton_it;
    ImageButton imageButton_blackboard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageButton_emg= (ImageButton) findViewById(R.id.image_button_emergency);
        imageButton_emg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, ta_pages_emergency.class);
                startActivity(intent);
            }
        });
        imageButton_finaid= (ImageButton) findViewById(R.id.image_button_finaid);
        imageButton_finaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, ta_pages_finaid.class);
                startActivity(intent);
            }
        });
        imageButton_events= (ImageButton) findViewById(R.id.image_button_event);
        imageButton_events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, ta_pages_events.class);
                startActivity(intent);
            }
        });
        imageButton_news= (ImageButton) findViewById(R.id.image_button_news);
        imageButton_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, ta_pages_error.class);
                startActivity(intent);
            }
        });
        imageButton_map= (ImageButton) findViewById(R.id.image_button_map);
        imageButton_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, ta_pages_error.class);
                startActivity(intent);
            }
        });
        imageButton_dining= (ImageButton) findViewById(R.id.image_button_dinning);
        imageButton_dining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, ta_pages_error
                        .class);
                startActivity(intent);
            }
        });
        imageButton_transit= (ImageButton) findViewById(R.id.image_button_transit);
        imageButton_transit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, ta_pages_error.class);
                startActivity(intent);
            }
        });
        imageButton_it= (ImageButton) findViewById(R.id.image_button_IT);
        imageButton_it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, ta_pages_error.class);
                startActivity(intent);
            }
        });
        imageButton_blackboard= (ImageButton) findViewById(R.id.image_button_blackboard);
        imageButton_blackboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, ta_pages_error.class);
                startActivity(intent);
            }
        });


    }}