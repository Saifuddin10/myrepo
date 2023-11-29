package InternalExams;

import java.util.Map;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second String : ");
        String str2 = sc.nextLine();
        System.out.println("Entered Strings are : ");
        System.out.println("1." + str1);
        System.out.println("2." + str2);
        System.out.println("Select a String from above : ");
        int selectingString = sc.nextInt();
        sc.nextLine();
        String chooseString = (selectingString == 1) ? str1 : str2;
        System.out.println("The operations are : ");
        System.out.println("1. LowerCase");
        System.out.println("2. UpperCase");
        System.out.println("3. toString");
        System.out.println("Select operation to perform : ");
        int operationNum = sc.nextInt();
        sc.nextLine();
        switch (operationNum) {
            case 1:
                System.out.println("After converting to Lowercase the output is : " + chooseString.toLowerCase());
                break;
            case 2:
                System.out.println("After converting to UpperCase the output is : " + chooseString.toUpperCase());
                break;
            case 3:
                System.out.println("After converting to toString the output is : " + chooseString.toString());
                break;
        }
    }
}