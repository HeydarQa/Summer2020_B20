package day35_ArrayList;

import java.util.ArrayList;

/*
Warmup tasks:
    1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1

 */
public class ReversedOder {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(35);
        list.add(2, 50);
        list.add(54);
        list.add(55);
        System.out.println(list);

        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i)+" ");
        }

    }
}
