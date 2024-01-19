package aejluis.spring.com.springudemy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping({"", "/", "/home"})
	public String home() {
		
		return "redirect:/lista";
		//return "forward:/details";
	}

}
