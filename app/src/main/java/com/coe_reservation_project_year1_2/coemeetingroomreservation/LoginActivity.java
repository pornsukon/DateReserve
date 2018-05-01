package com.coe_reservation_project_year1_2.coemeetingroomreservation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonLogin;
    EditText editTextLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        editTextLogin = (EditText) findViewById(R.id.editTextLogin);

        buttonLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        final Intent openIntent = new Intent(LoginActivity.this,MainMenuActivity.class);
        LoginActivity.this.startActivity(openIntent);
        LoginActivity.this.finish();
    }
}
