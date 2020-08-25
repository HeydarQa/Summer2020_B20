package Office_Hours.Practice_08_19_2020;

import java.util.ArrayList;

public class PizzaObjects {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzaForBatch20 = new ArrayList<>();
        for (int i = 0; i < 400; i++) {
            Pizza myPizza = new Pizza();
            myPizza.setPizzaInfo("large", 2, 0);
            pizzaForBatch20.add(myPizza);
        }

        System.out.println("Total Number of Pizza: " + pizzaForBatch20.size());
        double totalPrice = 0;
        for (Pizza each : pizzaForBatch20) {
            each.calcPrice();
            totalPrice += each.calcPrice();
        }

        System.out.println("Total Price: " + totalPrice);
        System.out.println("*******************************************");

        Pizza pizza1 = new Pizza();
        pizza1.setPizzaInfo("Large",3,4);

        Pizza pizza2=new Pizza();
        pizza2.setPizzaInfo("Medium",3,2);

        System.out.println(pizza1);
        System.out.println(pizza2);



    }
}
