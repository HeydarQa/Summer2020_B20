package day15_String;

public class substring_method {
    public static void main(String[] args) {
        String sencente="Java is fun";
        sencente= sencente.substring(2,5);
        System.out.println(sencente);

        System.out.println("==============================");

        String sentence2="I like Movies abd TV Series";
        String word3=sentence2.substring(7,13);
        System.out.println(word3);

        String s2="I like Java Programming Language";
        String lan=s2.substring(7);
        System.out.println(lan);

    }

}
