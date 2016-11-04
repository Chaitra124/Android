package myapplications.com.applications;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Application2Activity extends AppCompatActivity {

    public void submit(View view){

        String name = ((EditText)findViewById(R.id.etUserName)).getText().toString();
        Intent intent = new Intent();
        intent.putExtra("username", name);
        //setIntent(intent);
        setResult(RESULT_OK, intent);

        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.application2activity);
    }
}
