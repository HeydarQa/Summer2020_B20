package day07_Unary_ShortHand;
/*
write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */
public class Divisible {
    public static void main(String[] args) {
        int num=65;
        boolean result2=num%2==0;
        boolean result3=num%3==0;
        boolean result5=num%5==0;
        System.out.println("Is "+num+" evenly divisible by 2: "+result2);
        System.out.println("Is "+num+" evenly divisible by 3: "+result3);
        System.out.println("Is "+num+" evenly divisible by 5: "+result5);

    }
}
