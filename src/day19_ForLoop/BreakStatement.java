package day19_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            break;

        }
        System.out.println("=====================");
        for (char ch='A';ch<='H';ch++){
            System.out.println(ch+"");
            if (ch=='C'){
                break;
            }

        }
        System.out.println("==============================");
        for (int i=10;i<=50;i+=10){
            if (i == 30) {
                break;
            }
            System.out.print(i+" ");
        }

    }
}
