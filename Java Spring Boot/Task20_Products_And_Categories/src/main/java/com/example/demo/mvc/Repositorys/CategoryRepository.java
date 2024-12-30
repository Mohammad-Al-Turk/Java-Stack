package com.example.demo.mvc.Repositorys;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mvc.Models.Category;
import com.example.demo.mvc.Models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
    List<Category> findByProductsNotContains(Product product);


}
