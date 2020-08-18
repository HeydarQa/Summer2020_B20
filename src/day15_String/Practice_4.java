package day15_String;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName=input.next().toUpperCase();

        System.out.println("Enter your last name: ");
        String lastName=input.next().toUpperCase();

        String fullname=firstName+" "+lastName;
        System.out.println(fullname);
        


    }
}
