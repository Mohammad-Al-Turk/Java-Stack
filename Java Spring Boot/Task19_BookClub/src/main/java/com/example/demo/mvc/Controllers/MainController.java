package com.example.demo.mvc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.mvc.Models.Book;
import com.example.demo.mvc.Models.LoginUser;
import com.example.demo.mvc.Models.User;
import com.example.demo.mvc.Services.BookService;
import com.example.demo.mvc.Services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {

    private final UserService userService;
    private final BookService bookService;
    
    public MainController(UserService userService,BookService bookService) {
        this.userService = userService; 
        this.bookService=bookService;
    }
    
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index";
    }


///////////////////////////////////////////////////////////////////////
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
    
  ////////////////////////////////////////////////////////////////////  

    @PostMapping("/register")
    public String register(
            @Valid @ModelAttribute("newUser") User newUser,
            BindingResult bindingResult,
            Model model,
            HttpSession session
    ) {
        User loggedUser = userService.register(newUser,bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index";
        }
        else {
            session.setAttribute("loggedUser", loggedUser);
            return "redirect:/books";
        }
    }
    
    

    @PostMapping("/login")
    public String login(
            @Valid @ModelAttribute("newLogin") LoginUser newLogin,
            BindingResult bindingResult,
            HttpSession session,
            Model model
    ) {
        User loggedUser = userService.login(newLogin, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index";
        }
        else {
            session.setAttribute("loggedUser", loggedUser);
            return "redirect:/books";
        }
    }
    
/////////////////////////////////////////////////////////////////////////

    
    @GetMapping("/books")
    public String home(HttpSession session,Model m) {
        if (session.getAttribute("loggedUser") != null) {
        	m.addAttribute("data",bookService.allBooks());
            return "books";
        }
        else {
            return "redirect:/";
        }
        
    }
    
    ////////////////////////////////////////////////////////////////////
    
    
   @GetMapping("/book/new")
   public String addpage(@Valid @ModelAttribute("book") Book book,BindingResult result,Model m) {
	   return "addbook";
   }
   
   
 
    @PostMapping("/savenewbook")
    public String saveNewBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
    	if(result.hasErrors()) {
    		return "addbook";
    	}
    	else {
    			bookService.saveBook(book);
    			return "redirect:/books";
    	}

    
    }
    
   ///////////////////////////////////////////////////////////////////////////////
    
    
    @GetMapping("/book/{id}")
    public String bookdata(@PathVariable("id") Long id,Model m, HttpSession session) {
    	if (session.getAttribute("loggedUser") == null) {
    		return "redirect:/";
    	}
    	
    	else {
    	m.addAttribute("data",bookService.bookById(id));
    	return "bookdata";
    	}

    }
    
    ///////////////////////////////////////////////////////////
    
    @GetMapping("/book/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id, HttpSession session) {
        if (session.getAttribute("loggedUser") == null) {
            return "redirect:/";
        }
        bookService.deleteBook(id);
        return "redirect:/books";
    }

//    @GetMapping("/book/delete/{id}")
//    public String deleteBook(@PathVariable("id") Long id, HttpSession session) {
//        User loggedUser = (User) session.getAttribute("loggedUser");
//        Book book = bookService.bookById(id);
//
//        if (loggedUser == null || !book.getUser().getId().equals(loggedUser.getId())) {
//            return "redirect:/";
//        }
//        
//        bookService.deleteBook(id);
//        return "redirect:/books";
//    }

}
