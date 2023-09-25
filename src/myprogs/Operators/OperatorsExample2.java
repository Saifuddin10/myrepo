package myprogs.Operators;

import java.util.Scanner;

public class OperatorsExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number =");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number =");
        int b = sc.nextInt();
        int c = a + b;
        if (c % 4 != 0) {
            if (c % 2 == 0) {
                System.out.println("The given Numbers " + a + " and " + b + " is  divisible by 4");
            } else {
                System.out.println("The given numbers " + a + " and " + b + " are not divisible by 2 , 4   ");
            }
        }
    }
}
