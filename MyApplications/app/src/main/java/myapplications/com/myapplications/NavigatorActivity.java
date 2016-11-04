package myapplications.com.myapplications;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
public class NavigatorActivity extends AppCompatActivity implements OnClickListener {

    Button btadd;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigatoractivity);
        btadd = (Button) findViewById(R.id.btadd);
        btadd.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.btadd:
                Intent intent = new Intent (NavigatorActivity.this, AddTwoNumbersActivity.class);
                startActivity(intent);
                break;
        }
    }
}
