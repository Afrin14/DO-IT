package com.example.afrin.hello;

import android.app.AppOpsManager;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.example.afrin.hello.R.id.calendarView;


public class Second extends ActionBarActivity {
    final static String DATE = "com.example.afrin.hello.DATE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final CalendarView calendar = (CalendarView) findViewById(R.id.calendarView);


        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            public void onSelectedDayChange(CalendarView view, int year, int month, int day) {

                Intent intent;
                intent = new Intent(Second.this, fourth.class);
                String tdate = day+"/"+month+"/"+year;
                intent.putExtra(DATE, tdate);
                startActivity(intent);
            }
        });


    } }










