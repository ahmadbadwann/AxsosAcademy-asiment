package com.example.booksapi.services;

import com.example.booksapi.models.Book;
import com.example.booksapi.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }



//    public Book updateBook (long id , String title, String description, String language, Integer pages){
//        Book book = new Book();
//        book.setId(id);
//        book.setTitle(title);
//    }
    public Book createBook (String title, String description, String language, Integer pages){
        Book book=new Book( title,  description,  language,  pages);
        return bookRepository.save(book);
    }
    public Book git_by_id (long id){
        Optional<Book> book=bookRepository.findById(id);
        if(book.isPresent()){
        return book.get();
        }
        return null;
    }
    public Book updateBook (long id, String title, String description, String language, Integer pages){
        Book book=git_by_id(id);
        book.setTitle(title);
        book.setDescription(description);
        book.setLanguage(language);
        book.setPages(pages);
        return bookRepository.save(book);
    }
    public List<Book> listBooks(){
        return (List<Book>) bookRepository.findAll();
    }
    public void deleteBook(long id){
        bookRepository.deleteById(id);
    }
}
