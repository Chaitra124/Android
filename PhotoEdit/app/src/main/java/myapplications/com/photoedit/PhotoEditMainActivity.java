package myapplications.com.photoedit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PhotoEditMainActivity extends AppCompatActivity {

    ImageView pic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Intent receivedIntent = getIntent();
        String receivedAction = receivedIntent.getAction();
        String receivedType = receivedIntent.getType();
        pic = (ImageView) findViewById(R.id.ivWelcome);

  /*      if(receivedAction.equals(Intent.ACTION_SEND)){

        }
        else if(receivedAction.equals(Intent.ACTION_MAIN)){

        }
        if(receivedType.startsWith("text/")){

        }
        else if(receivedType.startsWith("image/")){

        }
        String receivedText = receivedIntent.getStringExtra(Intent.EXTRA_TEXT);
        if (receivedText != null) {
            tvDesti.setText(receivedText);
        }
        Uri receivedUri = (Uri)receivedIntent.getParcelableExtra(Intent.EXTRA_STREAM);
        if (receivedUri != null) {
            pic.setImageURI(receivedUri);*/
        //}

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menus, menu);//Menu Resource, Menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Camera:
                Toast.makeText(getApplicationContext(), "camera Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.Gallery:
                Toast.makeText(getApplicationContext(), "gallery  Selected", Toast.LENGTH_LONG).show();
                return true;


        }
        return false;
    }
}

