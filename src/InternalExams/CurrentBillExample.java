package InternalExams;

import java.util.Scanner;

public class CurrentBillExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user Name :");
        String str1 = sc.nextLine();
        System.out.println("Enter no of units :");
        int a = sc.nextInt();
        System.out.println(str1 + "given units is :" + a);
        double billAmount = 0;
        double discountAmount;
        if (a < 100) {
            billAmount = a * 5;
        } else if (a >= 100 && a < 750) {
            billAmount = (100 * 7.5) + ((a - 100) * 7.5);
        } else if (a > 750 && a <= 1500) {
            billAmount = (a - 750) * 15 + ((a - (a - 750) - 100)) * 7.5 + (100 * 5);
        }
        System.out.println(str1 + "Your Electricity bill is :" + billAmount + "Rs.");
        if (billAmount > 2500) {
            discountAmount = billAmount * ((double) 15 / 100);
            billAmount = billAmount - discountAmount;
            System.out.println(str1 + " Your Electricity after discount :" + billAmount + "Rs.");
        }

    }
}
