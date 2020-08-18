package day22_NestedLoop;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        /*
        username:cyber
        password:tek123
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your username");
        String u=scan.next();

        System.out.println("Enter your password");
        String p=scan.next();

        int attend=0;

        while (!u.equals("cyber")&&p.equals("tek123")){
            if (attend>2){
                System.out.println("Your account is locked");
                System.exit(0);
            }
            System.out.println("Invalid username or password, please re-enter");
            System.out.println("Enter your user name");
            u=scan.next();
            System.out.println("Enter your password");
            p=scan.next();

            attend++;


        }

        System.out.println("Logged in");
    }
}
