package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class MainController {

	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public String main(
//			@RequestParam(value = "id") String id,
			@RequestParam(value = "name") String name,
			@RequestParam(value = "age") String age,
			@RequestParam(value = "city") String city,
			@RequestParam(value = "number") String number,
			@RequestParam(value = "nice")String nice,
			HttpSession session
			)
	{
	session.setAttribute("name", name);
	session.setAttribute("age", age);
	session.setAttribute("city", city);
	session.setAttribute("nice", nice);
	session.setAttribute("number", number);
	return "redirect:/show";	

	}
	
	
	@RequestMapping("/show")
	public String show() {
		return "show.jsp";
	}
	
	@RequestMapping("/")
	public String index() {
		return "mainPage.jsp";
	}
}
