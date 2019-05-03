package test.library;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.library.Customer;
import main.library.Movie;
import main.library.Rental;

public class LibraryTest {

	@Test
	public void shouldCalculatePriceFor2DaysRentalOfRegularMovie() {
		Movie movie = new Movie("Zur allgemeinen Belustigung", Movie.REGULAR);
		Rental rentalRegular = new Rental(movie, 2);
		Customer me = new Customer("Meine Wenigkeit");
		
		assertEquals(2.0, me.amountFor(rentalRegular), 0.0001);
	}

	@Test
	public void shouldCalculatePriceFor3DaysRentalOfRegularMovie() {
		Movie movie = new Movie("Zur allgemeinen Belustigung", Movie.REGULAR);
		Rental rentalRegular = new Rental(movie, 3);
		Customer me = new Customer("Meine Wenigkeit");
		
		assertEquals(3.5, me.amountFor(rentalRegular), 0.0001);
	}

	@Test
	public void shouldCalculatePriceFor5DaysRentalOfNewMovie() {
		Movie movie = new Movie("Zur allgemeinen neuen Belustigung", Movie.NEW_RELEASE);
		Rental rentalRegular = new Rental(movie, 5);
		Customer me = new Customer("Meine Wenigkeit");
		
		assertEquals(15.0, me.amountFor(rentalRegular), 0.0001);
	}

	@Test
	public void shouldCalculatePriceFor3DaysRentalOfChildrensMovie() {
		Movie movie = new Movie("Zur allgemeinen Kinderbespaﬂung", Movie.CHILDRENS);
		Rental rentalRegular = new Rental(movie, 3);
		Customer me = new Customer("Meine Wenigkeit");
		
		assertEquals(1.5, me.amountFor(rentalRegular), 0.0001);
	}

	@Test
	public void shouldCalculatePriceFor4DaysRentalOfChildrensMovie() {
		Movie movie = new Movie("Zur allgemeinen Kinderbespaﬂung", Movie.CHILDRENS);
		Rental rentalRegular = new Rental(movie, 4);
		Customer me = new Customer("Meine Wenigkeit");
		
		assertEquals(3.0, me.amountFor(rentalRegular), 0.0001);
	}
}
