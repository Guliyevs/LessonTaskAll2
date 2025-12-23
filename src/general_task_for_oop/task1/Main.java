package general_task_for_oop.task1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 1949, true);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, true);


        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Available books in the library:");
        library.showAllAvailableBooks();

        book1.borrowBook();
        System.out.println("\nAfter borrowing '1984':");
        library.showAllAvailableBooks();

    }
}
