package sampleTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import UnitTestingEx.BookStore;

class BookStoreTest {
	
	BookStore newStore = new BookStore();
	@BeforeEach
	public void init() {
		newStore = new BookStore();		
	}

	@Test
	void testAddBook() {
		newStore.addBook("Sample Book", "John Doe", 34.00, "0316440884");
		
		Assertions.assertEquals(1, newStore.getBookCount());
	}

	// Testing Exceptions
	@Test
	@DisplayName("Should Not Add book when bookName null")
	public void testNameThrowsException() {
		
		Assertions.assertThrows(NullPointerException.class, () -> {
			newStore.addBook(null, "John Doe", 34.00, "0316440884");			
		});		
	}
	
	@DisplayName("Repeated testing")
	@RepeatedTest(value = 5 )
	public void testRepeatedAddBook() {
		newStore.addBook("Sample Book", "John Doe", 43.55, "0316440884");
		
		Assertions.assertEquals(1, newStore.getBookCount());
	}
	
	
	@DisplayName("Repeated execution for testing isbn with parameters")	
	@ParameterizedTest
	@ValueSource(strings = {"2344567466", "4567419514", "3579521269" })
	public void testISBNValues(String isbn) {
		newStore.addBook("Sample Book", "John Doe", 34.00, isbn);
		
		Assertions.assertEquals(1, newStore.getBookCount());
	}
	
	@DisplayName("Repeated execution for testing price")
	@ParameterizedTest
	@ValueSource(doubles = {50.5, 28.60, 100.8 })
	public void testPrice(double price) {
		newStore.addBook("Sample Book", "John Doe", price, "0316440884");
		
		Assertions.assertEquals(1, newStore.getBookCount());
	}
}
