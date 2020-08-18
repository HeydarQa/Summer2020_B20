package day34_WrapperClass;

public class WrapperClass_Methods {
    public static void main(String[] args) {

        String str="123";
        int z=Integer.parseInt(str);

        System.out.println(z);
        System.out.println(str);

       Double d1= Double.parseDouble("7.5");
        System.out.println(d1-1);

        String s1="true";
        boolean b1=Boolean.parseBoolean(s1);
        System.out.println(b1);
        System.out.println("***********************************");

        String s2="1000000.5";
        double d2=Double.valueOf(s2);  // unboxing
        System.out.println(d2+10.5);

        String e2="FalSe";
        boolean rr= Boolean.valueOf(e2);
        System.out.println(rr);




    }
}
