package com.example.final_exam.mvc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.final_exam.mvc.Models.LoginUser;
import com.example.final_exam.mvc.Models.Team;
import com.example.final_exam.mvc.Models.User;
import com.example.final_exam.mvc.Services.TeamService;
import com.example.final_exam.mvc.Services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {

    private final UserService userService;
    private final TeamService teamService;
    public MainController(UserService userService,TeamService teamService) {
        this.userService = userService; 
        this.teamService=teamService;
    }
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index";
    }
   
    @GetMapping("/dashboard")
    public String home(HttpSession session, Model m) {
        if (session.getAttribute("loggedUser") != null) {
        	m.addAttribute("allTeams",teamService.allTeams());
            return "dashboard";
        }
        else {
            return "redirect:/";
        }

    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    
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
            return "redirect:/dashboard";
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
            return "redirect:/dashboard";
        }
    }
    
   
    
    @GetMapping("/createteampage")
    public String createTeamPage(@ModelAttribute("team") Team team,HttpSession session) {
    	if (session.getAttribute("loggedUser") != null) {
    		return "newTeam";
        }
        else {
            return "redirect:/";
        }
    }
        
    
    @PostMapping("/createteamprocess")
    public String creatTeamProcess(
            @Valid @ModelAttribute("team") Team team,
            BindingResult result,
            HttpSession session
    ) {
        if (result.hasErrors()) {
            return "newTeam";
        }

        User loggedUser = (User) session.getAttribute("loggedUser");
        if (loggedUser != null) {
            team.setUser(loggedUser);             
            teamService.createTeams(team);
            
            return "redirect:/dashboard";
        }

        return "redirect:/";
    }
 
    @GetMapping("/detailspage/{id}")
    public String detailsPage(@PathVariable("id") Long id, HttpSession session,Model m) {
    	if (session.getAttribute("loggedUser") != null) {
    		m.addAttribute("byIdTeam",teamService.teamById(id));
    		return "detailsPage";
        }
        else {
            return "redirect:/";
        }
    }
    

    	@GetMapping("/editpage/{id}")
    	public String editPages(@PathVariable("id") Long id,@ModelAttribute("team") Team team ,HttpSession session, Model m) {
        	if (session.getAttribute("loggedUser") != null) {
        		m.addAttribute("byIdTeam",teamService.teamById(id));
        		return "editpage";
            }
            else {
                return "redirect:/";
            }
        }		
    	
    	
    	@PostMapping("/editprocess/{id}")
    	public String editProcess(
    	        @Valid @ModelAttribute("team") Team team,
    	        BindingResult result,
    	        @PathVariable("id") Long id,
    	        HttpSession session,
    	        Model m
    	) {
    	    User loggedUser = (User) session.getAttribute("loggedUser");
    	    Team existingTeam = teamService.teamById(id);

    	    if (existingTeam == null || loggedUser == null || !existingTeam.getUser().getId().equals(loggedUser.getId())) {
    	        return "redirect:/dashboard";
    	    }

    	    if (result.hasErrors()) {
    	        m.addAttribute("byIdTeam", existingTeam);
    	        return "editpage";
    	    }

    	    existingTeam.setTeamName(team.getTeamName());
    	    existingTeam.setSkillLevel(team.getSkillLevel());
    	    existingTeam.setGameDay(team.getGameDay());

    	    teamService.createTeams(existingTeam);
    	    return "redirect:/dashboard";
    	}



    	@GetMapping("/delete/{id}")
    	public String deleteTeam(@PathVariable("id") Long id, HttpSession session) {
    	    User loggedUser = (User) session.getAttribute("loggedUser");
    	    Team team = teamService.teamById(id);

    	    if (team == null || loggedUser == null || !team.getUser().getId().equals(loggedUser.getId())) {
    	        return "redirect:/dashboard";
    	    }

    	    teamService.deleteTeamById(id);
    	    return "redirect:/dashboard";
    	}

























}
