package com.accenture.book;

import java.util.LinkedList;

public class BookCatalog {

    private LinkedList<Book> allBooks = new LinkedList();

    public void addBook(Book book){
        allBooks.add(book);
    }

    public void removeBook(Book book){
        allBooks.remove(book);
    }

    //Need to test if this is the right deletion logic
    public void updateBook(Book book){
        allBooks.remove(book.getId());
        allBooks.add(book);
    }

    public LinkedList<Book> getAllBooks(){
        return allBooks;
    }

    //Need to take in what we are sorting by (name, price, id)
    //Can use the sorting from java classes
    public LinkedList<Book> sort(String sortMethod){
        LinkedList<Book> sortedBooks = new LinkedList();

        //use wireframe

        return sortedBooks;
    }

    public LinkedList<Book> search(String token, String searchType){
        LinkedList<Book> foundBooks = new LinkedList();
        if (token == null){
            System.out.println("Please provide a search input");
        }
        for(Book book : allBooks){
            if (searchType.equalsIgnoreCase(Book.SEARCH_ID)){
                if(Integer.valueOf(token) == book.getId()){
                    foundBooks.add(book);
                }
            } else if (searchType.equalsIgnoreCase(Book.SEARCH_NAME)){
                if(token.equals(book.getName())){
                    foundBooks.add(book);
                }
            } else if (searchType.equalsIgnoreCase(Book.SEARCH_DESCRIPTION)){
                if (token.equals(book.getDescription())){
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;
    }
}
