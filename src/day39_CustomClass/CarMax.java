package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {

        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();
        Car car5=new Car();

        car1.setCarInfo("Lexus","RX350",2019,"White",13000,25000);
        car2.setCarInfo("Lexus","RX450",2020,"Black",1000,50000);
        car3.setCarInfo("Bugatti","Veyron",2020,"Black",1000,50000);
        car4.setCarInfo("Ford","Escape",2020,"White",1000,50000);
        car5.setCarInfo("Nissan","GT-R",2015,"Black",1000,50000);


        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();
        car4.getCarInfo();
        car5.getCarInfo();

        car3.start();
        car5.start();

        car1.drive();





    }
}
