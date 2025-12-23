package inheritance.exercise5;

public class Employee {
    private double salary;

   public Employee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
