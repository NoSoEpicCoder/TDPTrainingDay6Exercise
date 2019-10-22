package com.accenture.book;

public class SchoolBook extends Book {

    private int numOfCopies;
    private final double PURCHASE_DISCOUNT_LOWEST = 0.10;
    private final double PURCHASE_DISCOUNT_MIDDLE = 0.20;
    private final double PURCHASE_DISCOUNT_HIGHEST = 0.50;
    private final int NUMBER_COPIES_LOWER_RANGE = 5;
    private final int NUMBER_COPIES_MIDDLE_RANGE = 25;
    private final int NUMBER_COPIES_HIGH_RANGE = 50;

    public SchoolBook(String name, String description, double price, int numOfCopies){
        super(name, description, price);
        this.numOfCopies = numOfCopies;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    @Override
    public double getPrice() {
        if (getNumOfCopies() >= NUMBER_COPIES_LOWER_RANGE && getNumOfCopies() < NUMBER_COPIES_MIDDLE_RANGE){
            price -= (price * PURCHASE_DISCOUNT_LOWEST);
        } else if (getNumOfCopies() >= NUMBER_COPIES_MIDDLE_RANGE && getNumOfCopies() < NUMBER_COPIES_HIGH_RANGE){
            price -= (price * PURCHASE_DISCOUNT_MIDDLE);
        } else if (getNumOfCopies() >= NUMBER_COPIES_HIGH_RANGE){
            price -= (price * PURCHASE_DISCOUNT_HIGHEST);
        }
        return price;
    }

    @Override
    public String toString(){
        return super.toString() + ", Number of copies: " +numOfCopies;
    }
}
