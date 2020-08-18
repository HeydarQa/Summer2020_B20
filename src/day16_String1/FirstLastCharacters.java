package day16_String1;

import java.util.Scanner;

public class FirstLastCharacters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word= scan.next();

        scan.close();

        char firstChar=word.charAt(0);
        char lastChar=word.charAt(word.length()-1);


        if(firstChar==lastChar){
            System.out.println(true);
        }else{
            System.out.println(false);

        }



    }
}
