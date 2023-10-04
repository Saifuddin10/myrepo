package myprogs.InheritanceInOops;

class Parent {
    public void P1() {
        System.out.println("Parent Method");
    }
}

public class ChildEx1 extends Parent {
    public void C1() {
        System.out.println("Child Method");
    }

    public static void main(String[] args) {
        ChildEx1 obj = new ChildEx1();
        obj.P1();
        obj.C1();
    }
}
