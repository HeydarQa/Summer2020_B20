package day16_String1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word: ");
        String str1=scan.next();

        System.out.println("Enter your second word: ");
        String str2=scan.next();

        String last=str1.substring(1)+str2.substring(1);

        System.out.println(last);

    }
}
