package com.example.demo.mvc.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.mvc.Models.Dorm;
import com.example.demo.mvc.Models.Student;
import com.example.demo.mvc.Services.DormService;
import com.example.demo.mvc.Services.StudentService;

import jakarta.validation.Valid;


@Controller
public class MainController {
	
	private final StudentService studentService;
	private final DormService dormService;
	
	
	

	
	public MainController(StudentService studentService, DormService dormService) {
		this.studentService = studentService;
		this.dormService = dormService;
	}

	@GetMapping("/dorm")
	public String createDormPage(@ModelAttribute("dorm")Dorm dorm) {
		return "newdorm.jsp";
	}
	
	@GetMapping("/student")
	public String cteateStudent(@ModelAttribute("student")Student student, Model m) {
		m.addAttribute("data",dormService.allDorm());
		return "newstudent.jsp";
	}
	
	@GetMapping("/dorms")
	public String result(Model m ) {
		m.addAttribute("data",dormService.allDorm());
		return "dorms.jsp";		
	}
	
	
	@GetMapping("/")
	public String index() {
		return "redirect:/dorm";		
	}
	
	
	@PostMapping("/createdorm")
	public String createDorm(@Valid @ModelAttribute("dorm")Dorm dorm, BindingResult result) {
		if (result.hasErrors()) {
			return "newdorm.jsp";
		}
		else {
			dormService.createDorm(dorm);
			return "redirect:/dorm";
		}
		
	}
	
	@PostMapping("/createstudent")
	public String createStudent(@Valid @ModelAttribute("student")Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "newstudent.jsp";
		}
		else {
			studentService.createStudent(student);
			return "redirect:/student";
		}
		
	}
	
	
	@GetMapping("/dorms/{id}")
	public String getMethodName(@PathVariable("id") Long id,Model m) {
		m.addAttribute("data",dormService.dormById(id));
		return "studentInDorm.jsp";
		
	}
	
	
}
