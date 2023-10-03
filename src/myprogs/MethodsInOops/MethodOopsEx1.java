package myprogs.MethodsInOops;

import java.util.Scanner;

public class MethodOopsEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number");
        int num2 = sc.nextInt();
        saif obj = new saif();
        obj.add(num1, num2);
        obj.multiply(num1, num2);
        obj.divide(num1, num2);
        obj.mod(num1, num2);
        obj.sub(num1, num2);
    }

}

class saif {
    public void add(int num1, int num2) {
        int add = num1 + num2;
        System.out.println("Addition of given numders is :" + add);
    }

    public void multiply(int num1, int num2) {
        int multiply = num1 * num2;
        System.out.println("Multiplication of given numders is :" + multiply);
    }

    public void divide(int num1, int num2) {
        int divide = num1 / num2;
        System.out.println("Division of given numders is :" + divide);
    }

    public void sub(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("Subtraction of given numders is :" + sub);
    }

    public void mod(int num1, int num2) {
        int mod = num1 % num2;
        System.out.println("ModularDivision of given numders is :" + mod);
    }
}
