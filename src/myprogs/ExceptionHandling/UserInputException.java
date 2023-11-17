package myprogs.ExceptionHandling;

import java.util.Scanner;

public class UserInputException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter an integer : ");
            int userInputInt = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter a String : ");
            String userInputString = sc.nextLine();

            if (userInputInt == 0 & userInputString.isEmpty()) {
                throw new RuntimeException("Both inputs could not be 0 and an empty string at the same time");
            } else {
                System.out.println("Inputs are valid");
            }                                                                    
        } catch (RuntimeException re) {
            System.out.println("Exception caught " + re.getMessage());
        } catch (Exception e) {
            System.out.println("An un excepted error occurred");
        }
    }
}
