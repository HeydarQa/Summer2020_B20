package Office_Hours.Practice_07_20_2020;

public class Max_2DArray {
    public static void main(String[] args) {

        /*
        write a program that can find the maximum number from any given two dimensional array
        solution one: use nested for loops
        solution two: use nested for each loops
        solution three: use for loop and for each loop together
        class: Max_2DArray
         */

        int [][] arr2D={{15,2,3}, {4,5,6,7}, {8,9,10,11,12}};

        int max=arr2D[0][0];
        for (int j=0;j<arr2D.length;j++) {   // j : index number of arrays

            int[] eachArray = arr2D[j];
            for (int i = 0; i <= eachArray.length - 1; i++) {   // i : index numbers of elements
                int eachNum = eachArray[i];
                if (max < eachNum) {
                    max = eachNum;
                }
            }
        }
        System.out.println("Maximum: "+max);
    }
}
