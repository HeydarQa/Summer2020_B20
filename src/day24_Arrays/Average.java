package day24_Arrays;

public class Average {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int sum=0;

        for (int i=0;i<=arr.length-1;i++){
            sum+=arr[i];
        }
        double average=(double)sum/arr.length;
        System.out.println(average);
    }
}
