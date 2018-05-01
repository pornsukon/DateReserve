package com.coe_reservation_project_year1_2.coemeetingroomreservation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeAvtivityOpen();
    }

    private void changeAvtivityOpen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent openIntent = new Intent(MainActivity.this,LoginActivity.class);
                MainActivity.this.startActivity(openIntent);
                MainActivity.this.finish();
            }
        },5000);
    }
}
