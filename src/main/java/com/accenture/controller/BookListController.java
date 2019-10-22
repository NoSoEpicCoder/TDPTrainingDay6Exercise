package com.accenture.controller;

import com.accenture.book.BookCatalog;
import com.accenture.book.FreeBook;
import com.accenture.book.PayBook;
import com.accenture.book.SchoolBook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookListController {

    @RequestMapping(value = "/booklist")
    public String booklist(Model model) {

        SchoolBook schoolBook = new SchoolBook("Java for beginners", "Its a long book", 20.00, 5);
        FreeBook freeBook = new FreeBook("Java for noobs", "Get rekt by Java kid");
        PayBook payBook = new PayBook("Python is king", "Become a god", 35.00);

        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.addBook(schoolBook);
        bookCatalog.addBook(freeBook);
        bookCatalog.addBook(payBook);

        model.addAttribute("books", bookCatalog.getAllBooks());

        return "booklist";
    }
}
