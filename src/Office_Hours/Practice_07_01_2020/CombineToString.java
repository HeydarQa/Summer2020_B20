package Office_Hours.Practice_07_01_2020;

import java.util.Scanner;

public class CombineToString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        String str2=scan.next();

        //String str1="One";
        //String str2="two";

        char ch1= str1.charAt(str1.length()-1);
        char ch2=str2.charAt(0);
        if( ch1==ch2){
            System.out.println(str1+str2.substring(1));
        }else {
            System.out.println(str1+str2);
        }
        System.out.println("-------------------------------------");


    }
}
