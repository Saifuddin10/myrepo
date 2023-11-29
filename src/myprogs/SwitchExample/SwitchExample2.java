package myprogs.SwitchExample;

public class SwitchExample2 {
    public static void main(String[] args) {
        //two variables,add and store in another variable
        //check that variable equals to 3 ,5, 7 using switch
        //default message -> does not belong to 3,5,7
        int a = 1;
        int b = 4;
        int c = a + b;
        switch (c) {
            case 3:
                System.out.println("The result is equal to 3");
                break;
            case 5:
                System.out.println("The result is equal to 5");
                break;
            case 7:
                System.out.println("The result is equal to 7");
                break;
            default:
                System.out.println("the result is not equal to 3,5,7");

        }
    }
}
