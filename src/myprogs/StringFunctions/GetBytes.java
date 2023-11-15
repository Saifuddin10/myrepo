package myprogs.StringFunctions;

public class GetBytes {
    public static void main(String[] args) {
        String s = "Java Programming Language";
        byte[] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
