package myprogs.Constructors;

class ConstructorEx3 {
    ConstructorEx3() {
        this(10);
    }
    ConstructorEx3(int x){
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        ConstructorEx3 Obj = new ConstructorEx3();
    }
}
