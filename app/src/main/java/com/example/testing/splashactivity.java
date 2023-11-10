package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);

        Thread thread = new Thread(){
            @Override
            public void run(){
                try{
sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally{
                    startActivity(new Intent(splashactivity.this, MainActivity.class));
                }
            }
        };
        thread.start();
    }
}