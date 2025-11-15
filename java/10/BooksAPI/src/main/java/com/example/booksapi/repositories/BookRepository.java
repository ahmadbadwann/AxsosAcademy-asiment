package com.example.booksapi.repositories;

import com.example.booksapi.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Long> {

    Book getBookById(long id);
}
