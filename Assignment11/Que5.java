import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Book {
    private int id;
    private String title;
    private String author;
    private double price;

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book [ID=" + id + ", Title=\"" + title + "\", Author=\"" + author + "\", Price=$" + price + "]";
    }
}

class BookManager {
    private Set<Book> books = new HashSet<>();
    public boolean addBook(Book book) {
        boolean added = books.add(book);
        if (added) {
            System.out.println("Added: " + book.getTitle());
        } else {
            System.out.println("Duplicate Book ID detected! Could not add ID: " + book.getId());
        }
        return added;
    }
    public Book searchBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
    public boolean removeBookById(int id) {
        Book toRemove = searchBookById(id);
        if (toRemove != null) {
            books.remove(toRemove);
            System.out.println("Successfully removed Book ID: " + id);
            return true;
        } else {
            System.out.println("Book with ID " + id + " not found to remove.");
            return false;
        }
    }
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
            return;
        }
        System.out.println("\n--- Current Books in HashSet ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

public class Que5 {
	public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.addBook(new Book(1, "Clean Code", "Robert C. Martin", 34.99));
        manager.addBook(new Book(2, "Effective Java", "Joshua Bloch", 45.00));
        manager.addBook(new Book(3, "Design Patterns", "Erich Gamma", 52.50));
        manager.addBook(new Book(1, "Duplicate Book", "Unknown Author", 10.00));

        manager.displayBooks();
        System.out.println("\n--- Searching for Book ID 2 ---");
        Book found = manager.searchBookById(2);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Book not found.");
        }
        System.out.println("\n--- Removing Book ID 2 ---");
        manager.removeBookById(2);
        manager.displayBooks();
    }
}
