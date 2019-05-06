package main.library;

public class ChildrensMovie extends Movie {
	
	public ChildrensMovie(String title) {
		super(title);
	}

	@Override
	public double getRentalPrice(int days) {
        double amount = 1.5;
        if (days > 3)
            amount += (days - 3) * 1.5;
        return amount;
	}
}
