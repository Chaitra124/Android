package myapplications.com.applications;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.Date;

/**
 * Created by Chaitra Vani Jujaray on 26-10-2016.
 */
public class UserRegistrationActivity extends AppCompatActivity {
    EditText etFullName;
    EditText etEmail;
    EditText etPassword;
    EditText etRepeatPassword;
    EditText etMobileNumber;
    TextView tvGender;
    RadioGroup rgGender;
    RadioButton rbMale;
    RadioButton rbFemale;
    RadioButton rbOthers;
    EditText etDate;

    Button btSubmit;


    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.userregistrationactivity);
        etFullName = (EditText) findViewById(R.id.etFullName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etRepeatPassword = (EditText) findViewById(R.id.etRepeatPassword);
        etMobileNumber = (EditText) findViewById(R.id.etMobileNumber);
        tvGender = (TextView) findViewById(R.id.tvGender);
        rgGender = (RadioGroup) findViewById(R.id.rgGender);
        rbFemale = (RadioButton) findViewById(R.id.rbFemale);
        rbMale = (RadioButton) findViewById(R.id.rbMale);
        rbOthers = (RadioButton) findViewById(R.id.rbOthers);
        btSubmit = (Button) findViewById(R.id.btSubmit);
        etDate = (EditText) findViewById(R.id.etDate);

        btSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (etFullName.getText().toString().length() == 0) {
                    etFullName.setError("pls enter name");
                    etFullName.requestFocus();
                }

                if (etEmail.getText().toString().length() == 0) {
                    etEmail.setError("pls enter email");
                    etEmail.requestFocus();
                }

                if (etMobileNumber.length() == 0) {
                    etMobileNumber.setError("Pls enter valid number");
                    etMobileNumber.requestFocus();
                }

                if (etMobileNumber.length() >= 10) {
                    etMobileNumber.setError("Pls enter valid number");
                    etMobileNumber.requestFocus();
                }

                if (etPassword.getText().toString().length() == 0) {
                    etPassword.setError("Enter password");
                    etPassword.requestFocus();
                }

                if (etPassword.getText() != etRepeatPassword.getText()) {
                    etRepeatPassword.setError("Enter same password");
                    etRepeatPassword.requestFocus();
                }
                if (etDate.getText().length() == 0) {
                    etDate.setError("Enter date");
                    etDate.requestFocus();
                }

                if (etFullName.getText().length() != 0 && etEmail.getText().length() != 0 && etMobileNumber.getText().length() != 0 && etPassword.getText().length() != 0 && etRepeatPassword.getText().length() != 0 && etDate.getText().length() != 0) {
                    Toast.makeText(UserRegistrationActivity.this, "ok, confirmation mail sent to registered mail", Toast.LENGTH_LONG).show();
                }

            }

        });

        class MyAsyncClass extends AsyncTask<Void, Void, Void> {

            ProgressDialog pDialog;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();

                pDialog = new ProgressDialog(UserRegistrationActivity.this);
                pDialog.setMessage("Please wait...");
                pDialog.show();

            }

            @Override
            protected Void doInBackground(Void... mApi) {
                try {
                    jchaitravani @gmail.com.sendMail("from", "to") ;
                } catch (Exception ex) {

                }
                return null;
            }

            @Override
            protected void onPostExecute(Void Execute) {
                super.onPostExecute(result);
                pDialog.cancel();
                Toast.makeText(UserRegistrationActivity.this, "Email sent", 100).show();
            }

        }


    }
}
