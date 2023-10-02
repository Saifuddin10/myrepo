package myprogs.MultiDimensionalArray;

import java.util.Scanner;

public class MDArraySumMulEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the values  :");
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int multiplication = 1;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
                multiplication *= arr[i][j];
            }
            System.out.println("Sum of all the values in row  is = " + sum);
            System.out.println("Multiplication of all the values in row is = " + multiplication);
        }
    }
}