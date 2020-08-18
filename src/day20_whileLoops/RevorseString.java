package day20_whileLoops;

public class RevorseString {
    public static void main(String[] args) {

        String str="Cyeb";

        String result="";
        int index=str.length()-1;

        while (index>=0){

        result+=str.charAt(index);
        index--;
        }
        System.out.println(result);



    }
}
