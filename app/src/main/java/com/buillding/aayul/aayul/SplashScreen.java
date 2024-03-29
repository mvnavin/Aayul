package com.buillding.aayul.aayul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread mySplash = new Thread(){
            @Override
            public void run(){
                try{
                    sleep(30);
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                } catch(InterruptedException e) {
                    e.printStackTrace();

                }
            }
        };

        mySplash.start();
    }
}
