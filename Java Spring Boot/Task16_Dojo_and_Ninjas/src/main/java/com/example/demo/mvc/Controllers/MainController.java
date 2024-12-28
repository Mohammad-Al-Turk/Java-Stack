package com.example.demo.mvc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.mvc.Models.Dojo;
import com.example.demo.mvc.Models.Ninja;
import com.example.demo.mvc.Services.DojoService;
import com.example.demo.mvc.Services.NinjaService;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

@Controller
public class MainController {
	private final NinjaService ninjaService;
	private final DojoService dojoService;
	public MainController(NinjaService ninjaService, DojoService dojoService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
	

	@GetMapping("/dojopage")
	public String dojoPage(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
		
	}
	
	@GetMapping("/ninjapage")	
	public String ninjaPage(@ModelAttribute("ninja") Ninja ninja, Model m) {
		m.addAttribute("data",dojoService.allDojo());
		return "newNinja.jsp";
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	
	
	@PostMapping("/create/dojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}
		else {
		dojoService.createDojo(dojo);
		return "redirect:/dojopage";
}
	}
	
	
		
		@PostMapping("/create/ninja")
		public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
			if(result.hasErrors()) {
				return "newNinja.jsp";
			}
			else {
				ninjaService.createNinja(ninja);
				return "redirect:/ninjapage";
	}
		}

		
		///////////////////////////////////////////////////////////////////////////////////////////

		
		
		
		
		@GetMapping("/result/{id}")
		public String resultPage(Model m, @PathVariable("id") Long id) {
			m.addAttribute("result",dojoService.dojoById(id));
			return "dojoWithNinja.jsp";
			
	}	
	}
