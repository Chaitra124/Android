package com.android_sms_application;

import android.renderscript.Script;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button buttonsend;
    public EditText PhoneNumber;
    public EditText TextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhoneNumber = (EditText) findViewById(R.id.editContact);
        TextMessage = (EditText) findViewById(R.id.editMsg);
        buttonsend = (Button) findViewById(R.id.send);

    }

    public void sendMessage(View view) {
        String Phone = PhoneNumber.getText().toString();
        String Message = TextMessage.getText().toString();
        try {

            SmsManager smsmanager = SmsManager.getDefault();
            smsmanager.sendTextMessage(Phone, null, Message, null, null);
            Toast.makeText(getApplicationContext(), "Message sent", Toast.LENGTH_SHORT).show();

        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), "Unable to send ", Toast.LENGTH_SHORT).show();
        }
    }


}

