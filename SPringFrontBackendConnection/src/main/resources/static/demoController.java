package com.example.SPringFrontBackendConnection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class demoController {
	
	@GetMapping("/api/hello")
	public String getHi() {
		return "Arjit Utkarsh";
	}

}
