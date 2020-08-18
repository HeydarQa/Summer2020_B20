package day35_ArrayList;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Combine2Arrays_List {
    public static void main(String[] args) {

        String[] group1 = {"Aalia", "Hasan", "John", "Ernis"};
        String[] group2 = {"Irina", "Virginia", "Dawud"};

        ArrayList<String> studentsList = new ArrayList<>();
        for (String each : group1) {
            studentsList.add(each);
        }
        for (String each : group2) {
            studentsList.add(each);

        }
        System.out.println(studentsList);
    }

}