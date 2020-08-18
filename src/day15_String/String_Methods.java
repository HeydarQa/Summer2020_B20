package day15_String;

import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName=scan.next();
        System.out.println("Enter your second name: ");
        String secindname=scan.next();

        // name.charAt() - index charchters on tex
        char first=firstName.charAt(0);
        char second=secindname.charAt(0);
        System.out.println("Your initial is: "+first+"."+second);


        // caharAt(index)
       // char first= name.charAt(0);
        //System.out.println(first);
        //char ch1= name.charAt(-1);


        //length() = > int length of text

        String name="Cybertek";
        int l= name.length();
        System.out.println(l);


        int lastt=name.length()-1;
        lastt= name.charAt(lastt);

        System.out.println(lastt);


        // trim() - remove the unused space.  return new string


        String nn="      Hello world    ";
        nn=nn.trim();
        System.out.println(nn);


    }
}
