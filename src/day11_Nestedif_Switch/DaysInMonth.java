package day11_Nestedif_Switch;
/*
28 days:2
30 days: 4.6.9.11
31 days: 1.3.5.7.8.10.12
Invalid: num<1||num>12
 */
public class DaysInMonth {
    public static void main(String[] args) {
        int month=1;
        boolean days28=month==2; // for months that has 28 days
        boolean days30=month==4||month==6||month==9||month==11;
        boolean invalid=month<1||month>12;

        String result="";
        if (days28){
            result="28 days";
        }else if (days30){
            result="30 days";
        } else if (invalid) {
            result="invalid";
        }else{
            result="31 days";
        }
        System.out.println(result);

        System.out.println("---------------------------------------------");
        int num=1;
        String res=(num%2==0)? num +" is even":(num+" is odd");
        System.out.println(res);
    }
}
