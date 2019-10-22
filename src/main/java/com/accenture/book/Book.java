package com.accenture.book;

import com.accenture.item.Item;

//Default class for all books, the class has to be modified by the child to be used
//you cannot create a Book object
public abstract class Book extends Item {

    protected static int iterator = 1;
    protected int id;
    public static final String SEARCH_ID = "ID";
    public static final String SEARCH_NAME = "NAME";
    public static final String SEARCH_DESCRIPTION = "DESCRIPTION";

    public Book(String name, String description, double price){
        super(name, description, price);
        id = iterator;
        iterator++;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "ID: " +getId()+ ", Name: " +getName()+ ", Description: " +getDescription()+ ", Price: " +getPrice();
    }
}
