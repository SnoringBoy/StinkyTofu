package com.example.zhoulu.stinkytofu;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class OpenImageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_image);

        //initialize the guest login button.
        Button guestBtn = (Button)findViewById(R.id.guestBtn);

        Button adminBtn = (Button)findViewById(R.id.adminBtn);

        //add actionlistener to the guest button.
        guestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent is used to switch activity, the first argument is the source activity,
                // second one is the destination(which activity you want to go)
                Intent intent = new Intent(OpenImageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        adminBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpenImageActivity.this, AdminLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
