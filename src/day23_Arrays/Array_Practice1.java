package day23_Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {
        String[] students ={"Cybertek", "Muhtar", "Asiya"};
        //                      0           1       2
      String name1=students[1];
        System.out.println(name1);
        System.out.println("====================");
        String[] studensName={"Mike","Adam", "Tony", "John", "Amy"};
        int[] studenstScore={85, 70, 95, 90, 100};


        for (int i=0;i<=studensName.length-1;i++){
            System.out.println(studensName[i]+" : "+studenstScore[i]);
        }



    }
}
