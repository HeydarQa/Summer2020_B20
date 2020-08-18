package day28_Recap;

public class Email {
    public static void main(String[] args) {
        String email="cybertek@gmail.com";
        int domainNUm= email.indexOf("@");
        String name=email.substring(0,email.indexOf("@"));
        String domain=email.substring(email.indexOf("@")+1);
        System.out.println(name);
        System.out.println(domain);





    }
}
