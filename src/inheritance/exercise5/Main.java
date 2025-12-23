package inheritance.exercise5;

public class Main {
    public static void main(String[] args) {
       Employee employee = new Developer(1000);
        System.out.println(employee.calculateSalary());
    }
}
