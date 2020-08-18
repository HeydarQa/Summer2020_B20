package day14_Recap;

import java.util.Scanner;

public class contributor {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in); //Enter
            System.out.println("Enter your gender");
            String gender = input.next(); // female

            System.out.println("Enter your age: ");
            int age = input.nextInt(); // 19

            input.nextLine(); // Enter Enter

            System.out.println("Enter your country name: ");
            String countryName = input.nextLine();

            System.out.println("Enter your zipcode: ");
            int zipCode = input.nextInt(); //12345

            input.nextLine(); // Enter

            System.out.println("Enter your full name");
            String fullName = input.nextLine();

            System.out.println("Enter your company name");
            String companyName = input.nextLine();
    }
}
