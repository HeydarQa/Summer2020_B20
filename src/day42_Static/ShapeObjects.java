package day42_Static;

public class ShapeObjects {
    public static void main(String[] args) {

        //r=25; what would be area?
        Circle c1=new Circle();
        c1.setInfo(25);
        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimeter());

        System.out.println(c1);
        System.out.println("-----------------------------------");
        Circle c2=new Circle();
        System.out.println(c2);

    }
}
