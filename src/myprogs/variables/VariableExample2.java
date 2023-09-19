package myprogs.variables;

public class VariableExample2 {
     int a;
     static String b = "my prog";

    public static void main(String[] args) {
        VariableExample2 obj1 = new VariableExample2();
        obj1.a = 33;
        System.out.println(obj1.a);
        VariableExample2 obj2 = new VariableExample2();
        obj2.a = 100;
        System.out.println(obj2.a);
        System.out.println(VariableExample2.b);
        VariableExample2.b = "Saif";
        System.out.println(VariableExample2.b);
    }
}
