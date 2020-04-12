package com.lavi.habitchallenge.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.lavi.habitchallenge.ChallengeType;


public class OngoingChallengeView extends LinearLayout {

    Paint paint;

    public OngoingChallengeView(Context context, String headingText, ChallengeType challengeType) {
        super(context);

        setWillNotDraw(false);
        paint = new Paint();

        this.setOrientation(VERTICAL);

        TextView heading = new TextView(context);
        heading.setText(headingText);
        heading.setTypeface(null, Typeface.BOLD);
        this.addView(heading);

        LinearLayout belowLayout = new LinearLayout(context);
        belowLayout.setOrientation(HORIZONTAL);

        if (challengeType.equals(ChallengeType.DAILY_CHALLENGE)) {
            TextView tv = new TextView(context);
            tv.setText("Done for Today");
            belowLayout.addView(tv);

            CheckBox checkBox = new CheckBox(context);
            belowLayout.addView(checkBox);

        } else if (challengeType.equals(ChallengeType.NUMERIC_CHALLENGE)) {
            TextView tv = new TextView(context);
            tv.setText("Number for Today");
            belowLayout.addView(tv);

            Spinner spinner = new Spinner(context);
            String[] items = new String[]{"1", "2", "3", "4"};
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    context,
                    android.R.layout.simple_spinner_dropdown_item,
                    items
            );
            spinner.setAdapter(adapter);
            belowLayout.addView(spinner);
        }
        this.addView(belowLayout);
        LayoutParams layoutParams = new LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(15, 10, 10, 10);
        this.setLayoutParams(layoutParams);
        this.setBackgroundColor(0xFFFFFFFF);
        this.setPadding(15, 10, 10, 10);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint strokePaint = paint;
        strokePaint.setARGB(255, 255, 255, 255);
        strokePaint.setStyle(Paint.Style.STROKE);
        strokePaint.setStrokeWidth(2);
        Rect r = canvas.getClipBounds();
        Rect outline = new Rect(1, 1, r.right - 1, r.bottom - 1);
        canvas.drawRect(outline, strokePaint);
    }
}
