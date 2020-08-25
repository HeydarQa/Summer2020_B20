package Office_Hours.Practice_08_24_2020;

import java.util.Arrays;

public class Array_Recap2 {
    public static void main(String[] args) {

        int [] nums={2,3,4,5,6,7,8};

        for (int each:nums){
            if (each%3!=0){
                continue;
            }
            System.out.print(each+" ");
        }
        System.out.println("---------------------------------------");

        String[] names={"Heydar","Basdi","Shukran","Fatih","Maryam"};

        for (String each :names) {
            if(each.toLowerCase().contains("d")){
                System.out.println(each);
            }

        }
        System.out.println("------------------------------------");

        int [] arr1={89,55,800,325,12,-50,45,-85};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("=============================================");

        int[] a1={1,2,3,4};
        int[] a2={1,2,4,3};
        System.out.println(Arrays.equals(a1,a2));

        System.out.println("**********************************************");
/*
        String str="A045#$1";
        int result=0;
        for (int i=0;i<=str.length()-1;i++){
            //if (Character.isDigit(str.charAt(i))){
            if (str.charAt(i)>47&&str.charAt(i)<58){
                result+=str.charAt(i);

            }

        }

        System.out.println(result);
*/
        String str="A045#$1";


        int result = 0;
        
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58) {

                result += str.charAt(i)-'0';

            }


        }
        System.out.println(result);


    }
}
