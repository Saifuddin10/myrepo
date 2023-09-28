package myprogs.Loops;

import java.util.Scanner;

public class BreakExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int a = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println("Hi");
            if (i == a) {
                break;
            }
        }
    }
}
