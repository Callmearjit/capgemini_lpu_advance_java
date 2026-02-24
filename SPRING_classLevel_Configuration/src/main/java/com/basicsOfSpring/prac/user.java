package com.basicsOfSpring.prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.basicsOfSpring.DemoConfiguration;
@Component

public class user {
	@Autowired
	@Qualifier("creditCard")//uses lower camel case order
	private Payment payment;
	public void display() {
		payment.send();
	}
	
	public static void main(String[] args) {
		ApplicationContext ioc = new AnnotationConfigApplicationContext(DemoConfiguration.class);
		user u=ioc.getBean(user.class);
		System.out.println(u);
		u.display();
	}
	

}
