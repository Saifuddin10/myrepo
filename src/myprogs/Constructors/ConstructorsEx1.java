package myprogs.Constructors;

public class ConstructorsEx1 {
    ConstructorsEx1() {
        int a = 10;
        int b = 20;
        int c = a + b;
        c = a + b;
        System.out.println("****Default constructor****");
        System.out.println("Sum of 10 + 20 = " + c);
    }

    public static void main(String[] args) {
        ConstructorsEx1 obj = new ConstructorsEx1();
    }
}
