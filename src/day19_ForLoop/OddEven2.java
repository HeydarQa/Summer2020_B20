package day19_ForLoop;

public class OddEven2 {
    public static void main(String[] args) {
        for (int i=1;i<=50;i++){ // print even number
            if (i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }


    }
}
