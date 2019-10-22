package com.accenture.book;

public class FreeBook extends Book {

    private double price = 0;

    public FreeBook(String name, String description){
        super(name, description, 0);
    }

    @Override
    public void setPrice(double price) {
    }
}
