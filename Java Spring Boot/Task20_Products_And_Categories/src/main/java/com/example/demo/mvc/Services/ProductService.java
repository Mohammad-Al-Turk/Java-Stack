package com.example.demo.mvc.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.mvc.Models.Category;
import com.example.demo.mvc.Models.Product;
import com.example.demo.mvc.Repositorys.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	
	
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> allProduct() {
		return (List<Product>) productRepository.findAll();		
	}
	
	
	public Product productById(Long id) {
		Optional<Product> prodect = productRepository.findById(id);
		return prodect.orElse(null);
	}
	
	
	public void addCategoryToProduct(Category category, Long producrId) {
        Product product = productById(producrId);
        if (product != null) {
            if (!product.getCategories().contains(category)) {
            	product.getCategories().add(category);
                productRepository.save(product);
            }
        }
	}
	
}
