package day12_switch_Scanner;

public class Switch_Pratice2 {
    public static void main(String[] args) {
        String productName="iPad";
        switch (productName){
            case "Galaxy":
                System.out.println("Samsung");
                break;
            case "iPhone":
            case"iPad":
            case "MacBook":
                System.out.println("Apple");
                break;
        }


    }
}
