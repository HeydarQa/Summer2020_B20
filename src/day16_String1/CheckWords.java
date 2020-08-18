package day16_String1;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String str="I like Java";


        if(str.length()==0){
            System.out.println("empty string");
        }else if(str.length()>3){
            String last=str.substring(str.length()-3);
            System.out.println(last);
        }else{
            System.out.println(str);
        }
        System.out.println("=========================================");

        String str1= "aj";
        String str2="abe";
        String str3="ab";
        boolean allSame=str1.length()==str2.length()&&str1.length()==str3.length();
        boolean allDifferent=str1.length()!=str2.length()&&str2.length()!=str3.length()&&str1.length()!=str3.length();

        if(allSame){
            System.out.println("All words are same length");
        }else  if(allDifferent){
            System.out.println("All different length");
        }else {
            System.out.println("No same no different lengths");

        }





    }
}
