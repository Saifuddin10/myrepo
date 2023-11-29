package myprogs.AutoBoxingAndUnBoxing;

public class AutoboxingAndUnboxingInMethod {
    // autoboxing in parameters
    static int add(int a, int b) {
        //unboxing in return
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(100, 250);
        System.out.println("Sum is : " + sum);
    }
}
