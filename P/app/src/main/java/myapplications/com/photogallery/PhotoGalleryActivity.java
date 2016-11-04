package myapplications.com.photogallery;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.io.File;
import java.util.ArrayList;

public class PhotoGalleryActivity extends AppCompatActivity {


    GridView gv;
    ArrayList<File> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photogalleryactivity);

        list = imageReader(Environment.getExternalStorageDirectory());
        gv = (GridView) findViewById(R.id.gvPhotoGallery);
        gv.setAdapter(new GridAdapter() );
    }



    class GridAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }
    ArrayList<File>imageReader(File root){}
}
