package com.accenture.cd;

public class FreeCD extends CD {

    private double price;

    public FreeCD(String name, String genre, String description){
        super(name, genre, description, 0);
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
