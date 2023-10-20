package myprogs.AllInterfaceExamples;

class Outer {
    public void display(){
        Inner in = new Inner();
        in.show();
    }
    class Inner {
        public void show(){
            System.out.println("Inner method");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}
