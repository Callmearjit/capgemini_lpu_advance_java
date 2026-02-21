package com.prac;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Passport p=new Passport();
		p.setId(101);
		p.setName("Miller");
		p.setCitizen("Indian");
		p.setDateOfBirth("23/09/1995");
		
		Person per=new Person();
		per.setId(1);
		per.setName("Allen");
		per.setEmail("allen@gmail.com");
		per.setPassport(p);
		
		p.setP(per);
		
		et.begin();
		em.persist(per);
//		em.persist(p); 
		et.commit();
			
		
	}

}
