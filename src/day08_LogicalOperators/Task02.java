package day08_LogicalOperators;
/*
2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
 */

public class Task02 {
    public static void main(String[] args) {
        int x = 300; //
        int y = 400; //
        int z = x + y - x * y +x / y;
        //      300+400-300*400+300/400
        //      300+400-120000+0
        //      z = 119 300
        System.out.println(z);

    }
}
