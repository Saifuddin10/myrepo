package myprogs.MultiDimensionalArray;

import java.util.Scanner;

public class MDArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter a number for row  and column : ");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            int multiplication = 1;
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];
                multiplication *= array[i][j];
            }

            if (sum > 100) {
                System.out.println("Sum of the numbers in row " + i + " exceeds 100");
            }

            if (multiplication > 100) {
                System.out.println("Product of the numbers in row " + i + " exceeds 100");
            }
        }
    }
}




