package Week7._03_Wednesday;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe","Finance",80000);
        System.out.println(employee1.getCompensation());
        employee1.setSalary(100000);
        System.out.println(employee1.getCompensation());
        employee1.setCompensation();
        System.out.println(employee1.getCompensation());
    }
}
