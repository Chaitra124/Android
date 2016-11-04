package com.felight.algorithmbenchactivity.utils;

/**
 * Created by hp on 14-10-2016.
 */

public class Sort {
    public static int BubbleSort(int[] array) {

        int n = array.length;
        int temp = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
        long end = System.currentTimeMillis();
        long result = end - start;
        return (int)result;
    }


    public static int SelectionSort(int[] array){
        long start = System.currentTimeMillis();

        int n = array.length;

        for (int i = 0; i < n - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[index])
                    index = j;

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        long stop = System.currentTimeMillis();
        long result = stop - start;
        return (int)result;
    }

    public static int InsertionSort(int[] array){
        long start = System.currentTimeMillis();

        int n = array.length;
        int temp;
        for (int i = 1; i < n; i++) {
            for(int j = i ; j > 0 ; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        long stop = System.currentTimeMillis();
        long result = stop - start;
        return (int)result;
    }

    //Quick Sort
    public static int Quicksort(int[] arr)
    {
        long start=System.currentTimeMillis();
        QuickSort1(arr, 0, arr.length - 1);
        long end=System.currentTimeMillis();
        long result=end-start;

        return (int)result;
    }
    /** Quick sort function **/
    public static void QuickSort1(int arr[], int low, int high)
    {
        int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];

        /** partition **/
        while (i <= j)
        {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j)
            {
                /** swap **/
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        /** recursively sort lower half **/
        if (low < j)
            QuickSort1(arr, low, j);
        /** recursively sort upper half **/
        if (i < high)
            QuickSort1(arr, i, high);
    }

    //Heap Sort
    private static int N;
    /* Sort Function */
    public static int HeapSort(int arr[])
    {
        long start=System.currentTimeMillis();
        heapify(arr);
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
        long end=System.currentTimeMillis();
        long result=end-start;
        return (int)result;
    }
    /* Function to build a heap */
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);
    }
    /* Function to swap largest element in heap */
    public static void maxheap(int arr[], int i)
    {
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])
            max = right;

        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }
    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //Merge Sort
    static  int[] helper;
    static int[] numbers;
    static int number;

    public static int MergeSort(int[] values) {
        long start=System.currentTimeMillis();
        numbers = values;
        number = values.length;
        helper = new int[number];
        mergesort1(0, number - 1);
        long end=System.currentTimeMillis();
        long result=end-start;

        return (int)result;
    }

    public static void mergesort1(int low, int high) {

        if (low < high) {

            int middle = low + (high - low) / 2;

            mergesort1(low, middle);

            mergesort1(middle + 1, high);

            merge(low, middle, high);
        }
    }

    public static void merge(int low, int middle, int high) {


        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }
    public void benchmarkAll(int[] array){
        int time;
        time = Sort.BubbleSort(array);

        time = Sort.SelectionSort(array);

        time = Sort.InsertionSort(array);

        time=Sort.Quicksort(array);

        time=Sort.HeapSort(array);

        time=Sort.MergeSort(array);




    }


}
