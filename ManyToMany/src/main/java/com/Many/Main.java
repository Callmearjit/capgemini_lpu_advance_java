package com.Many;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;



public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Subject sub1=new Subject();
		sub1.setId(101);
		sub1.setName("SQL");
		sub1.setNo_of_days(10);
		
		Subject sub2=new Subject();
		sub2.setId(102);
		sub2.setName("Java");
		sub2.setNo_of_days(20);
		
		Subject sub3=new Subject();
		sub3.setId(103);
		sub3.setName("Web Technology");
		sub3.setNo_of_days(15);
		
		List<Subject> sub=new ArrayList();
		sub.add(sub1);
		sub.add(sub2);
		sub.add(sub3);
		
		Student s1=new Student();
		s1.setName("Allen");
		s1.setBranch("CSE");
		s1.setSubjects(sub);
		
		Student s2=new Student();
		s2.setName("Miller");
		s2.setBranch("CSE");
		s2.setSubjects(sub);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(sub1);
		em.persist(sub2);
		em.persist(sub3);
		et.commit();
		
	}
}