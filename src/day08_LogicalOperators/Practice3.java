package day08_LogicalOperators;

public class Practice3 {

    public static void main(String[] args) {


         int b=2;
         boolean res = ++b==2||--b==2 && --b==2;
        //               3==2  2==2        -==2
        System.out.println(res);

        System.out.println("++++++++++++++++++++++++++");

        int c=5;// c=5
        boolean r2=c++==6||c--==5;

        System.out.println("_________________");
        double num1=20;
        double num2=80;
        double result =(num1+num2)*25;
        double remainder=result%40;
        boolean r= remainder<20;



    }
}
