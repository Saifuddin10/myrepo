package myprogs.MultiDimensionalArray;

public class MDArrayTwoDivEx2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println(arr[i][j] + " Is divisible by 2 " );
                } else {
                    System.out.println(arr[i][j] + " Is not divisible by 2 ");
                }
            }
        }
    }
}
