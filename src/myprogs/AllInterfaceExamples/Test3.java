package myprogs.AllInterfaceExamples;

class Out {
    int count;

    public void display() {
        In in = new In();
        in.show();
    }

    class In {
        public void show() {
            System.out.println("Inside inner " + (++count));
        }
    }
}

public class Test3 {
    public static void main(String[] args) {
        Out out = new Out();
        Out.In in = out.new In();
        in.show();
    }

}

