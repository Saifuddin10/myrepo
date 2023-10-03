package myprogs.MethodsInOops;

public class MethodOopsEx3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        Ssc obj = new Ssc();
        obj.oddOrEven(arr);
    }
}

class Ssc {
    public void oddOrEven(int[] arr) {
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[j] = arr[i];
                j++;
            } else {
                odd[k] = arr[i];
                k++;
            }
        }
        System.out.println("Even numbers are : ");
        for (int a : even) {
            System.out.print(a + " ");
        }
        System.out.println("\n odd numbers are : ");
        for (int a : odd) {
            System.out.print(a + " ");
        }
    }
}