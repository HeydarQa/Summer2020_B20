package day18_ForLoop;

public class EmailDomain {
    public static void main(String[] args) {
        String email="qahaydar@gmail.com";
        int index1=email.indexOf("@");
        int index2=email.lastIndexOf(".");
        String last=email.substring(index1+1,index2);
        System.out.println(last);

        //email.substring()

String a="";
        System.out.println(a.trim());

    }
}
