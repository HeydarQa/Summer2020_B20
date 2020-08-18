package day26_multiDimensionalArray;

import java.util.Scanner;

public class dogcat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        word = word.toLowerCase();
        for (int i = 0; i <= word.length()-3; i++) {
            if ( word.substring(i , i+3).equals("cat")  ){ // cat
                countOfCats++;
            } else if ( word.substring(i, i+3).equals("dog")  ) {
                countOfDogs++;
            }
        }
        boolean isSame = countOfCats == countOfDogs ? true : false;
        System.out.println(isSame);
    }
}


