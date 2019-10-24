package com.accenture.modules.cd;

import com.accenture.modules.item.Item;
import javax.persistence.Entity;

@Entity
public class CD extends Item {

    private String genre;

    public CD(){
        super();
    }

    public CD(String name, String description, double price, String genre){
        super(name, description, price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
