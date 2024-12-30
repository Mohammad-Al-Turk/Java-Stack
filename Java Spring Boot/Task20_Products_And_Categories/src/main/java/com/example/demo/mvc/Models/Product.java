package com.example.demo.mvc.Models;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String pname;
	
	@NotNull
	@Column(columnDefinition = "TEXT")
	private String description;
	
	@NotNull
	private Double price;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "categories_products", 
        joinColumns = @JoinColumn(name = "product_id"), 
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
	private List<Category> categories;
	
	@Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    
    
    public Product() {}
public Product(String pname,String description) {
		this.pname = pname;
		this.description = description;
	}



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getPname() {
	return pname;
}



public void setPname(String pname) {
	this.pname = pname;
}




public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}



public List<Category> getCategories() {
	return categories;
}



public void setCategories(List<Category> categories) {
	this.categories = categories;
}



public Date getCreatedAt() {
	return createdAt;
}



public Date getUpdatedAt() {
	return updatedAt;
}



@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
