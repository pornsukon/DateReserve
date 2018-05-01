package com.coe_reservation_project_year1_2.coemeetingroomreservation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView reservationQues,reservationCalendar,imgNotification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        reservationQues = (ImageView) findViewById(R.id.quesImage);
        reservationQues.setOnClickListener(this);

        reservationCalendar = (ImageView) findViewById(R.id.reservationImage);
        reservationCalendar.setOnClickListener(this);

        imgNotification = (ImageView) findViewById(R.id.iv_notification);
        imgNotification.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == (View) reservationQues) {
            final Intent quesIntent = new Intent(MainMenuActivity.this, ReservationQuesActivity.class);
            MainMenuActivity.this.startActivity(quesIntent);
            MainMenuActivity.this.finish();
        } else if (view == (View) reservationCalendar){
            final Intent calendarIntent = new Intent(MainMenuActivity.this, ReservationRoomActivity.class);
            MainMenuActivity.this.startActivity(calendarIntent);
            MainMenuActivity.this.finish();
        } else if (view == (View) imgNotification){
            final Intent notificationIntent = new Intent(MainMenuActivity.this, NotificationMainActivity.class);
            MainMenuActivity.this.startActivity(notificationIntent);
            MainMenuActivity.this.finish();
        }
    }
}

