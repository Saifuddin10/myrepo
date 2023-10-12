package MethodOverriding.AllMainExamples;

public class School {
    String name;
    double fees;
    double daysPresent;
    int workingDays;

    School(String name, double fees, double daysPresent, int workingDays) {
        this.name = name;
        this.fees = fees;
        this.daysPresent = daysPresent;
        this.workingDays = workingDays;
    }

    public long annualFee() {
        double annnualFee = fees * 12;
        return (long) annnualFee;
    }

    public double calculateAttendance() {
        double calculateAttendance = 0.0;
        if (workingDays != 0 && daysPresent != 0) {
            calculateAttendance = (workingDays / (double) daysPresent) * 100;
        }
        return calculateAttendance;
    }
}

class Narayana extends School {
    String studentName;
    boolean condolation;
    int extraCharges;


    Narayana(String name, double fees, double daysPresent, int workingDays,
             boolean condolation, String studentName, int extraCharges) {
        super(name, fees, daysPresent, workingDays);
        this.studentName = studentName;
        this.condolation = condolation;
        this.extraCharges = extraCharges;
    }

    public double calculateAttendance() {
        double percentage = (daysPresent / workingDays);
        if (percentage < 60) {
            condolation = true;
        }
        return percentage;
    }

    public long annualFee() {
        double annualFee = fees * 12;
        return (long) annualFee;
    }

    public void info() {
        System.out.println("School name : " + name);
        System.out.println("Student name : " + studentName);
        System.out.println("School working days are : " + workingDays);
        System.out.println("No od days Attended : " + daysPresent);
        System.out.println("Your Attendence percentage is " + calculateAttendance());
        double condolationCharges = 1000;
        if (condolation) {
            double totalFees = annualFee() + condolationCharges;
            System.out.println("Annual fees to be paid : " + totalFees);
        } else {
            System.out.println("ANNUAL FEES TO BE PAID : " + annualFee());
        }
    }

    public static void main(String[] args) {
        Narayana school = new Narayana("Narayana", 10000, 150, 365,
                false, "Saif", 225);
        school.info();
        double attendence = school.calculateAttendance();
        double attendance = school.annualFee();
    }
}