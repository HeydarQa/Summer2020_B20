package day06_ComparisonOperators;
/*
ask01:
     task03:
            create a class called Swap, and write a program that can swap two variables' values wihtout using temporary variable
                    Ex:
                        int a =10;
                        int b= 15;
                    output:
                        System.out.println(a); ===> 15
                        System.out.println(b); ===> 10


 */

public class Swap1 {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=b;
        b=a;
        a=c;
        System.out.println(a);
        System.out.println(b);





    }

}
