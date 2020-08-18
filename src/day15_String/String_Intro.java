package day15_String;

import java.util.Scanner;
import java.lang.String;

public class String_Intro {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str="Cybertek";
        String s1="Cat";
        String s2="Cat";

        String d1="Dog";
        String d2="Dog";
        System.out.println(d1==d2); // true


        String t1=new String("Tiger");
        String t2=new String("Tiger");
        System.out.println(t1==t2); // false
        System.out.println("=====================================================");

        String c2=new String("Cybertek"); // String Pool
        String c3="Cybertek";                   // Heap
        System.out.println(c2==c3);




    }

}
