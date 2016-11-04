package com.android_sms_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class Activity_Life_Cycle extends AppCompatActivity implements OnClickListener {
final String Tag="Status";
    Button btnclick;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylifecycle);
        btnclick =(Button) findViewById(R.id.btnClick);
        btnclick.setOnClickListener(this);
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

    @Override
    public void onClick(View view){
        Intent intent = new Intent (this,Activity_two.class);
        startActivity(intent);
    }
}
