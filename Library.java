import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
}

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully");
    }

    void displayBooks() {
        for (Book b : books) {
            b.displayBook();
        }
    }

    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", "101");
        Book b2 = new Book("Python Guide", "Guido van Rossum", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayBooks();
    }
}
