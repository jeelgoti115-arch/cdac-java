import java.util.ArrayList;

class Author{
	String name;
	Author(String name){
		this.name = name;
	}
	public String displayAuthor(){
		return name;
	}
}

class Book{
	String title;
	Author author;
	Book(String title,Author author){
		this.title = title;
		this.author = author;
	}
	public void displayBook(){
		System.out.println("Book: " + title + " Author: " + author.displayAuthor());
	}
}

class Library{
	String libraryname;
	ArrayList<Book> books;
	Library(String libraryName){
		this.libraryname = libraryName;
		books = new ArrayList<>();
	}
	public void addBook(Book book){
		books.add(book);
	}

	public void displayBooks(){
		System.out.println("Library: " + libraryname);
		for(Book book :books) {
			book.displayBook();
		}
	}
}

public class Library10 {
	public static void main(String[] args) {
		Author a1 = new Author("Stephen R. Cowey");
		Author a2 = new Author("J. K. Rowlings");
		Book b1 = new Book("7 Habits of Highely Effective People", a1);
		Book b2 = new Book("Harry Potter and the Prisoner of Azkaban", a2);
		Library library = new Library("City Library");
		library.addBook(b1);
		library.addBook(b2);
		library.displayBooks();
	}
}
