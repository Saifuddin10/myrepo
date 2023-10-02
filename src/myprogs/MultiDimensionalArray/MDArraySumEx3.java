package myprogs.MultiDimensionalArray;

import java.util.Scanner;

public class MDArraySumEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        int sum = 0;
        for (int i = 0 ; i < array.length ; i++){
            for (int j = 0 ; j < array.length ; j++){
                System.out.println("Enter the values :");
                int arr = sc.nextInt();
                array[i][j] = arr;
                sum = sum + array[i][j];
            }
            System.out.println("Sum of all Elements is :" +sum);
            }
        }
    }

