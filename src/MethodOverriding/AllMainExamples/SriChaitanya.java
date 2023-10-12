package MethodOverriding.AllMainExamples;

class SriChaitanya extends School {
    String studentName;
    boolean condolation;

    SriChaitanya(String name, long fees, double daysPresent, int workingDays,
                 boolean condolation, String studentName) {
        super(name, fees, daysPresent, workingDays);
        this.studentName = studentName;
        this.condolation = condolation;
    }

    @Override
    public double calculateAttendance() {
        double percentage = (daysPresent / workingDays) * 100;
        if (percentage < 50) {
            condolation = true;
        }
        return percentage;
    }

    @Override
    public long annualFee() {
        return (long) ((fees / 30) * workingDays);
    }

    public String convertToIndianRupees(long totalFees) {
        String str = Long.toString(totalFees);
        char[] ch = str.toCharArray();
        int j = 3;
        int k = 0;
        String str1 = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            k++;
            str1 = String.valueOf(ch[i]).concat(str1);
            if (k == j) {
                str1 = ",".concat(str1);
                j += 2;
            }
        }
        return str1;
    }


    public void info() {
        System.out.println("School name : " + name);
        System.out.println("Student name : " + studentName);
        System.out.println("School working days are : " + workingDays);
        System.out.println("No of days Attended : " + daysPresent);
        System.out.println("Your Attendence percentage is " + calculateAttendance());
        double condolationCharges = 1000;
        if (condolation) {
            long totalFees = (long) (annualFee() + condolationCharges);
            System.out.println("Annual fees to be paid : " + convertToIndianRupees(totalFees));
        } else {
            System.out.println("Annual fees to be paid : " + convertToIndianRupees(annualFee()));
        }
    }

    public static void main(String[] args) {
        SriChaitanya school = new SriChaitanya("SriChaitanya", 10000, 150, 300,
                false, "Subbaya");
        school.info();
    }
}