package project3.com.myalgorithmbenchmarkingapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


    public class MainActivity extends AppCompatActivity {

        private RadioGroup rgComplexity;
        private EditText etArraySize;
        private int[] array;
        private TextView tvArrayStatus;


        public void generateArray(View view) {

            int size = Integer.parseInt(etArraySize.getText().toString());


            switch (rgComplexity.getCheckedRadioButtonId()) {
                case R.id.rbBestCase:
                    array = Calculator.generateSortedArray(size);
                    tvArrayStatus.setText("Array of size" + size + "generated for" + "Best Case");
                    break;
                case R.id.rbAverageCase:
                    array = Calculator.generateArrayDesc(size);
                    tvArrayStatus.setText("Array of size" + size + "generated for" + "Average Case");
                    break;

                case R.id.rbWorstCase:
                    array = Calculator.generateRandomArray(size);
                    tvArrayStatus.setText("Array of size" + size + "generated for" + "Worst Case");
                    break;
            }
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            rgComplexity = (RadioGroup) findViewById(R.id.rgComplexity);
            etArraySize = (EditText) findViewById(R.id.etArraySize);
            tvArrayStatus = (TextView) findViewById(R.id.tvArrayStatus);
        }
    }


