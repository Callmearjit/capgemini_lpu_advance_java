package com.basicsOfSpring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
	ApplicationContext ioc = new AnnotationConfigApplicationContext(DemoConfiguration.class);
//	Employee e=ioc.getBean(Employee.class);
//	System.out.println(e);
//	System.out.println(e.getId());
//	System.out.println(e.getName());
//	System.out.println(e.getSalary());
	
	Person person=ioc.getBean(Person.class);
	System.out.println(person);
	System.out.println(person.getMobile());
	
	System.out.println(ioc.getBean(Mobile.class));
	
	System.out.println(person.getScan());
	
	List<String> list = ioc.getBean(List.class);
//	list.add("naman");
//	list.add("aknfb");
	
	
	System.out.println(list);
	
	}
	
}
