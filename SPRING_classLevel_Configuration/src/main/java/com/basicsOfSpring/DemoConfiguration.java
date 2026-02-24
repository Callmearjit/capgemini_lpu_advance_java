package com.basicsOfSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com")
public class DemoConfiguration {
	
	//this done create a bean for 3rd party library class
	//factory method
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
		
	}
	@Bean
	public List<String> getabc(){
		//return new ArrayList<String>();
		return List.of("Miller","brevis","Holder");
	}

	
	


	
	
	
	
}
