package com.accenture;

import com.accenture.modules.book.Book;
import com.accenture.modules.cd.CD;
import com.accenture.service.BookService;
import com.accenture.service.CDService;
import com.accenture.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class Dataloader {

    @Autowired
    private BookService bookService;

    @Autowired
    private CDService cdService;

    @Autowired
    private ItemService itemService;

    @PostConstruct
    public void loadData(){
        loadBooks();
        loadCDs();
    }

    public void loadBooks(){
        Book book1 = new Book("Java for beginners", "Its a long book", 20.00, "James");
        Book book2 = new Book("Java for noobs", "Get rekt by Java kid", 120.00, "Bob");
        Book book3 = new Book("Python is king", "Become a god", 35.00, "God");
        Book book4 = new Book("A book", "Pages with writing", 24.00,"A person");
        Book book5 = new Book("C", "Learn C", 50.00, "Charlie");
        bookService.save(book1);
        bookService.save(book2);
        bookService.save(book3);
        bookService.save(book4);
        bookService.save(book5);
    }

    public void loadCDs(){
        CD cd1 = new CD("Soy Boys", "Like hard metal but soft", 10.00, "Soft metal");
        CD cd2 = new CD("The caveman", "Back in my day we used to...", 15.00, "Ancient music");
        CD cd3 = new CD("1800's best hits", "The good'ol classics", 5.00, "Classic");
        CD cd4 = new CD("Soda Pop", "Modern pop but overly sweet like soda", 20.00, "Pop");
        CD cd5 = new CD("Whitenoice", "Just complete silence", 12.00, "Relaxing");
        cdService.save(cd1);
        cdService.save(cd2);
        cdService.save(cd3);
        cdService.save(cd4);
        cdService.save(cd5);
    }
}
