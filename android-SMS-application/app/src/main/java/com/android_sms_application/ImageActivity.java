package com.android_sms_application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;



/**
 * Created by Chaitra Vani Jujaray on 19-10-2016.
 */
public class ImageActivity extends AppCompatActivity {
    private Button btMove;
    private Button btAlpha;
    private Button btRotate;
    private Button btShake;


    Animation animation1, animation2, animation3, animation4;
    ImageView ivImages;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageactivity);


        animation1 = AnimationUtils.loadAnimation(this, R.anim.anim1);
        animation1.setRepeatCount(10);

        animation2 = AnimationUtils.loadAnimation(this, R.anim.anim2);
        animation2.setRepeatCount(10);

        animation3=AnimationUtils.loadAnimation(this,R.anim.anim3);
        animation3.setRepeatCount(10);

        animation4 = AnimationUtils.loadAnimation(this,R.anim.anim4);
        animation4.setRepeatCount(10);

        ivImages = (ImageView) findViewById(R.id.ivImages);
        btShake= (Button) findViewById(R.id.btShake);
        btMove = (Button) findViewById(R.id.btMove);
        btAlpha = (Button) findViewById(R.id.btAlpha);
        btRotate =(Button) findViewById(R.id.btRotate);


        btShake.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                ivImages.startAnimation(animation4);
            }
        });





        btMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivImages.startAnimation(animation1);
            }
        });


        btAlpha.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ivImages.startAnimation(animation2);
            }
        });

        btRotate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ivImages.startAnimation(animation3);
            }
        });



    }
}
