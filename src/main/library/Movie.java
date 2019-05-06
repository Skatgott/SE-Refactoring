package main.library;

public abstract class Movie {
    private String title;
    private int priceCode;
    
    public Movie(String newtitle) {
        title = newtitle;
    }
    
    public String getTitle () {
        return title;
    }
    
    public abstract double getRentalPrice(int days);
}