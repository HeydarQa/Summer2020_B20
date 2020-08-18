package day23_Arrays;


import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        String[] months={"Jan","Feb","Mar","Apr","May", "June", "July","Aug","Sep","Nov","Dec"};
        System.out.println("Enter a number between 1~12");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(months[n-1]);


    }
}
