package myprogs.AutoBoxingAndUnBoxing;

import java.util.ArrayList;

public class UnBoxingEx {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);                              //autoBoxing from int to Integer
        arr.add(400);
        arr.add(600);
        for (Integer i : arr){
            System.out.println(i);
        }
        //unboxing from int to Integer type
        int first  = arr.get(2);
        System.out.println("int value " + first);
    }
}
