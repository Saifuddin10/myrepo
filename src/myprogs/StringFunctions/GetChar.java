package myprogs.StringFunctions;

public class GetChar {
    public static void main(String[] args) {
        String str = "Hello, World";
        char[] c = new char[5];
        str.getChars(7,12,c,0);
        System.out.println(c);
    }
}
