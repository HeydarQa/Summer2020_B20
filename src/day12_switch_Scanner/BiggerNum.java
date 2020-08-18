package day12_switch_Scanner;

public class BiggerNum {
    public static void main(String[] args) {
        double n1=1000;
        double n2=2000;
        double n3=300;
        boolean n1IsBigger=(n1>n2&&n1>n3);
        boolean n2IsBigger=(n2>n1&&n2>n3); //n1IsBigger==false&&n2>n3
        String result="";
      /*  if (n1IsBigger) {
            result="n1 is bigger";
        } else if (n2IsBigger) {
            result="n2 is bigger";
        }else{
            result="n3 is bigger";
        }
        System.out.println(result);

*/     String result1=(n1IsBigger)? "n1 is bigger":(n2IsBigger)? "n2 is bigger":
                "n3 is bigger";
        System.out.println(result1);
                    }
}
