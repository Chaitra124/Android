package myapplications.com.applications;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;


public class ApplicationActivity extends AppCompatActivity {

TextView tvSomething;


    public void getUserName(View view){
        Intent intent = new Intent(getBaseContext(), Application2Activity.class);
        startActivityForResult(intent,100);
        tvSomething = (TextView) findViewById(R.id.tvSomething);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode , Intent intent){
        if(requestCode==100 && resultCode==RESULT_OK){
            tvSomething.setText(""+ intent.getStringExtra("username"));
          //  Log.i("chaitra","onActivityresul called "+ requestCode + " " + resultCode + " " + intent.getStringExtra("username"));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);
    }
}
