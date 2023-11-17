package myprogs.ExceptionHandling;

import java.util.Scanner;

public class ExceptionsWithStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name : ");
        String userName = sc.nextLine();
        if (userName.contains("$")){
            System.out.println("User name is not valid");
        }else {
            System.out.println("User name is valid");
        }
    }
}
