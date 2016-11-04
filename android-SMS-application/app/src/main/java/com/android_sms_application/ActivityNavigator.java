package com.android_sms_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by Chaitra Vani Jujaray on 18-10-2016.
 */
public class ActivityNavigator extends AppCompatActivity implements OnClickListener {

    Button btMassageActivity;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylifecycle);
        btMassageActivity =(Button) findViewById(R.id.btMassageActivity);
        btMassageActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){

        switch(view.getId()){
            case R.id.btMassageActivity:
                Intent intent = new Intent(ActivityNavigator.this, MassageActivity.class);
                startActivity(intent);
                break;

            case R.id.btSendSMS:
                Intent intent1 = new Intent(ActivityNavigator.this, MainActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
