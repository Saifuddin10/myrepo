package myprogs.ExceptionHandling;

public class NestedCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {5, 0, 4, 3};
            try {
                int x = arr[3] / arr[1];
            } catch (ArithmeticException e) {
                System.out.println("Divisible by zero : " + e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception");
        }
    }
}

