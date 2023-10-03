package myprogs.MethodsInOops;

import java.util.Scanner;

public class MethodOopsEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number :");
        int num2 = sc.nextInt();
        Scr obj = new Scr();
        obj.sum(num1, num2);
    }
}

class Scr {
    int sum = 0;

    public void sum(int num1, int num2) {
        sum = num1 + num2;
        if (sum % 2 == 0) {
            System.out.println("Sum of the given numbers is Even ");
        } else {
            System.out.println("Sum of the given numbers is Odd");
        }
    }
}