package day26_multiDimensionalArray;



import java.util.Scanner;

public class MultiDArray_Practies {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        // String word = scan.next();

        String textt = "Catdogcat";
        textt = textt.toLowerCase();
        for (int i = 0; i <= textt.length() - 1; i += 3) {
            if (textt.substring(0,i).equals("cat")) {
                countOfCats++;
                System.out.println(countOfCats);

            }
        }

        }
    }
