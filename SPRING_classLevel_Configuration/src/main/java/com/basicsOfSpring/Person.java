package com.basicsOfSpring;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	//Dependency Injection
	//@Autowired
	private Mobile mobile;//null, ref null
	
	
	@Autowired
	private Scanner scan;//null
	
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	public void message() {
		System.out.println("Hi");
	}
	public Mobile getMobile() {
		return mobile;
	}
	//@Autowired
	public void setMobile(Mobile mobile) {
		this.mobile=mobile;
	}
	
	//in constructor injection no need to write @Autowired
	public Person(Mobile mobile) {
		
		this.mobile = mobile;
	}

}
