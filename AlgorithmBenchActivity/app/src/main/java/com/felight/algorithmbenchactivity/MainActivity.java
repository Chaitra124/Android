package com.felight.algorithmbenchactivity;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.felight.algorithmbenchactivity.utils.Calculator;
import com.felight.algorithmbenchactivity.utils.Sort;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.felight.algorithmbenchactivity.R.id.tvBubbleSort;
import static com.felight.algorithmbenchactivity.R.id.tvQuickSort;
import static com.felight.algorithmbenchactivity.R.id.tvSelectionSort;


public class MainActivity extends AppCompatActivity {

    private RadioGroup rgComplexity;
    private EditText etArraySize;
    private int[] array;
    private TextView tvArrayStatus;
    private TextView tvBubbleSort;
    private TextView tvSelectionSort;
    private TextView tvInsertionSort;
    private TextView tvQuickSort;
    private TextView tvHeapSort;
    private TextView tvMergeSort;
    private Button btnB;
    private Button btnS;
    private Button btnI;
    private Button btnM;
    private Button btnH;
    private Button btnQ;
    private Button btnBM;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    public void generateArray(View view) {


            int size = Integer.parseInt(etArraySize.getText().toString());
       
        array = new int[size];

        rgComplexity = (RadioGroup) findViewById(R.id.rgComplexity);
        int selectedId = rgComplexity.getCheckedRadioButtonId();

        switch (rgComplexity.getCheckedRadioButtonId()) {
            case R.id.rbBestCase:
                array = Calculator.generateSortedArray(size);
                tvArrayStatus.setText("Array of size " + size + "generated for" + " Best Case");
                break;
            case R.id.rbAverageCase:
                array = Calculator.generateRandomArray(size);
                tvArrayStatus.setText("Array of size " + size + "generated for" + " Average Case");
                break;

            case R.id.rbWorstCase:
                array = Calculator.generateArrayDesc(size);
                tvArrayStatus.setText("Array of sizev" + size + "generated for" + " Worst Case");
                break;
        }
    }

    public void sort(View view) {
        int time;
        switch (view.getId()) {

            case R.id.btnBubbleSort:
                btnS.setEnabled(false);
                btnI.setEnabled(false);
                btnM.setEnabled(false);
                btnQ.setEnabled(false);
                btnH.setEnabled(false);
                btnBM.setEnabled(false);
                time = Sort.BubbleSort(array);
                tvBubbleSort.setText(Integer.toString(time));
                break;

            case R.id.btnSelectionSort:
                btnB.setEnabled(false);
                btnI.setEnabled(false);
                btnM.setEnabled(false);
                btnQ.setEnabled(false);
                btnH.setEnabled(false);
                btnBM.setEnabled(false);
                time = Sort.SelectionSort(array);
                tvSelectionSort.setText(Integer.toString(time));
                break;

            case R.id.btnInsertionSort:
                btnS.setEnabled(false);
                btnB.setEnabled(false);
                btnM.setEnabled(false);
                btnQ.setEnabled(false);
                btnH.setEnabled(false);
                btnBM.setEnabled(false);
                time = Sort.InsertionSort(array);
                tvInsertionSort.setText(Integer.toString(time));
                break;

            case R.id.btnQuickSort:
                btnS.setEnabled(false);
                btnI.setEnabled(false);
                btnM.setEnabled(false);
                btnB.setEnabled(false);
                btnH.setEnabled(false);
                btnBM.setEnabled(false);
                time = Sort.Quicksort(array);
                tvQuickSort.setText(Integer.toString(time));
                break;

            case R.id.btnHeapSort:
                btnS.setEnabled(false);
                btnI.setEnabled(false);
                btnM.setEnabled(false);
                btnQ.setEnabled(false);
                btnB.setEnabled(false);
                btnBM.setEnabled(false);
                time = Sort.HeapSort(array);
                tvHeapSort.setText(Integer.toString(time));
                break;

            case R.id.btnMergeSort:
                btnS.setEnabled(false);
                btnI.setEnabled(false);
                btnB.setEnabled(false);
                btnQ.setEnabled(false);
                btnH.setEnabled(false);
                btnBM.setEnabled(false);
                time = Sort.MergeSort(array);
                tvMergeSort.setText(Integer.toString(time));
                break;

            case R.id.btnBenchMark:

                time = Sort.BubbleSort(array);
                tvBubbleSort.setText(Integer.toString(time));

                time = Sort.SelectionSort(array);
                tvSelectionSort.setText(Integer.toString(time));

                time = Sort.InsertionSort(array);
                tvInsertionSort.setText(Integer.toString(time));

                time = Sort.Quicksort(array);
                tvQuickSort.setText(Integer.toString(time));

                time = Sort.HeapSort(array);
                tvHeapSort.setText(Integer.toString(time));

                time=Sort.MergeSort(array);
                tvMergeSort.setText(Integer.toString(time));


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgComplexity = (RadioGroup) findViewById(R.id.rgComplexity);
        etArraySize = (EditText) findViewById(R.id.etArraySize);
        tvArrayStatus = (TextView) findViewById(R.id.tvArrayStatus);
        tvBubbleSort = (TextView) findViewById(R.id.tvBubbleSort);
        tvSelectionSort = (TextView) findViewById(R.id.tvSelectionSort);
        tvInsertionSort = (TextView) findViewById(R.id.tvInsertionSort);
        tvQuickSort = (TextView) findViewById(R.id.tvQuickSort);
        tvHeapSort = (TextView) findViewById(R.id.tvHeapSort);
        tvMergeSort = (TextView) findViewById(R.id.tvMergeSort);
       btnB = (Button) findViewById(R.id.btnBubbleSort);
        btnS = (Button) findViewById(R.id.btnSelectionSort);
        btnI = (Button) findViewById(R.id.btnInsertionSort);
        btnM = (Button) findViewById(R.id.btnMergeSort);
        btnQ = (Button) findViewById(R.id.btnQuickSort);
        btnH = (Button) findViewById(R.id.btnHeapSort);
        btnBM = (Button) findViewById(R.id.btnBenchMark);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
}