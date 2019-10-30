package com.accenture.modules;

import javax.persistence.Entity;

@Entity
public class CD extends Item {

    private String genre;

    public CD(){
        super();
    }

    public CD(int id, String name, String description, double price, String genre){
        super(id, name, description, price);
        this.type = "CD";
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
