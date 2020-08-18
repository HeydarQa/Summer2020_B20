package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Beslan = new BankAccount();
        BankAccount Ahmet = new BankAccount();
        BankAccount Viorel = new BankAccount();
        BankAccount Waqar = new BankAccount();


        Beslan.setAccountInfo("Cheching", "Beslan", "24680");
        Ahmet.setAccountInfo("Checking", "Ahmet", "1234567");
        Viorel.setAccountInfo("Checking", "Viorel", "234567");
        Waqar.setAccountInfo("Checking", "Waqar", "987654321");

        ArrayList<BankAccount> account = new ArrayList<>();
        account.addAll(Arrays.asList(Beslan, Ahmet, Viorel, Waqar));

        for (BankAccount each : account) {
            each.deposit(500);
            each.getAccountInfo();
        }

        account.get(3).deposit(1000);
        account.get(3).checkBalance();

        account.get(0).deposit(700);
        account.get(0).checkBalance();
        System.out.println("----------------------------------------------");

        account.removeIf(each->each.balance<1000);
        for (BankAccount each:account){
            each.getAccountInfo();
        }



    }
}
