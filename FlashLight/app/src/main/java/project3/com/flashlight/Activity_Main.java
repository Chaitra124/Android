package project3.com.flashlight;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
 public class FlashLightActivity extends AppCompatActivity
 {
    ImageButton imageButton;
    Camera camera;
    Camera.Parameters parameters;
    boolean isflash = false;
    boolean isOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__main);
        this.imageButton=(ImageButton)this.findViewById(R.id.imageButton);
        if(getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH))
        {
           camera = Camera.open();
            parameters = camera.getParameters();
            isflash = true;

        }
        imageButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
           if(isflash) if (!isflash) {
               imageButton.setImageResource(R.drawable.on);
               parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
               camera.setParameters(parameters);
               camera.startPreview();
               isflash=true;
           } else {
               imageButton.setImageResource(R.drawable.off);
               parameters.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
               camera.setParameters(parameters);
               camera.startPreview();
               isflash = false;

           }

            else
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(Activity_Main.this);
                builder.setTitle("ERROR");
                builder.setMessage("There is no flashlight available for your device");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        dialog.dismiss();
                        finish();
                    }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


            }
        }
    });

}
    protected void onStop(){
        super.onStop();
        if(camera!=null)
            camera.release();
            camera=null;
    }
}