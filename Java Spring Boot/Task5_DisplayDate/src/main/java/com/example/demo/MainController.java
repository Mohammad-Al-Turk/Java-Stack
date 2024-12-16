package com.example.demo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {

	@RequestMapping("/")
	public String dashboard() {
		return "TimeDashboard.jsp";
	}
	
	
	
	@RequestMapping("/date")
	public String date(Model model) {
		
		LocalDate dateNew = LocalDate.now();
		model.addAttribute("data",dateNew);		
		return "Date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		LocalTime timeNow = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = timeNow.format(formatter);
        model.addAttribute("data", formattedTime);
		return "Time.jsp";
	
}
}
