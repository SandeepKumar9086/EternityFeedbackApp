package eternity.feedback.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {
	
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String index() {
		return "index";       
    } 

	@PostMapping("/hello")
	public String sayHello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
   }
	
	@PostMapping("/register")
	public String register(@RequestParam("fname") String fname, @RequestParam("lname") String lname, @RequestParam("email") String email, Model model) {
		model.addAttribute("name", fname);
		return "hello";
   }
	
	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
	public String registration() {		
		return "signIn";
   }

}
