package myprogs.IfCondition;

import java.util.Scanner;

public class IfConditionExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name : ");
        String str1 = sc.nextLine();
        System.out.println("Enter no of units");
        int a = sc.nextInt();
        System.out.println(str1 + " given units is :" + a);
        double billAmount = 0;
        double discountAmount;
        if (a < 100) {
            billAmount = a * 2;
        } else if (a >= 100 && a <= 500) {
            billAmount = (100 * 2) + ((a - 500) * 5);
        } else if (a > 500 && a <= 1000) {
            billAmount = (a - 500) * 10 + (a - (a - 500) - 100) * 5 + (100 * 2);
        }
        System.out.println(str1 + "Your electricity bill is:" + billAmount + "Rs.");
        if (billAmount > 2000) {
            discountAmount = billAmount * ((double) 10 / 100);
            billAmount = billAmount - discountAmount;
            System.out.println(str1 + "Your electricity bill after discount is " + billAmount);
        }
    }


}
