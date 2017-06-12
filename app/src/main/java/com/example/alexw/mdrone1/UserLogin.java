package com.example.alexw.mdrone1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        final Button btnUserLogin = (Button) findViewById(R.id.btnUserLogin);
        final Button btnUserCreateAccount = (Button) findViewById(R.id.btnUserCreateAccount);
        final EditText etUserLoginUsername = (EditText) findViewById(R.id.etUserLoginUsername);
        final EditText etUserLoginPassowrd = (EditText) findViewById(R.id.etUserLoginPassword);


    }
}
