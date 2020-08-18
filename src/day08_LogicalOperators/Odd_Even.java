package day08_LogicalOperators;

public class Odd_Even {
    public static void main(String[] args) {
        int a=1000;
        boolean even=a%2==0;
        boolean odd=a%2!=0;

        if (odd){
            System.out.println(a+" is Odd number");
        }
        if (even){
            System.out.println(a+" is even number");
        }



    }
}
