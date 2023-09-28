package myprogs.SingleDimensionalArrays;

import java.util.Scanner;

public class ArraysExample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number :");
            int a = sc.nextInt();
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even number = " + arr[i] );
            } else {
                System.out.println(arr[i] + " is an odd number");
            }
        }
    }
}


