package com.example.zhoulu.stinkytofu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdminLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        //initilize variables
        //good practise to have the variable name is the same as the id.
        final EditText editTextUName = (EditText)findViewById(R.id.editTextUName);
        final EditText editTextPw = (EditText)findViewById(R.id.editTextPw);
        Button btnAdminLogin = (Button)findViewById(R.id.btnAdminLogin);

        btnAdminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextUName.getText().toString().equals("admin") && editTextPw.getText().toString().equals("admin")) {
                    //intent use for changing activity (src activity, destination activity)
                    Intent intent = new Intent(AdminLoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}
