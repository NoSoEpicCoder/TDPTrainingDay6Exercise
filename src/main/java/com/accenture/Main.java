package com.accenture;

import com.accenture.book.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;

//Creating an online shopping cart with different items
@SpringBootApplication
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);

        SchoolBook schoolBook = new SchoolBook("Java for beginners", "Its a long book", 20.00, 5);
        FreeBook freeBook = new FreeBook("Java for noobs", "Get rekt by Java kid");
        PayBook payBook = new PayBook("Python is king", "Become a god", 35.00);

        BookCatalog bc = new BookCatalog();

        bc.addBook(schoolBook);
        bc.addBook(freeBook);
        bc.addBook(payBook);

        LinkedList<Book> bookList = bc.search("1", Book.SEARCH_ID);

        for(Book book : bookList){
            System.out.println(book.toString());
        }
    }
}
