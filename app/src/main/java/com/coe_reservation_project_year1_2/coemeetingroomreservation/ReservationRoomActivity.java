package com.coe_reservation_project_year1_2.coemeetingroomreservation;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ReservationRoomActivity extends AppCompatActivity implements View.OnClickListener {

    TextView showMonth;
    CompactCalendarView compactCalendarView;
    private SimpleDateFormat dateFormatMoth = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault());
    ImageView arrowBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_room);

        arrowBack = (ImageView) findViewById(R.id.arrow_from_calendar);
        arrowBack.setOnClickListener(this);
        showMonth = (TextView)  findViewById(R.id.show_month);
        //showMonth.setText(dateFormatMoth.format(DateFormat.getDateInstance()));


        //showMonth = (View) findViewById(R.id.);
        compactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendarView.setUseThreeLetterAbbreviation(true);

        compactCalendarView.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getApplicationContext();

                Toast.makeText(context, "ไม่มี ไม่มีเลยเจ้าค่ะ.", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                showMonth.setText(dateFormatMoth.format(firstDayOfNewMonth));
            }

        });
        }



    @Override
    public void onClick(View view) {
        if (view == (View) arrowBack){
            final Intent arrowIntent = new Intent(ReservationRoomActivity.this, MainMenuActivity.class);
            ReservationRoomActivity.this.startActivity(arrowIntent);
            ReservationRoomActivity.this.finish();
        }
    }
}
