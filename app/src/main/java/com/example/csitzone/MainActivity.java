package com.example.csitzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mLoginBtn;
    Button mRegisterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mLoginBtn = (Button) findViewById(R.id.login_start);
        mRegisterBtn = (Button) findViewById(R.id.login_register);


        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regIntent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(regIntent);

            }
        });
    }
}
