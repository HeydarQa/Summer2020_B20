package day12_switch_Scanner;

import com.sun.tools.javac.api.ClientCodeWrapper;

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner summ=new Scanner(System.in);
        System.out.println("Enter your first  number: ");
        int num=summ.nextInt();
        System.out.println("Enter your second  number: ");
        int num1=summ.nextInt();
        int sum=num+num1;
        System.out.println("Sum is "+sum);

    }
}
