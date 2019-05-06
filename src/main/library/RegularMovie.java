package main.library;

public class RegularMovie extends Movie {
	
	public RegularMovie(String title) {
		super(title, Movie.REGULAR);
	}

	@Override
	public double getRentalPrice(int days) {
        double amount = 2.0;
        if (days > 2)
            amount += (days - 2) * 1.5;	
		return amount;
	}
}
