package day08_LogicalOperators;
/*
. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?

 */
public class Post_Pre {
    public static void main(String[] args) {
        int a = 200; //201
        int b = -a++ + - --a * a-- % 2;
        //      -200  -200*200 %2
                //-200-0
        System.out.println(a);
        System.out.println(b);





    }
}
