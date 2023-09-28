package myprogs.SingleDimensionalArrays;

import java.util.Scanner;

public class ArrayExample8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        int sum = 0;
        for ( i = 0; i < arr.length; i++) {
            System.out.println("Enter the number :");
            int a = sc.nextInt();
            arr[i] = a;
        }
        for (int var : arr) {
            sum = sum + var;
        }
        System.out.println("The sum of all arrays is : " + sum);
    }
}
