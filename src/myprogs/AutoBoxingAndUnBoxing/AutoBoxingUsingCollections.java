package myprogs.AutoBoxingAndUnBoxing;

import java.util.ArrayList;

public class AutoBoxingUsingCollections {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);          // autoboxing int to Integer
        arrayList.add(200);
        arrayList.add(300);
        for (Integer i : arrayList){
            System.out.println(i);
        }
    }
}
