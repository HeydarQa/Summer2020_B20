package day27_Recap;

import sun.jvm.hotspot.memory.PlaceholderEntry;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};

        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("-----------------------------");

        for (int each:arr){
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("=============================");

        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------------------");

        int[] score={10,20,30,40,50,60,70,80,90,100};
        int countdivisible=0;
            for (int each:score){
                if (each%3!=0){
                    continue;
                }
                countdivisible++;


            }

        System.out.println();
        System.out.println("==================================");

        String[] name={"AB","ABC","A","AB","ABCD"};
        for (String each:name){
            if (!each.contains("C")){
                continue;
            }
            System.out.println(each);
        }

        System.out.println("==================================");

        int[] score1 ={1,2,5,8,9,10};
        int max=score1[0];
        int min=score1[0];

        for(int each:score1){
            if (each>max){
               max=each;
            }
            if (each<min){
                min=each;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
