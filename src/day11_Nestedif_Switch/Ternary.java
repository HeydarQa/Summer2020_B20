package day11_Nestedif_Switch;

import java.util.stream.StreamSupport;

public class Ternary {
    public static void main(String[] args) {
        int num=10;
        String result="";
        if (num%2==0){
            result="Even";
        }else{
            result="Odd";
        }
        System.out.println("++++++++++++++++++++++");

        int num1=1000;
        int num2=200;
        int max1=0;

        int max2=(num1>num2)? num1 : num2;
        System.out.println(max2);
        System.out.println("_________________________________");

        int age=22;
        boolean eligible=false;
        if (age >= 21) {
            eligible=true;
        }else{
            eligible=false;
        }
        boolean eligible1=(age>=21)? true:false;
        System.out.println(eligible1);
        System.out.println("*************************************");

        int ageVote=100;
        String resultVote=(ageVote>=18)? "can vote":"Cannot vote";
        System.out.println(resultVote);
        System.out.println("________________________________________________");

        int numm=12024;
        String resultt=(numm%2==0)? numm +" is even":(numm+" is odd");
        System.out.print(resultt);

    }
}
