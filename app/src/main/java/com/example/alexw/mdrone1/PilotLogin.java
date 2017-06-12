package com.example.alexw.mdrone1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PilotLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilot_login);

        final EditText etPilotLoginUsername = (EditText) findViewById(R.id.etPilotLoginUsername);
        final EditText etPilotLoginPassword = (EditText) findViewById(R.id.etPilotLoginPassword);

        final Button btnPilotLogin = (Button) findViewById(R.id.btnPilotLogin);
        final Button btnPilotCreateAccount = (Button) findViewById(R.id.btnPilotCreateAccount);
    }
}
