package com.example.demo.mvc.mainModel;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "burgers")
public class Burger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(min = 2 , max = 20,message = "Burger name must be greater than 2 and less than 20")
	private String bname;

	
	@NotEmpty
	@Size(min = 2 , max = 20,message = "Restaurant name must be greater than 2 and less than 20")
	private String rname;


	@NotNull(message = "Rate is required")
    @Min(value = 0, message = "Rate must be at least 0.")
    @Max(value = 5, message = "Rate must not exceed 5.")
	private Long rate;
	
    
	@NotEmpty(message = "cannot be Empty")
	private String note;
	
	
	@Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    
    public Burger() {}
	public Burger(String bname, String rname,Long rate,String note) {
    	this.bname=bname;
    	this.rate=rate;
    	this.rname=rname;
    	this.note=note;
		
	}
    
	
	
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}










	public void setId(Long id) {
		this.id = id;
	}










	public String getBname() {
		return bname;
	}










	public void setBname(String bname) {
		this.bname = bname;
	}










	public String getRname() {
		return rname;
	}










	public void setRname(String rname) {
		this.rname = rname;
	}










	public Long getRate() {
		return rate;
	}










	public void setRate(Long rate) {
		this.rate = rate;
	}










	public String getNote() {
		return note;
	}










	public void setNote(String note) {
		this.note = note;
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
