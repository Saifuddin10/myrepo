package InternalExams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Exam2ByUsingMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        for (int i = 1; i <= 2; i++) {
            System.out.print("Enter a string: ");
            String userInput = sc.nextLine();
            map.put(i, userInput);
        }
        System.out.println("Available above strings are :");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
        System.out.print("Select a string (1,2): ");
        int selectedStringKey = sc.nextInt();
        sc.nextLine();
        String selectedString = map.get(selectedStringKey);
        if (selectedString == null) {
            System.out.println("Invalid string selection.");
        } else {
            System.out.println("Select operations:");
            System.out.println("1. Lowercase(1)");
            System.out.println("2. Uppercase(2)");
            System.out.println("3. ToString(3)");
            System.out.print("Operation (1,2,3): ");
            int operationNum = sc.nextInt();
            sc.nextLine();
            switch (operationNum) {
                case 1:
                    System.out.println("After converting to Lowercase the output is : " + selectedString.toLowerCase());
                    break;
                case 2:
                    System.out.println("After converting to UpperCase the output is : " + selectedString.toUpperCase());
                    break;
                case 3:
                    System.out.println("After converting to toString the output is : " + selectedString.toString());
                    break;
            }
        }
    }
}
