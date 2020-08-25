package Office_Hours.Practice_08_24_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Recap {
    /*
    Array
    Collection
    Map
    Arrays Utility
    toString;

     */
    public static void main(String[] args) {

        int[] arr1=new int[5];
        arr1[1]=10;
        arr1[arr1.length-1]=55;
        System.out.println(arr1[4]*arr1[1]);


        System.out.println(Arrays.toString(arr1));

        int[] arr2={1,2,3,4,5};
        System.out.println(Arrays.toString(arr2));


        String[] name=new String[5];

        Scanner scan=new Scanner(System.in);
/*
        for(int i=0;i<=name.length-1;i++){
            System.out.println("Enter name: ");
            name[i]=scan.nextLine();


        }
*/
        for(int i=name.length-1;i>=0;i--) {
            System.out.println("Enter name: ");
            name[i] = scan.nextLine();

        }

        System.out.println(Arrays.toString(name));

    }
}
