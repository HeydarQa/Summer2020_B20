package day09_IfStatements;

import com.sun.tools.corba.se.idl.StructEntry;

/*
write a java program that can identify if a person is eligible to buy alcohol

 */
public class Alchohol {
    public static void main(String[] args) {
        boolean hasId=true;
        int age=1;

        boolean eligible=hasId&&age>=21;
        if (eligible==true){
            System.out.println("Eligible buy aclhocol");
        }
        if (eligible==!true){
            System.out.println("Go buy your milk.");
        }


    }
}
