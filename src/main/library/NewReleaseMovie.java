package main.library;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String title) {
		super(title, Movie.NEW_RELEASE);
	}

	@Override
	public double getRentalPrice(int days) {
		return days * 3.0;
	}
}
