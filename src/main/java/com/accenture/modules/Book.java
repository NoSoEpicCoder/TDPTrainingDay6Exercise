package com.accenture.modules;

import javax.persistence.Entity;

@Entity
public class Book extends Item {

    private String isbn;
    private String author;

    public Book(){
        super();
    }

    public Book(int id, String name, String description, double price, String isbn, String author){
        super(id, name, description, price);
        this.isbn = isbn;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
