package AbstractExamples;

public abstract class Month {
    private String name;
    protected int salary;
    protected int costs;
    protected String companyName;

    public Month(String name, int salary, int costs, String companyName) {
        this.name = name;
        this.salary = salary;
        this.costs = costs;
        this.companyName = companyName;
    }

    public Month() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public abstract void getMonthlyPayslip(August august);

    public abstract void monthlySavings();

    public abstract int calculateSavings();

}
