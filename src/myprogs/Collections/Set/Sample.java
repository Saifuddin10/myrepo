package myprogs.Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Apple");
        arrayList.add("Orange");
        Set<String> set = new HashSet<>(arrayList);
        System.out.println("Set elements: " + set);
    }
}
