package MethodOverriding.AllMainExamples;

class Person {
    String firstName;
    String lastName;

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(firstName);
    }
}

class Employee extends Person {
    int employeeId;
    String jobTitle;

    public Employee(String fistName, String lastName, int employeeId, String jobTitle) {
        super(fistName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getlastname() {
        return super.getlastName() + " " + jobTitle;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Junior", "Philipa",
                4452, "Software Managre");
        System.out.println(employee.getlastname());
        System.out.println(employee.getEmployeeId());
    }
}