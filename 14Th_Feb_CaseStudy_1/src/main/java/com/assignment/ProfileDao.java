package com.assignment;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProfileDao {
	 EntityManagerFactory emf =
	            Persistence.createEntityManagerFactory("mysql");

	    EntityManager em = emf.createEntityManager();
	    EntityTransaction et = em.getTransaction();

	    public void saveProfile(Profile p){

	        et.begin();
	        em.persist(p);
	        et.commit();
	    }
}
