package UnitTestingEx;


public class Book {
	private String bookName;
	private double price;
	private String author;
	private String isbn;
	
	
	public Book(String bookName, String author, double price, String isbn) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.author = author;
		this.isbn = isbn;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getISBN() {
		return isbn;
	}
	
	public void setISBN(String iSBN) {
		isbn = iSBN;
	}
	
	public void display() {
		System.out.println("Name: " + bookName + " by " + author);
		System.out.println("$ " + price);
	}
}
