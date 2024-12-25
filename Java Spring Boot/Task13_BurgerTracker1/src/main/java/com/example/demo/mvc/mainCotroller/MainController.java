package com.example.demo.mvc.mainCotroller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.mvc.mainModel.Burger;
import com.example.demo.mvc.mainService.MainSrevice;

import jakarta.validation.Valid;

@Controller
public class MainController {

	private final MainSrevice mainSrevice;

	public MainController(MainSrevice mainSrevice) {
		this.mainSrevice = mainSrevice;
	}

	
	
	///////////////////////////////1//////////////////////////////////////
	@GetMapping("/")
	public String index(Model model,@ModelAttribute("burger") Burger burger) {
		model.addAttribute("data",mainSrevice.allBurger(burger));
		return "main.jsp";
	}
	
	
	
	@PostMapping("/create")
	public String newCreate(
			@Valid @ModelAttribute("burger") Burger burger,
			BindingResult result,
			Model model
			) {
		if(result.hasErrors()) {
			return "main.jsp";
		}
		
		else {
			mainSrevice.newCreate(burger);
			return "redirect:/";
			
		}
}
	
////////////////////2////////////////////////////////////////
	
	

	
	
    @GetMapping("/editpage/{id}")
    public String editPage(@PathVariable("id") Long id, Model model,@ModelAttribute("burger") Burger burger ) {
    	model.addAttribute("data",mainSrevice.dataById(id));
    	return "editpage.jsp";
    }


	
@PostMapping("/editdata/{id}")
public String editdata(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, @PathVariable("id") Long id,Model model) {

	if(result.hasErrors()) {
    	model.addAttribute("data",mainSrevice.dataById(id));
		return "editpage.jsp";
	}
	
	else {
		mainSrevice.editdata(burger);
		return "redirect:/";
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
