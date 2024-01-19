package aejluis.spring.com.springudemy.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aejluis.spring.com.springudemy.controllers.model.dto.ParamDto;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {
	
	
	@GetMapping("/alumno")
	public ParamDto alumno(@RequestParam(required = false, defaultValue = "Mensaje vacio") 
	String message) {
		ParamDto param = new ParamDto();
		param.setMessage(message);
		return param;
		
	}
	
	@GetMapping("/aula")
	public ParamDto aula(@RequestParam String text, @RequestParam Integer code) {
		ParamDto param = new ParamDto();
		param.setMessage(text);
		param.setCode(code);
		return param;
		
	}
	
	@GetMapping("/params/httprequest")
	public ParamDto httprequest(HttpServletRequest request) {
		Integer code = 0;
		try {
			code = Integer.parseInt(request.getParameter("code"));
		} catch (NumberFormatException e) {
			e.getMessage();
			// TODO: handle exception
		}
		ParamDto param = new ParamDto();
		param.setCode(code);
		param.setMessage(request.getParameter("message"));
		return param;
	}
	
	@GetMapping("/path/variable/{message}")
	public ParamDto variable(@PathVariable String message) {
		ParamDto param = new ParamDto();
		param.setMessage(message);
		return param;
		
	}
	
	@GetMapping("/path/variablemap/{producto}/{id}")
	public Map<String, Object> variableMap (@PathVariable String producto, 
			@PathVariable Integer id){
		Map<String, Object> json = new HashMap<>();
		json.put("producto", producto);
		json.put("id", id);
		return json;
		
	}

}
