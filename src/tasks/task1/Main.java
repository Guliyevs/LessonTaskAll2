package tasks.task1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        System.out.println(calculator.operate(5, 3));
    }
}
