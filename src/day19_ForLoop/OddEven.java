package day19_ForLoop;
/*
1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
    2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
 */
public class OddEven {
    public static void main(String[] args) {

        for(int i=1;i<100;i+=2){
            if(i%3==0&&i%5==0){
                System.out.println(i);
            }
        }
        System.out.println("--------------------------");


        for(int i=0;i<=100;i+=2){
            if (i%15==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("hello");
    }
}
