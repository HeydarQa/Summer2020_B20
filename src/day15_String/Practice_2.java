package day15_String;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name: ");

        String firstName=scan.next();

        System.out.println("Enter your last name: ");
        String lastName=scan.next();

//concat

        String fullname= firstName+" "+lastName;
        System.out.println("Your full name is: "+fullname);


        //toLowerCase
        String name1="CYBERTEK";
        String tring = name1.toLowerCase();
        System.out.println(tring);

    }
}
