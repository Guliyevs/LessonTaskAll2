package inheritance.exercise5;

public class Manager extends Employee {
    public Manager(double salary) {
        super(salary);
    }

    @Override
    public double calculateSalary() {
        return super.getSalary() + 1000;
    }
}
