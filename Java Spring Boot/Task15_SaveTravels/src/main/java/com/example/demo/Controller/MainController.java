package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.Model.Expense;
import com.example.demo.Service.MainService;

import jakarta.validation.Valid;

@Controller
public class MainController {

	private final MainService mainService;

	public MainController(MainService mainService) {
		this.mainService = mainService;
	}
	
	@GetMapping("/")
	public String index(@ModelAttribute("exp") Expense expense , Model model) {
		model.addAttribute("data",mainService.alldata());
		return "index.jsp";
	}
	

	
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("exp") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("data",mainService.alldata());
			return "index.jsp";
		}
		else {
			mainService.create(expense);
			return "redirect:/";
		}
		
	}
	
	
	@GetMapping("/editPage/{id}")
	public String editPage(@PathVariable("id") Long id, Model model,@ModelAttribute("exp") Expense expense) {
			model.addAttribute("data",mainService.dataById(id));
			return "editPage.jsp";
			
	}
	
	
	
	@PostMapping("/editdata/{id}")
	public String editData(
			@Valid
			@ModelAttribute("exp") Expense expense,
			BindingResult result,@PathVariable("id") Long id, Model model)
			 {
		
		if(result.hasErrors()) {
			model.addAttribute("data",mainService.dataById(id));
			return "editPage.jsp";
		}
		else {
			mainService.updatePage(expense);
			return "redirect:/";
		}
	}
	
	
	
	
	
	@GetMapping("/delete/{id}")
	public String del(@PathVariable(value = "id") Long id) {
		 mainService.del(id);
		 return "redirect:/";	
	}
	
	
	@GetMapping("/show/{id}")
	public String show(Model model,@PathVariable(value = "id") Long id) {
		model.addAttribute("data",mainService.dataById(id));
		return "showData.jsp";
	}
	


	 
}

