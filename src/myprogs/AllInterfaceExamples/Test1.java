package myprogs.AllInterfaceExamples;

class Outside{
    int count;
    public void display(){
        for (int i = 0 ; i < 5 ; i++){
            class Inside{
                public void show(){
                    System.out.println("Inside inner " +(count++));
                }
            }
            Inside inside = new Inside();
            inside.show();
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        Outside outside = new Outside();
        outside.display();
    }
}
