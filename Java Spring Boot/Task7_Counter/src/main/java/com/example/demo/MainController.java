package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class MainController {
	

	
	@RequestMapping("/")
	public String welcome(HttpSession session){
		if(session.getAttribute("counter") == null) {
			session.setAttribute("counter",1);		
			
		}
		
		else {
			Integer counter =(Integer) session.getAttribute("counter");
			session.setAttribute("counter",counter+1);
		}
		
		return "welcome.jsp";
	}
	
	
	@RequestMapping("/counter")
	public String counter() {
		return "counter.jsp";
	}
}
