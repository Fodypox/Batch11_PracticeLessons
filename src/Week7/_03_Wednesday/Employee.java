package Week7._03_Wednesday;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private double compensation;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.compensation = salary*0.1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCompensation() {
        return compensation;
    }

    public void setCompensation() {
        this.compensation = getSalary()*0.1;
    }
}
