package myprogs.SingleDimensionalArrays;

import java.util.Scanner;

public class ArraysExample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter the Fruit Name :");
            String b = sc.nextLine();
            str[i] = b;
        }
        for (String var : str) {
            if (var.equalsIgnoreCase("Mango")) {
                System.out.println("The given fruit is " + var + " it is a Fruit king");
            } else {
                System.out.println("The given fruit name is " + var);
            }
        }
    }
}
