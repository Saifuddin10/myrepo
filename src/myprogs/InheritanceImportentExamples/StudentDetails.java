package myprogs.InheritanceImportentExamples;

class Details {
    String name;
    int age;
    String collegeName;
    long phoneNumber;

    Details() {
        name = " ";
        age = 0;
        collegeName = " ";
        phoneNumber = 0;
    }

    Details(String name, int age, String collegeName, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.collegeName = collegeName;
        this.phoneNumber = phoneNumber;
    }

    public void profileDetails() {
        System.out.println("My name is : " + name);
        System.out.println("My age is : " + age);
        System.out.println("My College is :" + collegeName);
        System.out.println("My phone no is : " + phoneNumber);
    }
}

public class StudentDetails extends Details {
    public static void main(String[] args) {
        Details details = new Details("Saifuddin", 23, "Krishna Chaitanya", 9515851731L);
        details.profileDetails();
    }
}