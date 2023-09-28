package myprogs.SingleDimensionalArrays;

import java.util.Scanner;

public class ArraysExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a Number =");
            int a = sc.nextInt();
            arr[i] = a;
        }
        for (int var : arr) {
            System.out.println(var);
        }
    }
}
