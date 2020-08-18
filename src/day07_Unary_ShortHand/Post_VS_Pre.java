package day07_Unary_ShortHand;

public class Post_VS_Pre {
    public static void main(String[] args) {

        int a=10;
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println("=================================");
        int b=10;
        System.out.println(b++);
        System.out.println(b);
        System.out.println("__________________________________");
        int c=25;
        int d=c++;
        System.out.println(c);
        System.out.println(d);
        System.out.println("_______________________________");

        int x=8;
        int y=x--;
        System.out.println(y);
        System.out.println(x);
        System.out.println("_______________________________");

        //int A=-1;
       // A=-A--+A ++ / -A -- * -- A;

        int A=50;
        A=--A + A++ +A-- + A++;
        // 49 + 49+  50+    49
        System.out.println(A);


        System.out.println("++++++++++++++++++++");

        int X=4;//4
        int Y= X*4-X++;
        // Y= 4*4-4
        System.out.println(Y);





    }
}
