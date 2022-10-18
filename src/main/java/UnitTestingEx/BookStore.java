package UnitTestingEx;


import java.util.ArrayList;

public class BookStore {
	ArrayList<Book> books = new ArrayList<Book>();
	
	public void addBook(String name, String author, double price, String isbn) {
		
		verifyNull(name);
		verifyNull(author);
		
		verifyISBN(isbn);
		verifyPrice(price);
		
		Book book = new Book(name, author, price, isbn);
		
		books.add(book);
	}
	
	public int getBookCount() {
		return books.size();
	}
	
	private void verifyNull(String str) {
		if(str.equals(null)) {
			throw new NullPointerException("Value Cannot be null");
		}
	}
	
	private void verifyISBN(String isbn) {
		if(isbn.equals(null)) {
			throw new NullPointerException("ISBN Cannot be null");
		}
		if(isbn.length() != 10) {
			throw new IllegalArgumentException("ISBN should be 10 digits long");
		}
	}
	
	private void verifyPrice(double price) {
		if(price < 0)
			throw new RuntimeException("Price Cannot be negative");
	}
	
}
