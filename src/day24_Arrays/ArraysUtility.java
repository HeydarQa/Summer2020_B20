package day24_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[]arr={1,2,3};
        System.out.println(Arrays.toString(arr));
        String []arr1={"Noza","Akbar","Sumeyra","Sumeyra","Izzet"};
        System.out.println(Arrays.toString(arr1));
        System.out.println("=============================");

        int [] num={10,5,8,10,55,13};
        Arrays.sort(num);
        System.out.println("Max num is: "+num[num.length-1]);
        System.out.println("Min number is: "+num[0]);

        System.out.println("------------------------------------");

        int[] arr2={1,2,3};
        int[] arr3={1,2,3};
        int[] arr4={3,2,1};
        Arrays.sort(arr4);

        boolean r1=Arrays.equals(arr3,arr4);
        System.out.println(r1);


    }
}
