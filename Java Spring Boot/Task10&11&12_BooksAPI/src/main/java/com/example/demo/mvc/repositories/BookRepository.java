package com.example.demo.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mvc.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	
//	public List<Book> allBooks();
//	public Book createBook(Book b);
//	Book findBook(Long id);
//	 Book updateBook(Long id, String title, String description, String lang, Integer numOfPages);
//	 public void destroy(Long id);
//	 public Book createBook();
}
