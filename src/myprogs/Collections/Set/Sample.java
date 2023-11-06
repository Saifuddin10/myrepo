package myprogs.Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sample {
    List<String> str = new ArrayList<>();

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Saif");
        s.add("Vishnu");
        s.add("Gowtham");
        s.add("VVR");
        s.add("VVR");
        System.out.println(s);
    }
}
