package day20_whileLoops;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your password: ");

        String password="123";
        String input=scan.nextLine();

        while(!input.equals(password)){
            System.out.println("Enter your password again");
        input=scan.nextLine();
        }
        System.out.println("Login in");
    }
}
