package aejluis.spring.com.springudemy.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import aejluis.spring.com.springudemy.models.User;

@Controller
public class UserController {

	@GetMapping("/details")
	public String details(Model model) {
		User user = new User("Jennifer Aline", "Aguilar Perez");
		user.setEmail("aejluis@email.com");
		model.addAttribute("title", "Hola Mundo Spring Boot");
		model.addAttribute("user", user);
		return "details";
	}
	
	@GetMapping("/lista")
	public String lista(ModelMap modelMap) {

		modelMap.addAttribute("title", "Listado de usuarios");
		
		return "lista";
	}
	
	@ModelAttribute("users")
	public List<User> userModel() {
		return Arrays.asList(new User("Carlos", "Barrera"),
				new User("Francisco", "Camacho", "fcamacho@gmail.com"),
				new User("Alonso", "Gutierrez", "agutierrez@gmail.com"),
				new User("Pedro", "Cruz", "pcruz@gmail.com"),
				new User("Roberto", "Trejo"));
	}
}
