package com.example.demo.mvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mvc.models.Book;
import com.example.demo.mvc.service.BookService;

@RestController
public class BookApi {
	
    private final BookService bookService;

    public BookApi(BookService bookService) {
    	
        this.bookService = bookService;
    }


    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT) //للتعديل
    public Book update(
            @PathVariable("id") Long id, 
            @RequestParam(value = "title") String title,
            @RequestParam(value = "description")String description,
            @RequestParam(value = "language")String lang,
            @RequestParam(value = "pages") Integer numOfPages) {
    	return bookService.updateBook(id, title, description, lang, numOfPages);
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);  
    }
    
    
    
    
    
    
//    @RequestMapping("/api/books")
//    public List<Book> index() {
//		return bookService.allBooks();
//	}
    
    
    
//    @RequestMapping(value = "/api/new/book", method = RequestMethod.POST)
//    public Book createBook(
//            @RequestParam(value = "title") String title,
//            @RequestParam(value = "description") String description,
//            @RequestParam(value = "language") String language,
//            @RequestParam(value = "pages") Integer numberOfPages) {
    
//        Book newBook = new Book(title, description, language, numberOfPages);
    
//        return bookService.createBook(newBook);
//    }
    
    
//    public BookService getBookService() {
//		return bookService;
//	}
}
