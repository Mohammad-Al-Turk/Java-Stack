package com.example.demo.mvc.Repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mvc.Models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

}
