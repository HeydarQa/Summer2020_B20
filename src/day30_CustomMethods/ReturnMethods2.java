package day30_CustomMethods;

public class ReturnMethods2 {
    public static void main(String[] args) {
        String name="Level";
        revStr1(name);

    }


    public static  void revStr1(String  str){

        String result="";
        for (int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
            System.out.println(result);
        }
        System.out.println(result);
    }

}
