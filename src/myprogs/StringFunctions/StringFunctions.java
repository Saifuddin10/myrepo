package myprogs.StringFunctions;

public class StringFunctions {

    public static void main(String[] args) {
        String str = "Hello Java";
        int num = 36/0;
        String str1 = String.valueOf(num);
        //charAt() method will accept only integer datatype values as method argument.
        System.out.println(str.charAt(2));
        // equalsIgnoreCase() will accept String datatype values only.
        System.out.println(str.equalsIgnoreCase("HELLO JAVA"));
        //It returns the index within this string of the first occurrence of
        // the specified substring, starting at the specified index.
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("o", 3));
        // length() will return the length of the given string
        System.out.println(str.length());
        // replace method replaces the character with specified new character.
        System.out.println(str.replace("Java", "program"));
        //substring() method is called with only one argument, the substring returns characters from specified
        // starting point to the end of original string.
        // substring method is called with two arguments, the second argument specify the end point of substring.
        System.out.println(str.substring(3));
        System.out.println(str.substring(2, 6));
        // toLowerCase() method changes the given string to lower case.
        System.out.println(str.toLowerCase());
        // toUpper() method changes the given string to upper case.
        System.out.println(str.toUpperCase());
        // value() of method converts int value to string.
        System.out.println(str1);
        // trim() method  used to remove leading and trailing whitespaces
        System.out.println(str.trim());
        // contains() method is used check the sequence of characters and return True or False
        boolean b = str.contains("Java");
        System.out.println(b);
        //endsWith() method is used to check whether the string ends with the given suffix or not anf returns T or F
        System.out.println(str.endsWith("a"));
        // isEmpty() method is used to check whether the string is empty or not and returns T or F
        System.out.println(str.isEmpty());
        // startsWith() method is used to check whether the given string starts with given prefix or not
        // and returns T or F
        System.out.println(str.startsWith("H"));

        StringFunctions sf = new StringFunctions();
        //String toString() method returns the string representation of an object. It is declared in the Object class,
        // hence can be overridden by any java class.
        System.out.println(sf);
    }

    public String toString() {
        return "sf is an object";
    }
}
