package day11_Nestedif_Switch;

public class Ternary_Practice1 {
    public static void main(String[] args) {

        int age=2;
        String citizen="USA";
        String result="";

        String resultVote=(age>=21&&citizen=="USA") ?"Can Vote":"Can Not Vote";
        System.out.println(resultVote);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
         int n1=50;
         int n2=50;
         String r1=(n1==n2)?"equal":"not equal";
        System.out.println(r1);



    }
}
