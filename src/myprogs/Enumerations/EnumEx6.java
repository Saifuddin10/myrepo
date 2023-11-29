package myprogs.Enumerations;

enum Student {
    John(16), Vishnu(15), Gowtham(13), Saif(12);
    private int age;

    int getAge() {
        return age;
    }

    private Student(int age) {
        this.age = age;
    }
}

public class EnumEx6 {
    public static void main(String[] args) {
        Student S;
        System.out.println("Age of Vishnu is " + Student.Vishnu.getAge() + " years");
    }
}
