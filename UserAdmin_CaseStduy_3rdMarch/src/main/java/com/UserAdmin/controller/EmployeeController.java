package com.UserAdmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.UserAdmin.Employee;
import com.UserAdmin.service.EmployeeService;
@Controller
public class EmployeeController {
	
	
	
	private EmployeeService service;
	
	public void  EmployeeController(EmployeeService service) {
		this.service = service;
	}
	@GetMapping("/register")
	public String register(){
		return "register";
	}
	@PostMapping()
	public String create(@ModelAttribute Employee e) {
		
	}
	

}
