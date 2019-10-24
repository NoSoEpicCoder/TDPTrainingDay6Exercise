package com.accenture.service;

import com.accenture.modules.book.*;
import com.accenture.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Iterable<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBook(Long id){
        return bookRepository.findById(id).orElse(null);
    }

    public void save(Book book){
        bookRepository.save(book);
    }

    public void deleteBook(Book book){
        bookRepository.delete(book);
    }
}
