package day11_Nestedif_Switch;

public class Ternary_Practice2 {
    public static void main(String[] args) {

        int num=0;
        String result=(num>0)? "Pozitive":(num<0)? "Negative":"Zero";
        System.out.println(result);
        System.out.println("/////////////////////////////////////");
        int a=10;
        int b=1;
        String resultnum=(a>b)? "a is greater":(a<b)?"b is greater": " a is equal to b";
        System.out.println(resultnum);

    }
}
