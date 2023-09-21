package myprogs.IfCondition;

import java.util.Scanner;

public class IfConditionExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Gender :");
        String str2 = sc.nextLine();
        System.out.println("Enter your age :");
        int a = sc.nextInt();
        if (str2.equalsIgnoreCase("M") || str2.equalsIgnoreCase("male")){
            if (a > 18) {
                System.out.println("Hi men");
            } else if (a < 18) {
                System.out.println("Hi boy");
            }
        } else if (str2.equalsIgnoreCase("F")|| str2.equalsIgnoreCase("Female")) {
            if (a > 18) {
                System.out.println("Hi woman");
            } else if (a < 18) {
                System.out.println("Hi girl");
            }
        } else {
            System.out.println("Please enter correct gender (M or F) or (Male or Female)");
        }
    }
}
