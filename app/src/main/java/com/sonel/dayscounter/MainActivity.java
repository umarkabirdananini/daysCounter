package com.sonel.dayscounter;

import android.app.DatePickerDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import org.joda.time.Days;
import org.joda.time.LocalDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TextView textView, tvTime;
    private TextView tvDisplayDate;
    private DatePicker dpResult;


    private int year1;
    private int month1;
    private int day1;

    static final int DATE_DIALOG_ID = 999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        tvTime = findViewById(R.id.time);
        LocalDate date2 = LocalDate.parse("2018-03-30");
        LocalDate date1 = LocalDate.now();
        int days = Days.daysBetween(date1, date2).getDays();
        textView.setText(days + " days to your wedding");
        tvTime.setText("Current date is "+date);


    }

    public void showDate(View view) {
        DatePickerDialog dialog = new DatePickerDialog(MainActivity.this, android.R.style.Theme_Holo_Dialog, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                year1 = year;
                month1 = month + 1;
                day1 = day;

                LocalDate date2 = LocalDate.parse(year1 + "-" + month1 + "-" + day1);
                LocalDate date1 = LocalDate.now();
                int days = Days.daysBetween(date1, date2).getDays();
                textView.setText("" + days);


            }
        }, year1, month1, day1);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        dialog.show();
    }



    String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());}



