package main.library;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();
    
    public Customer (String newname) {
        name = newname;
    }
    
    public void addRental(Rental arg) {
        rentals.add(arg);
    }
    
    public String getName () {
        return name;
    }
    
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        for (Rental rental : rentals) {
            double thisAmount = 0;
            //determine amounts for each line
            thisAmount = amountFor(rental);
            // add frequent renter points
            frequentRenterPoints ++;
            // add bonus for a two day new release rental
            if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) { 
                frequentRenterPoints ++;
            }
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle()+ "\t" + "\t" + rental.getDaysRented() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    public double amountFor(Rental rental) {
        return rental.getAmount();
    }
}
    