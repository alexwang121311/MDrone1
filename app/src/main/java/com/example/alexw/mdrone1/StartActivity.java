package com.example.alexw.mdrone1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //welcome message.
        final TextView welcome = (TextView) findViewById(R.id.tvWelcome);
        //login buttons
        final Button btnUserLogin = (Button) findViewById(R.id.btnUserLogin);
        final Button btnPilotLogin = (Button) findViewById(R.id.btnPilotLogin);

        //go to UserLogin
        btnUserLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V)
            {
                Intent registerIntent = new Intent(StartActivity.this, UserLogin.class);
                StartActivity.this.startActivity(registerIntent);
            }
        });

        //go to PilotLogin
        btnPilotLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V)
            {
                Intent registerIntent = new Intent(StartActivity.this, PilotLogin.class);
                StartActivity.this.startActivity(registerIntent);
            }
        });
    }
}

