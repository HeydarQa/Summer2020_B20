package day22_NestedLoop;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class OccurancesOfChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char ch= scan.next().charAt(0);
        //char ch='c'; // how many time occur in string
        int count=0;


        for (int i=0;i<str.length()-1;i++){
            char each=str.charAt(i); // a,b,a,b,c
            if (each==ch){
                count+=1;
            }

        }
        System.out.println(count);

        /*
        int index = 0;
            while(index <= str.length()-1  ){
                char each = str.charAt(index);  // a  b a b c
                if( each == ch ){  // if true, means ch is occured in str
                    count += 1;
                }
              index++;
         */
    }
}
