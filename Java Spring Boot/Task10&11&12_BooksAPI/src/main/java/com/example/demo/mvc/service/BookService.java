package com.example.demo.mvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.mvc.models.Book;
import com.example.demo.mvc.repositories.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public Book updateBook(Long id, String title, String description, String lang, Integer numOfPages) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            book.setTitle(title);
            book.setDescription(description);
            book.setLanguage(lang);
            book.setNumberOfPages(numOfPages);
            return bookRepository.save(book);
        } else {
            return null;
        }
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);

    }
    
    
    
    
    public List<Book> allBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.orElse(null);
    }

    
    
//    public Book createBook(Book b) {
//        return bookRepository.save(b);
//    }
//
}
