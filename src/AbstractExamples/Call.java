package AbstractExamples;

 abstract class C{
           abstract void callMe();
           public void show(){
               System.out.println("This in Non-Abstract method");
           }
 }

public class Call extends C {
    @Override
    void callMe() {
        System.out.println("Calling..");
    }

    public static void main(String[] args) {
        Call call = new Call();
        call.callMe();
        call.show();
    }
}
