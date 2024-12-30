package com.example.demo.mvc.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.mvc.Models.Book;
import com.example.demo.mvc.Repositorys.BookRepository;

@Service 
public class BookService {
	
	private final BookRepository bookRepository;
	
	
	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	
	public List<Book> allBooks() {
		return (List<Book>) bookRepository.findAll();
	}
	
	public Book bookById(Long id) {
		return bookRepository.findById(id).get();
	}
	
	
	public void deleteBook(Long id) {
	    bookRepository.deleteById(id);
	}

}
