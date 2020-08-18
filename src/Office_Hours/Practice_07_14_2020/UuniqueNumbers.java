package Office_Hours.Practice_07_14_2020;

public class UuniqueNumbers {
    public static void main(String[] args) {

        int[] arr={1,1,2,3,3,1999,3};

        for (int b:arr){
            int count=0;
            for (int each:arr) {
                if (each == b) {
                    count++;
                }
            }
            if (count==1){
                System.out.println(b);
            }

        }
            }
        }






