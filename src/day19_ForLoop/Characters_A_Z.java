package day19_ForLoop;
/*
    5. Write a program that will print out all letters in English alphabet in ascending order
    6. Write a program that will print out all letters in English alphabet in descedning order
 */
public class Characters_A_Z {
    public static void main(String[] args) {

//A65 - Z90


        for (char ch='a';ch<='z';ch++){
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("---------------------------");

        for (int i=97;i<=122;i++){
            char ch=(char)i;
            System.out.print((char)i);

        }
        System.out.println();

        for (int i=122;i>=97;i--){
            char ch=(char)i;
            System.out.print((char)i);
    }
        System.out.println();
        System.out.println("----------------------------");
       // for (int i=0;i<=65000;i++){
           // System.out.print((char)i);
        }
}
