package myprogs.Arrays;

import java.util.Scanner;

public class ArraysExample6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        String[] str = new String[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Integre :");
            int a = sc.nextInt();
            arr[i] = a;
            sc.nextLine();
            System.out.println("Enter a String :");
            String b = sc.nextLine();
            str[i] = b;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("From Integer array = " + arr[i]);
            System.out.println("From String array = " + str[i]);
        }
    }
}
