package day09_IfStatements;

public class Vote {
    public static void main(String[] args) {
        int age=15;
        boolean usCitizen=true;

        if(age>=18&&usCitizen){
            System.out.println("Eligible to Vote to Trump");
        }else{
            System.out.println("Not eligible vote to Trump");
        }



    }
}