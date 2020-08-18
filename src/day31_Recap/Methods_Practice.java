package day31_Recap;

public class Methods_Practice {
    public static void main(String[] args) {

        max(5, 10);
        max2(10,55);


    }

    public static void max(int a, int b) {
        int max = a > b ? a : b;
        System.out.println(max);
    }

    public static int max2(int a, int b) {
     return a > b ? a : b;
    }
}
