package com.android_sms_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class Activity_two extends AppCompatActivity {
    final String Tag="Status";

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.d(Tag, "Activity_Life_Cycle : onCreate()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(Tag, "Activity_Life_Cycle : onRestart()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(Tag, "Activity_Life_Cycle : onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(Tag, "Activity_Life_Cycle : onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(Tag, "Activity_Life_Cycle : onDestroy()");
    }


}
