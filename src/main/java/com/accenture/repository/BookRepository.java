package com.accenture.repository;

import com.accenture.modules.book.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
}