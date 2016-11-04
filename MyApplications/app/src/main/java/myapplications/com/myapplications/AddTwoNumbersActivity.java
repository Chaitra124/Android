package myapplications.com.myapplications;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;

public class AddTwoNumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wifiactivity);
    }
    public void onButtonClick(View v){
        EditText editTextNumber1=(EditText)findViewById(R.id.editTextNumber1);
        EditText editTextNumber2=(EditText)findViewById(R.id.editTextNumber2);
        TextView textViewResult=(TextView)findViewById(R.id.textViewResult);
        int num1=Integer.parseInt(editTextNumber1.getText().toString());
        int num2=Integer.parseInt(editTextNumber2.getText().toString());
        int sum=num1+num2;
        textViewResult.setText(String.valueOf(sum));
    }
}
