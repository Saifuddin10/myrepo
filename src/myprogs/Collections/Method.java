package myprogs.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Method {
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(1000);
        integer.add(900);
        integer.add(800);
        integer.add(600);
        integer.add(500);
        integer.add(400);
        integer.add(300);
        integer.add(200);
        integer.add(100);
        System.out.println(integer);
        Collections.sort(integer);
        int searchValue = 600;
        int index = Collections.binarySearch(integer, searchValue);
        if (index >= 0) {
            System.out.println(searchValue + " Index Value found " + index);
        } else {
            System.out.println(searchValue + " Index Value not found");
        }
        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(10);
        secondList.add(20);
        secondList.add(30);
        boolean areDisjoint = Collections.disjoint(integer, secondList);
        System.out.println("Is the original list disjoint from the second list? " + areDisjoint);
        System.out.println(integer);
        int min = Collections.min(integer);
        int max = Collections.max(integer);
        System.out.println("Minimum value : " + min);
        System.out.println("Maximum value : " + max);
        Collections.swap(integer, 1, 2);
        System.out.println("List after Swapping : " + integer);
        Collections.reverse(integer);
        System.out.println("After reversing : " + integer);
    }
}