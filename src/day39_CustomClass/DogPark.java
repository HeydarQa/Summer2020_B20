package day39_CustomClass;

import java.util.Arrays;

public class DogPark {
    public static void main(String[] args) {

        //dogPark

        Dog [] dogParkone={new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};

        dogParkone[0].setDogInfo("Kaplan","Pitbull","medium",2,"black");
        dogParkone[1].setDogInfo("Akbas", "Anatolian Sheppard", "Large",  2, "White");
        dogParkone[2].setDogInfo("Red", "Golden", "Medium",  4, "Yellow");
        dogParkone[3].setDogInfo("Roko", "German Sheper", "Medium", 3, "Brown");
        dogParkone[4].setDogInfo("Red", "Golden", "Medium",  4, "Yellow");

        for (int i=0; i<=dogParkone.length-1;i++){
            dogParkone[i].getDogInfo();
            System.out.println("/////////////////////*//////////////////");


            for (Dog eachDog:dogParkone){
                eachDog.getDogInfo();
                System.out.println("----------------------------------------");

                String food="treats";

                String drink="milk";





            }

        }







    }
}
