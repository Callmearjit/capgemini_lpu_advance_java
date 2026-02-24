package com.basicsOfSpring.prac;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UPI implements Payment{

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Upi");
		
	}
	

}
