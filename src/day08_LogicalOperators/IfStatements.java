package day08_LogicalOperators;

public class IfStatements {
    public static void main(String[] args) {
/*
 int age=18;
        if(age)>=18;

 */
       // write smallest number between two

        int a=60;
        int b=60;

        if(a>b){
            System.out.println(a+" is the max number");
        }
        if (b>a){
            System.out.println(b+" is the max number");
        }
        if (a==b){
            System.out.println("a and b is same number");
        }

        System.out.println("+++++++++++++++++++++++++++++++");
        boolean BreakTime=false;

        if (BreakTime==true){
            System.out.println("Take 15 minutes break!");
        }
        if (BreakTime!=true){
            System.out.println("Keep studying!");
        }
        System.out.println("_____________________________");
        boolean Corona=true;

        if (Corona==true){
            System.out.println("Buy more toilet peppers");
        }

        System.out.println("================================");

        double Angle1=45.5;
        double Angle2=120;
        double Angle3=20;

        boolean valid=Angle1+Angle2+Angle3==180;
        boolean invalid=!valid;

        if (valid) {
            System.out.println("it is valid triangle");

        }
        if(invalid){
            System.out.println("It is not valid triangle");
        }


    }

}
