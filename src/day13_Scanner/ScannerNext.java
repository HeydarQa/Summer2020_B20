package day13_Scanner;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your company name: ");
        String companyName =    scan.nextLine();


        System.out.println("Your company name: " +companyName);
    }
}
