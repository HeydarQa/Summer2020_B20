package day20_whileLoops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        double result=1;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number:");
        double a=scan.nextDouble();

        for (double i=a;i>=1;i-=1){
            result*=i;

        }
        System.out.println(result);


    }
}
