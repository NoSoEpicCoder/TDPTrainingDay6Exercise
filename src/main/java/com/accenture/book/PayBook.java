package com.accenture.book;

public class PayBook extends Book {

    public PayBook(String name, String description, double price){
        super(name, description, price);
    }

    @Override
    public void setPrice(double price) {
    }
}
