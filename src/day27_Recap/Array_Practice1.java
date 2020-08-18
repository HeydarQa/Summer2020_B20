package day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {
        String[] names = {"Ali", "Olga", "Veli", "Pirveli", "Asli"};

        System.out.println(Arrays.toString(names)); // all arrays print
        System.out.println(names[names.length - 1]); // last elements print
        System.out.println("--------------------------");

        for (int i = 0; i <= names.length - 1; i++) {
            // if (names[i].charAt(0)!='A'){
            if (!names[i].startsWith("A")) {
                // if (names[i].substring(0,1)=="A"){
                continue;
            }
            System.out.println(names[i]);
        }
        int[] numbers = new int[5];

        System.out.println(numbers);

        numbers[3] = 25;
        numbers[0] = 100;
        numbers[3] = 300;
        System.out.println(Arrays.toString(numbers));

        System.out.println("=================================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter");

        String[] students = new String[scan.nextInt()]; //3Enter

        scan.nextLine(); // take out the Enter in scanner
        for (int i = students.length - 1; i >= 0; i--) { //i: 0,1,2,3...students.length-1
            System.out.println("Enter a name");
            students[i] = scan.nextLine();
        }

    }
}