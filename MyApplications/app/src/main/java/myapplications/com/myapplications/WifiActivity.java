package myapplications.com.myapplications;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.view.View.OnClickListener;

public class WifiActivity extends AppCompatActivity {

    ToggleButton tbWifi;
    private WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wifiactivity);
        tbWifi = (ToggleButton) findViewById(R.id.tbWifi);
        wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
        tbWifi = (ToggleButton) findViewById(R.id.tbWifi);
        tbWifi.setChecked(wifiManager.isWifiEnabled());

        tbWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                wifiManager.setWifiEnabled(isChecked);
            }
        });
    }
}