package com.android_menu_example;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=super.getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.item1:
                Toast.makeText(this,"Item1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(this,"Item2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(this,"Item3",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
    public void button1Handler(View view) {
        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Button1 ",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,0,150);
        toast.show();
    }
    public void button2Handler(View view) {
        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Button2 ",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.CENTER,0,150);
        toast.show();
    }

    public void button3Handler(View view) {
        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Button3 ",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,150);
        toast.show();
    }

    public void button4Handler(View view) {
        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Button4 ",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.LEFT,0,90);
        toast.show();
    }

    public void button5Handler(View view) {
        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Button5 ",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.LEFT,430,90);
        toast.show();
    }

    public void button6Handler(View view) {
        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Button6 ",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.RIGHT,1000,90);
        toast.show();
    }

    public void button7Handler(View view) {
        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Button7 ",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.LEFT,0,50);
        toast.show();
    }

    public void button8Handler(View view) {
        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Button8 ",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,50);
        toast.show();
    }

    public void button9Handler(View view) {
        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Button9 ",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT,0,50);
        toast.show();
    }
}