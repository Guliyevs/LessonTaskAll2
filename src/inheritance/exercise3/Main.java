package inheritance.exercise3;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        System.out.println(myCircle.area());
        Square mySquare = new Square(4);
        System.out.println(mySquare.area());
    }
}
