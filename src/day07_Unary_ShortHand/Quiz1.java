package day07_Unary_ShortHand;

public class Quiz1 {
    public static void main(String[] args) {
        int iNum=100;
        double dNum=200;
        float fNum=300;

       // iNum=fNum; error
        iNum=(int)fNum;  // is Ok
        double num =0;
        System.out.println(num);




    }
}
