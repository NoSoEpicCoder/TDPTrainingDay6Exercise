package com.accenture.controller;

import com.accenture.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookListController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/booklist")
    public String booklist(Model model) {
        model.addAttribute("books", itemService.getAllByType("book"));
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
