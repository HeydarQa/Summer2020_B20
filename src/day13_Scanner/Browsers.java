package day13_Scanner;

import com.sun.corba.se.spi.ior.IdentifiableFactory;

public class Browsers {
    public static void main(String[] args) {

        String browserName="chrom";
        // boolean, long, double, float hasn't to be on switch
        switch (browserName){
            case "chrome":
                System.out.println("Opening Chrome Browser");
                break;
            case "firefox":
                System.out.println("Opening Firefox Browser");
                break;
            case  "opera":
                System.out.println("Opening Opera Browser");
                break;
            case  "safari":
                System.out.println("Opening Safari Browser");
                break;
            case "edge":
                System.out.println("Opening Edge Browser");
                break;
            default:
                System.out.println("Invalid input");

        }


        }



    }

