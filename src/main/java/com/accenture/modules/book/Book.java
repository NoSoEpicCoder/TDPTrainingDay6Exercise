package com.accenture.modules.book;

import com.accenture.modules.item.Item;
import javax.persistence.Entity;

@Entity
public class Book extends Item {

    private String author;

    public Book(){
        super();
    }

    public Book(String name, String description, double price, String author){
        super(name, description, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
