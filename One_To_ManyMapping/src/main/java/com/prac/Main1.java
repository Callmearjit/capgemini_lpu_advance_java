package com.prac;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		College c=em.find(College.class,1);
		List<Student> list=c.getStudent();
		Student s=new Student();
		s.setStudent_id(107);
		s.setName("Adam");
		s.setBranch("IT");
		
		list.add(s);
		
		c.setStudent(list);
		et.begin();
		em.persist(s);
		
		et.commit();
	}

}
