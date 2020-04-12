package com.lavi.habitchallenge.ui;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;

import java.util.Calendar;

public class AddNewChallengeView extends LinearLayout {

    public AddNewChallengeView(final Context context) {
        super(context);

        Button startDateButton = new Button(context);
        startDateButton.setText("Start Date of Challenge");
        startDateButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog(context);
            }
        });
        Button endDateButton = new Button(context);
        endDateButton.setText("End Date of Challenge");
        endDateButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog(context);
            }
        });

        this.addView(startDateButton);
        this.addView(endDateButton);

    }

    private Calendar showDatePickerDialog(Context context) {
        final Calendar calendar = Calendar.getInstance();
        int defaultYear = calendar.get(Calendar.YEAR);
        int defaultMonth = calendar.get(Calendar.MONTH);
        int defaultDate = calendar.get(Calendar.DATE);


        new DatePickerDialog(context, android.R.style.Theme_Holo_Dialog, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int date) {
                calendar.set(year, month, date);
            }
        }, defaultYear, defaultMonth, defaultDate).show();

        return calendar;

    }

}
