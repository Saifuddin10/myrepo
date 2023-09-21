package myprogs.Loops;

import java.util.Scanner;

public class LoopsExample2 {
    public static void main(String[] args) {
        System.out.println("Enter a table number :");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(i + "*" + j + "=" + i * j);
        }
    }
}
