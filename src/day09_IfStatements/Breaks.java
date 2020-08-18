package day09_IfStatements;

import java.util.SortedMap;

public class Breaks {

    public static void main(String[] args) {
        String itsbreakTime="Y";

        if(itsbreakTime=="Yes"){
            System.out.println("You can take 15 min break");
        }else{
            System.out.println(" Continue the class.!");
        }
        System.out.println("++++++++++++++++++++++++++++");

        int a=100;
        int b=500;

        if(a>b){
            System.out.println(a+ " is great number");
        }else{
            System.out.println(b + " is great number");
        }


    }
}
