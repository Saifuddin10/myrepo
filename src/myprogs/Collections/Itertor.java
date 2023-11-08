package myprogs.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Itertor {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("ab");
        ar.add("bc");
        ar.add("cd");
        ar.add("de");
        Iterator<String> iterator = ar.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        int currentIndex = 0;
        while (currentIndex < ar.size()) {
            String element = ar.get(currentIndex);
            System.out.println(element + " ");
            currentIndex++;
        }
        currentIndex = ar.size() - 1;
        while (currentIndex >= 0) {
            String element = ar.get(currentIndex);
            System.out.println(element + " ");
            currentIndex--;
        }
    }
}