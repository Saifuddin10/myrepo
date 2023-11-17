package myprogs.ExceptionHandling;

public class UnreachableCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2};
            arr[2] = 3/0;
        }
        catch (Exception e) {
            System.out.println("Generic Exception --> " + e);
        }
        //Unreachable catch Block
//        catch (ArithmeticException ae){
//            System.out.println("Arithmetic Exception ");
//        }
    }
}
