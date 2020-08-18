package day21_Loops;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int a = 20; //2
        int b = 3;

        if(b == 0){
            System.out.println("Invalid Input");
            System.exit(0);
        }


        int count = 0; //3

        while(a >= b){
            a -= b;
            count++;
        }

        System.out.println(count+" with a remainder of "+a);

    }
}
