package com.UserAdmin.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.UserAdmin.Employee;
import com.UserAdmin.EmployeeJpaRepository;

@Service
public class EmployeeService {
	
	EmployeeJpaRepository jpa;
	
	public EmployeeService(EmployeeJpaRepository jpa) {
		this.jpa=jpa;
	}
	public ModelAndView createEmployee(Employee e) {
		Optional<Employee> optional = jpa.findById(e.getEmail());
		ModelAndView m=new ModelAndView();
		
		if(optional.isPresent()) {
			m.addObject("msg",e.getName());
			m.setViewName("Sucessfull");
			return m;
		}
		else {
			m.addObject("msg",e.getName());
			m.setViewName("Sucessfull");
			Employee employee=jpa.save(e);
			return m;
		}
	}
	public ModelAndView login(String email,String password) {
		Employee e=jpa.findByEmailAndPassword(email,password);
		ModelAndView m=new ModelAndView();
		if(e.getRole().equalsIgnoreCase("admin")) {
			List<emaployee> emp=jpa.findAll();
			m.addObject("msg",emp);
			m.setViewName(password);
		}
	}
	

}
