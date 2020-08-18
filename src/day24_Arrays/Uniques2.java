package day24_Arrays;

import java.util.Scanner;

public class Uniques2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your text for uniques testing");
        String str =scan.nextLine();
        String expecteResult="";

        for (int j=0;j<=str.length()-1;j++){
            char ch1= str.charAt(j);
            int count1=0;
            for (int i=0;i<=str.length()-1;i++){
                char each=str.charAt(i);
                if (ch1==each){
                    count1++;
                }
            }
            if (count1==1){
                expecteResult+=ch1;
            }



        }


        System.out.println(expecteResult);



    }
}
