package com.Spring_Hibernate.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Spring_Hibernate.DemoConfiguration;
import com.Spring_Hibernate.Dto.Employee;



public class Main {
	
	//Single ton-->one object
	public static void main(String[] args) {
		ApplicationContext ioc = new AnnotationConfigApplicationContext(DemoConfiguration.class);
		
//		Employee e1=ioc.getBean(Employee.class);
//		Employee e2=ioc.getBean(Employee.class);
//		e2.setName("Miller");
//		System.out.println(e1);
//		System.out.println(e2);
//		System.out.println(e1==e2);
		
		
		AnnotationConfigApplicationContext ac=(AnnotationConfigApplicationContext)ioc;
		ac.close();
	}

}
