package com.example.booksapi;

import com.example.booksapi.models.Book;
import com.example.booksapi.repositories.BookRepository;
import com.example.booksapi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BooksApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksApiApplication.class, args);
    }
    @Autowired
    private BookRepository bookRepository;



}
