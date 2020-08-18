package day15_String;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your sentence: ");
        String name=input.nextLine();

        System.out.print(name.charAt(0));
        System.out.print(name.charAt(name.length()-1));


    }
}
