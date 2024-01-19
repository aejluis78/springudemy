package aejluis.spring.com.springudemy.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import aejluis.spring.com.springudemy.models.User;
import aejluis.spring.com.springudemy.models.dto.UserDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

	@GetMapping("/details/dto")
	public UserDto detailsDTO(){
		Map<String, Object> body = new HashMap<>();
		
		User user = new User("Jose Luis", "Aguilar Escamilla");
		UserDto userDto = new UserDto();
		userDto.setTitle("Hola mundo spring boot");
		userDto.setUser(user);
		return userDto;
		
	}
	
	@GetMapping("/details/map")
	public Map<String, Object> details(){
		Map<String, Object> body = new HashMap<>();
		body.put("Title", "Hola mundo spring boot");
		User user = new User("Jose Luis", "Aguilar Escamilla");
		body.put("User", user);
		
		return body;
		
	}
	
	@GetMapping("/list")
	public List<User>  list(){
		List<User>  lista = new ArrayList<>();
		User user = new User("Jose Luis", "Aguilar Escamilla");
		User user1 = new User("Christian", "Aguilar Perez");
		User user2 = new User("Julio", "Aguilar Perez");
		lista.add(user);
		lista.add(user1);
		lista.add(user2);
		return lista;
	}
	
}
