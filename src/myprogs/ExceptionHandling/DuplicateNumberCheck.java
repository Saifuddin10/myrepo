package myprogs.ExceptionHandling;

import java.util.*;

public class DuplicateNumberCheck {

    public static List<Integer> readNumbersFromTheUser() {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to input? : ");
        int count = sc.nextInt();
        System.out.println("Input the integers : ");
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }
        return numbers;
    }

    public static void checkDuplicates(List<Integer> numbers) throws DuplicateNumberException {
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (set.contains(num)) {
                throw new DuplicateNumberException("Duplicate number found: " + num);
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        try {
            List<Integer> numbers = readNumbersFromTheUser();
            checkDuplicates(numbers);
            System.out.println("No duplicate numbers!");
        } catch (DuplicateNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
