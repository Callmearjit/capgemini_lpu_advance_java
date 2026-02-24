package com.Spring_Hibernate.Main;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@Component
public class JpaUtil {
	EntityManagerFactory emf;
	EntityManager entityManager;
	@PostConstruct
	public void  createConnection() {
		emf=Persistence.createEntityManagerFactory("postgres");
		entityManager=emf.createEntityManager();
		System.out.println("Connection");
		
	}
	
	public EntityManagerFactory getEmf() {
		return emf;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	//@PostConstruct
		@PreDestroy
		public void print() {
			entityManager.close();
			emf.close();
			System.out.println("Closed");
		}
	

}
