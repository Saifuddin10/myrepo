package AbstractExamples;

public class August extends Month {
    boolean savings = true;

    public August(String name,
                  int salary,
                  int costs,
                  String companyName) {
        super(name, salary, costs, companyName);
    }

    public August() {
        super();
    }

    public void monthlySavings(int salary, int costs) {
        int totalSavings = calculateSavings(salary, costs);
        System.out.println("Your monthly savings are : " + totalSavings);
        if (!savings) {
            System.out.println("Your savings is Bad");
        } else {
            System.out.println("Your savings are Good");
        }
    }

    public int calculateSavings(int salary, int costs) {
        int savedMoney = salary - costs;
        if (savedMoney < costs) {
            savings = false;
        }
        return savedMoney;
    }

    public void getMonthlyPayslip(August august) {
        System.out.println("Company Name : " + august.getCompanyName());
        System.out.println("Name of the month : " + august.getName());
        System.out.println("Total salary : " + august.getSalary());
        System.out.println("Expences : " + august.getCosts());
        // Print all the remaining fields
    }

    @Override
    public void monthlySavings() {

    }

    @Override
    public int calculateSavings() {
        return 0;
    }

    public static void main(String[] args) {
        August august = new August("August", 50000, 25000, "TCS");
        august.getMonthlyPayslip(august);
        august.monthlySavings(august.salary, august.costs);
        august.calculateSavings();
    }

}