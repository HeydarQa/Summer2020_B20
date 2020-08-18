package day32_MethodOverloading;

import Library.Util;

public class MethodCalls {

    public static void main(String[] args) {

        String firstName="elKem";
        String lastName="EmET";
        String fullName;

      fullName=Util.formatFullName(firstName,lastName);
        System.out.println(fullName);
        String unique=Util.uniques(fullName);

        System.out.println(unique);
        String reverse=Util.reverse(fullName);
        System.out.println(reverse);

    }
}
