package aejluis.spring.com.springudemy.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aejluis.spring.com.springudemy.models.User;

@RestController
@RequestMapping("/path/variable")
public class PathVariableController {

	@Value("${config.code}")
	private String code;
	@Value("${config.username}")
	private String username;
	/**@Value("${config.message}")
	private String message;*/
	
	@Autowired
	private Environment environment; 
	
	@Value("${config.listOfValues}")
	private List<String> listOfValues;
	
	@Value("#{'${config.listOfValues}'.toUpperCase().split(',')}")
	private List<String> valuesList;
	
	@Value("#{'${config.listOfValues}'.toUpperCase()}")
	private String valuesString;
	
	@Value("#{${config.valuesMap}}")
	private Map<String, Object> valuesMap;
	
	@Value("#{${config.valuesMap}.product}")
	private String product;
	
	@Value("#{${config.valuesMap}.price}")
	private Long price;
	
	@Value("#{${config.valuesMap}.description}")
	private String description;
	
	@PostMapping("/create")
	public User create(@RequestBody User usuario) {
		usuario.setName(usuario.getName().toUpperCase());
		return usuario;
	}
	
	@GetMapping("values")
	public Map<String, Object> values(@Value("${config.message}") String message){
		Map<String, Object> json = new HashMap<>();
		json.put("code", code);
		json.put("codeLong", environment.getProperty("config.code", Long.class));
		json.put("username", username);
		json.put("message", message);
		json.put("message2", environment.getProperty("config.message"));
		json.put("listOfValues", listOfValues);
		json.put("valuesList", valuesList);
		json.put("valuesString", valuesString);
		json.put("valuesMap", valuesMap);
		
		json.put("product", product);
		json.put("price", price);
		json.put("description", description);
		return json;
	}
	
}
