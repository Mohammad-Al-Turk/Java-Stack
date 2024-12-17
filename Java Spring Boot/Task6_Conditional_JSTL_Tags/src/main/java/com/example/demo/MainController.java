package com.example.demo;

import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.item.Item;


@Controller
public class MainController {

	@RequestMapping("/")
	public String requestMethodName(Model model) {
		
		ArrayList<Item> fruits = new ArrayList<Item>(); 
		
		Item item1 = new Item("Kiwi",1.5);
		Item item2 = new Item("mango",2);
		Item item3 = new Item("Gojo Berries",4);
		Item item4 = new Item("Guava",0.75);
		
		fruits.add(item1);
		fruits.add(item2);
		fruits.add(item3);
		fruits.add(item4);
		
		
		model.addAttribute("allFruits",fruits);
		
		return "FruitStore.jsp";
	}
	
}
