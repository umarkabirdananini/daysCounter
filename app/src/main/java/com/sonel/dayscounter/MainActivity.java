package com.sonel.dayscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.joda.time.Days;
import org.joda.time.LocalDate;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        LocalDate date2 = LocalDate.parse("2018-03-30");
        LocalDate date1 = LocalDate.now();
        int days = Days.daysBetween(date1, date2).getDays();
        textView.setText(days+" to your wedding");

    }
}
