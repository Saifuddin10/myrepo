package myprogs.Arrays;

public class ArraysExample2 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);//initilization
        }
        int[] var = new int[5];
        for (int i = 0; i < var.length; i++) {
            var[i] = 10;
            System.out.println(var[i]);//decleration
        }
    }
}
