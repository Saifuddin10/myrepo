package myprogs.MultiDimensionalArray;

import java.util.Scanner;

public class MDArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Enter a String :");
                arr[i][j] = sc.nextLine();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j].length() > 20) {
                    System.out.println("It i a lengthy String " + arr[i][j]);
                }else {
                    System.out.println("It is a not Lenthy string");
                }
            }
        }
    }
}

