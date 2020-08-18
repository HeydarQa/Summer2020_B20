package day27_Recap;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        /*
        sort()
        toString()
        equals()
         */
        String[] names={"Odina","Lillia", "Berk", "Emine"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] score={10,50,60,75,45};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        System.out.println("Max num: "+score[score.length-1]);
        System.out.println("Min num: "+score[0]);

        System.out.println("*********************************");
        String[] s1={"A","B","C"};
        String[] s2={"A","B","C"};

        System.out.println(Arrays.equals(s1,s2));
        String[] s3={"C","B","A"};
        System.out.println(Arrays.equals(s1,s3));
        String[] d3={};





    }
}
