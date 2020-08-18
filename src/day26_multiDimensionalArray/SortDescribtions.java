package day26_multiDimensionalArray;
/*
1. write a program that can sort the array in descending order
            ex:
                arr1: { 10, 11, 8, 9, 12, 5, 15};
                output:
                    arr2: {15, 12, 11, 10, 9, 8, 5}
                NOTE: at the end, you must have have an array that contains the desending order of the original array
                2 1 3
                1 2 3
                3 1 2

 */
import java.util.Arrays;

public class SortDescribtions {
    public static void main(String[] args) {

        int[] arr={3,2,1,0,4,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        int[] desc=new int[arr.length];
        int k=arr.length-1;
        for (int i=0;i<=desc.length-1;i++){
            desc[i]=arr[k];
            k--;
        }
        System.out.println(Arrays.toString(desc));


    }
}
