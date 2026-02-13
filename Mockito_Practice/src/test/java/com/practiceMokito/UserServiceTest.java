package com.practiceMokito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.practice.Calculator;
import com.practice.MathService;
import com.practice.UserDao;
import com.practice.UserService;

public class UserServiceTest {
	@Test
	public void testGetTypeOfCustomer() {
		UserDao userdao=new UserDao();
		UserService userService=new UserService(userdao);
		userService.typeOfUser(1);
		String actualRes=userService.typeOfUser(1);
		assertEquals("regular user",actualRes);
	}
	
	@Test
	public void testDoubleAddition() {
		
	//step:1create fake object
		Calculator calmock=mock(Calculator.class);//mock is use to fake object
		
	//Step:2 what mock object should return
		when(calmock.add(5, 5)).thenReturn(10);
		
		//Step3:give the fake object reference
		
		MathService service=new MathService(calmock);
		int res=service.doubleAddition(5,5);
		
		assertEquals(20,res);
	}
}
