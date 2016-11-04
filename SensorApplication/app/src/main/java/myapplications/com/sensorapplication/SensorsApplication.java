package myapplications.com.sensorapplication;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class SensorsApplication extends AppCompatActivity{

    private SensorManager sensormanager;
    private Button btSensor;
    private TextView tvSensorsInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors_application);
        sensormanager =(SensorManager) getSystemService(SENSOR_SERVICE);
        tvSensorsInfo = (TextView) findViewById(R.id.tvSensorsInfo);

        List<Sensor> sensorList = sensormanager.getSensorList(Sensor.TYPE_ALL);{
            for(int i =1; i<sensorList.size();i++)
            tvSensorsInfo.append(sensorList.get(i).getName()+"\n");
        }

    }



}
