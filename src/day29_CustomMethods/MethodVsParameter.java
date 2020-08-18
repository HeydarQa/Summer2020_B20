package day29_CustomMethods;

public class MethodVsParameter {

    public static void main(String[] args) {
        printHello(5);
        age(2005);
    }
    public static void printHello(int n){
        for (int i=0;i<n;i++){
            System.out.println("Hello World");
        }
    }

    public static void age(int birthYear){
        int age=2020-birthYear;
        System.out.println("You are "+age+" years old");
    }

}
