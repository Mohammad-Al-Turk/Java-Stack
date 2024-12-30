package com.example.demo.mvc.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.mvc.Models.Category;
import com.example.demo.mvc.Models.Product;
import com.example.demo.mvc.Services.CategoryService;
import com.example.demo.mvc.Services.ProductService;

import jakarta.validation.Valid;

@Controller
public class MainController {

	private final ProductService productService;
	private final CategoryService categoryService;
	public MainController(ProductService productService, CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
	
	@GetMapping("/")
	public String homePage(Model m) {
		m.addAttribute("product",productService.allProduct());
		m.addAttribute("category",categoryService.allCategory());
		return "home";
	}
	
	
	@GetMapping("/product")
	public String productPage(@ModelAttribute("product") Product product) {
		return "newproduct";
	}
	
	
	@GetMapping("/category")
	public String categoryPage(@ModelAttribute("category") Category category, Model m) {
		return "newcategory";
	}
	

	
	/////////////////////////////////////////////////////////////
	
	
	
	
	
	
	@PostMapping("/productprocess")
	public String productProcess(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newproduct";
		}
		else {
			productService.saveProduct(product);
		return "redirect:/";
		}
		
	}
	
	
	
	@PostMapping("/categoryprocess")
	public String categoryProcess(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newcategory";
		}
		else {
			categoryService.saveCategory(category);
		return "redirect:/";
		}
		
	}
	//////////////////////////////////////////////////////////////////////
	
	@GetMapping("/product/{id}")
	public String productPage(@PathVariable("id") Long id,Model m, @ModelAttribute("category") Category category) {
		Product product = productService.productById(id);
	    List<Category> availableCategories = categoryService.allCategory();
	    // تصفية الفئات المرتبطة بالفعل بالمنتج
	    availableCategories.removeAll(product.getCategories());

	    m.addAttribute("data", product);
	    m.addAttribute("allcategory", availableCategories);
		return "product";
		
	}
	
	@GetMapping("/category/{id}")
	public String categoryPage(@PathVariable("id") Long id,Model m, @ModelAttribute("product") Product product) {
		Category category = categoryService.categoryById(id);
	    List<Product> availableProducts = productService.allProduct();

	    // تصفية المنتجات المرتبطة بالفعل بالفئة
	    availableProducts.removeAll(category.getProducts());

	    m.addAttribute("category", category);
	    m.addAttribute("allproduct", availableProducts);
		return "category";
		
	}
	
	@PostMapping("/categories/{productId}/addProduct")
	public String addProductToCategory(@PathVariable Long productId, @ModelAttribute("product") Product product) {
		categoryService.addProductToCategory(product, productId);
		return "redirect:/";
	}
	
	@PostMapping("/Products/{categoryId}/addcategory")
	public String addCategoryToProduct(@PathVariable Long categoryId, @ModelAttribute("category") Category category) {
		productService.addCategoryToProduct(category, categoryId);
		return "redirect:/";
	}
	
	/////////////////////////////////////////////////////////////

	@GetMapping("/getAvailableCategories/{productId}")
	@ResponseBody
	public List<Category> getAvailableCategories(@PathVariable("productId") Long productId) {
	    Product product = productService.productById(productId);
	    List<Category> availableCategories = categoryService.allCategory();
	    availableCategories.removeAll(product.getCategories());
	    return availableCategories;
	}
}
