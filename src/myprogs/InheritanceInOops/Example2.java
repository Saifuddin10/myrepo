package myprogs.InheritanceInOops;

public class Example2 {
    public static void main(String[] args) {
        C Obj = new C();
        Obj.m1();
        Obj.m2();
        Obj.m3();

    }
}

class A {
    public void m3() {
        System.out.println("My name is Saif");
    }
}

class B extends A {
    public void m2() {
        System.out.println("My name is Vishnu");
    }
}

class C extends B {
    public void m1() {
        System.out.println("My name is Gowtham");
    }
}
