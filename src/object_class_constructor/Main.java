package object_class_constructor;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Accord", 2019);
        System.out.println(myCar);
//        ----------------
        Student myStudent = new Student("Emin", 22);
        myStudent.displayInfo();
//        ----------------
        Book book1 = new Book("1984", "George Orwell", 15);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book();
//        ----------------
        Person person = new Person();
        person.setName("Emin");
        person.setHeight(175);
        System.out.println("Name: " + person.getName());
        System.out.println("Height: " + person.getHeight() + " cm");
//        ----------------
        Audi myAudi = new Audi(200, new Engine());
        myAudi.startCar();
//        ----------------

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
//        ----------------
        Employee employee = new Employee("Emin", 5000, new Address("123 Main St", "Baku", "Azerbaijan"));
        employee.showEmployeeDetails();

    }
}
