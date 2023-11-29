package myprogs.Staticblock;

public class StaticBlockExample1 {
    static {
        System.out.println("Static block 1");
        System.out.println("Staic block message");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        System.out.println("Static block 2");
        System.out.println("Staic block message 2");
    }
}
