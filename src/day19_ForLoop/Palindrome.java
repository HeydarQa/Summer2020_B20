package day19_ForLoop;

public class Palindrome {
    public static void main(String[] args) {
        String str="ayaya";
        String reserv="";

        for (int i=str.length()-1;i>=0;i--){
           reserv+= str.charAt(i);
        }
        System.out.println(reserv);
        System.out.println(str.equals(reserv));
    }
}
