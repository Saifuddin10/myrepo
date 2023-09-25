package myprogs.Operators;

import java.util.Scanner;

public class OperatorsExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First  number :");
        int a = sc.nextInt();
        System.out.println("Enter the Second number :");
        int b = sc.nextInt();
        int c = a + b;
        if (c % 2 == 0 && c % 4 == 0) {
            System.out.println("The given Numbers " + a + " and " + b + " is divisible by 2 and 4");
        } else if (c % 3 == 0 && c % 6 == 0) {
            System.out.println("The given Numbers " + a + " and " + b + " is divisible by 3 and 6");
        } else {
            System.out.println("The given numbers " + a + " and " + b + " are not divisible by 2 , 3 , 4 , 6  ");
        }
    }
}


