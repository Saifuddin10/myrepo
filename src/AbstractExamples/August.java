package AbstractExamples;

public class August extends Month {
    boolean savings = false;

    public August(String name,
                  int salary,
                  int costs,
                  String companyName) {
        super(name, salary, costs, companyName);
    }

    public void monthlySavings() {
        System.out.println("Your monthly savings are : " + calculateSavings());
        if (calculateSavings() < costs) {
            savings = true;
            System.out.println("Your savings is Bad");
        } else {
            System.out.println("Your savings are Good");
        }
        //check whether his/her savings are good or bad
    }

    public int calculateSavings() {
        int calculateSavings = salary - costs;
        return calculateSavings;
        //calculate savings and check condition
    }

    public void getMonthlyPayslip(August august) {
        System.out.println("Company Name : " + august.getCompanyName());
        System.out.println("Name of the month : " + august.getName());
        System.out.println("Total salary : " + august.getSalary());
        System.out.println("Expences : " + august.getCosts());
        // Print all the remaining fields
    }

    public static void main(String[] args) {
        August august = new August("August", 50000, 5000, "TCS");
        august.getMonthlyPayslip(august);
        august.monthlySavings();
        august.calculateSavings();
    }

}