package com.example.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.mvc.service.BookService;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

@Controller
public class MainController {
	private final BookService bookService;

    public MainController(BookService bookService) {
        this.bookService = bookService;
    }
    
	@GetMapping("/books")
	public String index(
			Model model
			) {
		model.addAttribute("books", bookService.allBooks());
		return "allBookPage";
	}
	
	
	@GetMapping("/book/{id}")
	public String indexById(
			Model model,
			@PathVariable("id") Long id
			) {
		model.addAttribute("books", bookService.findBook(id));
		return "showById";
	}

}
