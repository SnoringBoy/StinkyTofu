package com.example.zhoulu.stinkytofu;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class OpenImageActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_image);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(OpenImageActivity.this, MainActivity.class);
                OpenImageActivity.this.startActivity(homeIntent);
                OpenImageActivity.this.finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
