package AbstractExamples;

import java.util.Scanner;

class September extends August {
    boolean savings = true;

    public September() {
    }

    public September(String name, int salary, int costs, String companyName) {
        super(name, salary, costs, companyName);
    }

    public static void main(String[] args) {
        September september = new September();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your company name : ");
        String companyName = sc.nextLine();
        System.out.println("Enter the month name : ");
        String name = sc.nextLine();
        System.out.println("Enter your salary : ");
        int salary = sc.nextInt();
        System.out.println("Enter your Expenses : ");
        int cost = sc.nextInt();
        september.setName(name);
        september.setSalary(salary);
        september.setCosts(cost);
        september.setCompanyName(companyName);
        september.getMonthlyPayslip(september);
        september.monthlySavings(september.getSalary(), september.getCosts());
    }
}