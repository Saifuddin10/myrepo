package myprogs.Arrays;

import java.util.ArrayList;

public class ArraysExample1 {
    public static void main(String[] args) {
        int[] a = new int[4];
        String[] str = {"hi", "bye", "gn"};
        char[] chr = new char[4];
        a[0] = 101;
        a[2] = 17;
        str[0] = "hi";
        chr[0] = 'c';
        System.out.println(a[0]);
        System.out.println(str[0]);
        System.out.println(chr[0]);
        int[] a1 = {1, 24, 4, 3, 5};
        System.out.println(a1[3]);
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] % 4 == 0)
                System.out.println(a1[i]);
        }
        for (int var : a1) {
            if (var % 4 == 0)
                System.out.println(var);
        }
        for (String var : str) {
            System.out.println(var);
        }
    }
}