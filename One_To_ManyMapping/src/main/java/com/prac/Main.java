package com.prac;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Student s1=new Student();
		s1.setStudent_id(104);
		s1.setBranch("cse");
		s1.setName("Virat");
		
		Student s2=new Student();
		s2.setStudent_id(105);
		s2.setBranch("Ece");
		s2.setName("Mohit");
		
		Student s3=new Student();
		s3.setStudent_id(106);
		s3.setBranch("Mec");
		s3.setName("Satyam");
		
		
		College c=new College();
		c.setCollege_id(2);
		c.setName("Def");
		c.setLocation("Delhi");
		c.setPincode("0001");
		
		
		
		List<Student>list=new ArrayList<>();
		list.add(s3);
		list.add(s2);
		list.add(s1);
		
		
		c.setStudent(list);
		
		et.begin();
		em.persist(c);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();
	}

}
