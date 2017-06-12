package com.example.alexw.mdrone1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //login and register buttons
        final Button btnGoToUser = (Button) findViewById(R.id.btnGoToUser);
        final Button btnGoToPilot = (Button) findViewById(R.id.btnGoToPilot);

        //go to register activity on button click
        btnGoToUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent registerIntent = new Intent(StartActivity.this, UserLogin.class);
                StartActivity.this.startActivity(registerIntent);
            }
        });

        btnGoToPilot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent goToPilot = new Intent(StartActivity.this, PilotLogin.class);
                StartActivity.this.startActivity(goToPilot);
            }
        });
    }
}
