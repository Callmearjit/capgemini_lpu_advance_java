package com.example.SpringSecuritydemo;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice")
public class practiceController {
	
	@GetMapping
	public String getDetails() {
		return"Details";
	}
	
	@PostMapping
	public String deleteUser() {
		return "delete";
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(CsrfToken token) {
		return token;
	}

}
