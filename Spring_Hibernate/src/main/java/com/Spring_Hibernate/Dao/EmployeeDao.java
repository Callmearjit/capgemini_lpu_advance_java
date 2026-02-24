package com.Spring_Hibernate.Dao;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Spring_Hibernate.Dto.Employee;
import com.Spring_Hibernate.Main.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

//@Component
@Repository
public class EmployeeDao {
	@Autowired
	JpaUtil jpa;
	
	EntityManager em;
	@PostConstruct
	public void init()
	{
		em=jpa.getEntityManager();
	}
	
	
	
	  
	public void insert(Employee e) {
		em.getTransaction().begin();
		Employee employee=findById(e.getId());
		if(employee==null) {
			em.persist(e);
		}else {
			System.out.println("data exist");
		}
		
		em.getTransaction().commit();
		
	}
	public Employee findById(int id) {
		return em.find(Employee.class, id);
		
	}
	public void update(Employee e) {
		em.getTransaction().begin();
		Employee employee=findById(e.getId());
		if(employee!=null) {
			employee.setName(e.getName());
			employee.setSalary(e.getSalary());
			
			
		}else {
			System.out.println("data does not  exist");
		}
		
		em.getTransaction().commit();
		
	}

	
	

}
