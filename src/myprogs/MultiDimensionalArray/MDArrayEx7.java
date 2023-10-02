package myprogs.MultiDimensionalArray;

import java.util.Scanner;

public class MDArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] array = new String[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Enter a String :");
                array[i][j] = sc.nextLine();
            }
        }
        for (int i = 0 ; i < array.length ; i++){
            for (int j = 0 ; j < array.length ; j++){
                if (array[i][j].contains("@") || array[i][j].contains("$")) {
                    System.out.println("The given string \"" + array[i][j] + "\" contains a special character.");
                }
                else{
                    System.out.println("it is normal string ");
                }
            }
        }
    }
}
