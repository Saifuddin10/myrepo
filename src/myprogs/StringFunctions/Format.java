package myprogs.StringFunctions;

public class Format {
    public static void main(String[] args) {
        String str1 = String.format("%d", 456);
        String str2 = String.format("%s", "Saif");
        String str3 = String.format("%c", 'a');
        String str4 = String.format("%f", 130.25);
        String str5 = String.format("%x", 100);
        System.out.println("Integer Value: " + str1);
        System.out.println("String Value: " + str2);
        System.out.println("Char Value: " + str3);
        System.out.println("Float Value: " + str4);
        System.out.println("Hexadecimal Value: " + str5);
    }
}