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
//		sub1.setNo_of_days(10);
		
		Subject sub2=new Subject();
		sub2.setId(102);
		sub2.setName("Java");
		//sub2.setNo_of_days(20);
		
		Subject sub3=new Subject();
		sub3.setId(103);
		sub3.setName("Web Technology");
		//sub3.setNo_of_days(15);
		
		List<Subject> sub=new ArrayList();
		sub.add(sub1);
		sub.add(sub2);
		sub.add(sub3);
		
		Student s1=new Student();
		s1.setName("Allen");
		s1.setBranch("CSE");
		
		
		Student s2=new Student();
		s2.setName("Miller");
		s2.setBranch("CSE");
		
		
		List <Student>stu=List.of(s1,s2);
		List <Subject>subject=List.of(sub1,sub2,sub3);
		
		//Student--->subject  student is having the refernce of subjec
		
		sub1.setStudent(stu);
		sub2.setStudent(stu);
		
		//subject-->student
		s1.setSubjects(subject);
		s2.setSubjects(subject);

		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		
		et.commit();
		em.close();
		
	}
}