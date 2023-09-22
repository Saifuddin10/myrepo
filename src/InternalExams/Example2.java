package InternalExams;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First input :");
        int a = sc.nextInt();
        System.out.println("Enter the Second input :");
        int b = sc.nextInt();
        int c = a * b;
        int d = a + b;
        if (c > 100) {
            System.out.println("Multiplication of " + a + " and " + b + " is " + c);
        }
        if (d > 100) {
            System.out.println("sum of " + a + " and " + b + " is " + d);
        }
    }
}
