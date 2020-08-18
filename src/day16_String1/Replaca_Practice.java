package day16_String1;

public class Replaca_Practice {
    public static void main(String[] args) {
        String word="java";
        word=word.replace("a","H");

        System.out.println(word);

        String sentence="I like to learn Java, Java is cool, Java is fun";
        sentence=sentence.replace("a, Java","a, C#");
        sentence=sentence.replace("Java ","Python ");
        System.out.println(sentence);

        System.out.println("========================");

        String ss="I like to stay in CyberteK, cyberteK is nice place";
       ss= ss.replace("Cybertek","MIT");
       ss=ss.replace("K","kk");
        System.out.println(ss);

        System.out.println("=---------------------------------=");

        String t1="I like to drink tea and tea";
        t1=t1.replaceFirst("tea","cola");
        System.out.println(t1);
// indexOf
        String s5="I arne like to stay in cybertek,we are learning java";
        int r5=s5.indexOf("re"); //returns the first char "r" index
        int r6=s5.indexOf("rn");
        System.out.println(r6);


    }
}
