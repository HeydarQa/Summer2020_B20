package day13_Scanner;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in); //

        System.out.println("Enter your first name: ");
        String firstName = scan.next(); // Cybertek

        scan.next(); // School

        System.out.println("Enter your gender: ");
        String lastName = scan.next();

        String fullName = firstName+" "+lastName;

        System.out.println("Full name is: "+fullName);
    }
}
