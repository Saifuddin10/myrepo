package myprogs.ExceptionHandling;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try
        {
            Integer in = new Integer("abc");
            in.intValue();

        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic " + e);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number Format Exception " + e);
        }
    }
}


