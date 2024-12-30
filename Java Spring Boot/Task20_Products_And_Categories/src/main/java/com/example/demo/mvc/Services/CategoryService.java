package com.example.demo.mvc.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.mvc.Models.Category;
import com.example.demo.mvc.Models.Product;
import com.example.demo.mvc.Repositorys.CategoryRepository;
import com.example.demo.mvc.Repositorys.ProductRepository;

@Service
public class CategoryService {

	private final CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	
	
	
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	public List<Category> allCategory() {
		return (List<Category>) categoryRepository.findAll();		
	}
	
	
	public Category categoryById(Long id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.orElse(null);
	}
	
	// Add product to Category
	public void addProductToCategory(Product product, Long categoryId) {
        Category category = categoryById(categoryId);
        if (category != null) {
            if (!category.getProducts().contains(product)) {
                category.getProducts().add(product);
                categoryRepository.save(category);
            }
        }
    }
	
	
	
}
