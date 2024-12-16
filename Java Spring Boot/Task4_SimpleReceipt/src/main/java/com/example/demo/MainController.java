package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Model model) {


        // إضافة المتغيرات إلى الـ Model
        model.addAttribute("cname", "turk");
        model.addAttribute("itemName","coffee");
        model.addAttribute("price", 2);
        model.addAttribute("description","coffee without milk");
        model.addAttribute("vendor", "Mo");

        return "SimpleReceipt.jsp";
    }
}
