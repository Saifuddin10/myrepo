package myprogs.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class List {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("Apple");
        str.add("Mango");
        str.add("Banana");
        str.add("Orange");
        str.add("Apple");
        str.add("Grapes");
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
}
