package general_task_for_oop.task1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();


    public Library(List<Book> books) {
        this.books = books;
    }

    public Library() {

    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void showAllAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" + "books=" + books + '}';
    }
}
