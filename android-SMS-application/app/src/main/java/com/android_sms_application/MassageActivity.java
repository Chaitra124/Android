package com.android_sms_application;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MassageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.massage);

    }

    public void sun(View view) {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(1000);

    }

    public void moon(View view) {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long[] pattern = {0, 600, 800};
        v.vibrate(pattern, -1);


    }

    public void stars(View view) {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        int dot = 200;
        int dash = 500;
        int short_gap = 200;
        int medium_gap = 500;
        int long_gap = 900;
        long[] pattern = {0, dot, dash, long_gap, short_gap, dot, medium_gap, dash, long_gap, medium_gap, dash, long_gap};
        v.vibrate(pattern, -1);
    }


}