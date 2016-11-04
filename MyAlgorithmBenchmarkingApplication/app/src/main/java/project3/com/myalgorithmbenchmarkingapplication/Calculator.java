package project3.com.myalgorithmbenchmarkingapplication;

/**
 * Created by Chaitra Vani Jujaray on 14-10-2016.
 */
public class Calculator {

    public static  int[] generateSortedArray(int size){
        int[] array=new int[size];
        for(int i=0;i<array.length;i++)
            array[i]=i+1;
        return array;
    }

    public static  int[] generateArrayDesc(int size){
        int[] array=new int[size];
        for(int i=array.length-1;i>=0;i--)
            array[i]=i+1;
        return array;
    }

    public static  int[] generateRandomArray(int size){
        int[] array=new int[size];
        for(int i=0;i<array.length;i++)
            array[i]=(int)(Math.random()*1000);
        return array;
    }
}
