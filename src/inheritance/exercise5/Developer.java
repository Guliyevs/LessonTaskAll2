package inheritance.exercise5;

public class Developer extends Employee{
    public Developer(double salary) {
        super(salary);
    }

    @Override
    public double calculateSalary() {
        return super.getSalary() + 2000;
    }
}
