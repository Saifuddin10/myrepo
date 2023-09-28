package myprogs.SingleDimensionalArrays;

import java.util.Scanner;

public class ArrayExample7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number :");
            int a = sc.nextInt();
            arr[i] = a;
        }
        for (int var : arr) {
            if (var % 2 == 0) {
                System.out.println("Even numbers are :" + var + " ");
            }
        }
        for (int var1 : arr) {
            if (var1 % 2 != 0) {
                System.out.println("Odd numbers are :" + var1 + " ");
            }
        }
    }
}