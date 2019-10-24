package com.accenture.controller;

import com.accenture.modules.book.*;
import com.accenture.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookListController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/booklist")
    public String booklist(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "/booklist";
    }

    /*@RequestMapping(value = "/books/{id}")
    public Book getBook(@PathVariable Long id){
        return bookService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/booklist")
    public void addBook(@RequestBody Book book){
        bookService.save(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/booklist/{id}")
    public void updateBook(@PathVariable int id, @RequestBody Book book){
        bookService.save(book);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/booklist/{id}")
    public void deleteBook(@PathVariable Book id){
        bookService.deleteBook(id);
    }*/
}
