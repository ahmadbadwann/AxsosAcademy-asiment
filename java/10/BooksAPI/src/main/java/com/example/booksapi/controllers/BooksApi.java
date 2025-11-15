package com.example.burgertracker1.controllers;
import com.example.booksapi.models.Book;
import com.example.booksapi.services.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksApi {
    private final BookService bookService;
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    // other methods removed for brevity
    @RequestMapping(value="/api/books/{id}", method= RequestMethod.PUT)
    public Book update(
            @PathVariable("id") Long id,
            @RequestParam(value="title") String title,
            @RequestParam(value="description") String desc,
            @RequestParam(value="language") String lang,
            @RequestParam(value="pages") Integer numOfPages) {
        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }
    @GetMapping("/books/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Book book=bookService.git_by_id(id);
        if(book==null){
            return "null";
        }else {
            model.addAttribute("book",book);
            return "idex";
        }
    }
    @GetMapping("/books")
    public String list(Model model) {
    List<Book> books=bookService.listBooks();
    model.addAttribute("books",books);
    return "List";
    }

    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}