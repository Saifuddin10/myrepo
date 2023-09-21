package myprogs.Loops;

import java.util.Scanner;

public class ContinueExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            if (i == a) {
                continue;
            }
            System.out.println(i);
        }
    }
}

