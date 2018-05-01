package com.coe_reservation_project_year1_2.coemeetingroomreservation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NotificationMainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView arrowBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_main);

        arrowBack = (ImageView) findViewById(R.id.arrow_from_noti);
        arrowBack.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if ( view == (View) arrowBack){
            final Intent arrowIntent = new Intent(NotificationMainActivity.this, MainMenuActivity.class);
            NotificationMainActivity.this.startActivity(arrowIntent);
            NotificationMainActivity.this.finish();
        }
    }
}
