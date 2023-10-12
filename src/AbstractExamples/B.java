package AbstractExamples;

abstract class A{
    abstract void callMe();
    }

public class B extends A {
    @Override
    void callMe() {
        System.out.println("Calling you");
    }

    public static void main(String[] args) {
        B b = new B();
        b.callMe();
    }
}
