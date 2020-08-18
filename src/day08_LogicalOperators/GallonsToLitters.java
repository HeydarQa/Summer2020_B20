package day08_LogicalOperators;
/*
warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785

 */
public class GallonsToLitters {
    public static void main(String[] args) {
        double gallons=15;
        double litters =gallons*3.785;

        System.out.println(gallons + " gallons equal "+litters+" litters");

        double litter=200;
        double gallon=litter/3.785;
        System.out.println(litter + " litter equal "+(int)gallon+" gallon");

    }


}
