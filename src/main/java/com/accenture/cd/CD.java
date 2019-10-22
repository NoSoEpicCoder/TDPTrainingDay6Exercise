package com.accenture.cd;

import com.accenture.item.Item;

public abstract class CD extends Item {

    protected static int iterator = 1;
    private static int id;
    protected String genre;
    public static final String SEARCH_NAME = "NAME";
    public static final String SEARCH_GENRE = "GENRE";
    public static final String SEARCH_DESCRIPTION = "DESCRIPTION";

    public CD(String name, String genre, String description, double price){
        super(name, description, price);
        id = iterator;
        iterator++;
        this.genre = genre;
    }

    public int getId(){
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString(){
        return "ID: " +getId()+ ", Name: " +getName()+ ", Genre: " +getGenre()+ ", Description: " +getDescription();
    }
}
