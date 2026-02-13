package com.practice;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UserDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
	EntityManager em = emf.createEntityManager();
	
	public void insertUser() {
		EntityTransaction et = em.getTransaction();
		User user=new User();
		user.setId(1);
		user.setName("Allen");
		user.setBalance(2000);
		
		et.begin();
		em.persist(user);
		
		et.commit();
	}
	public User findById(int id) {
		return em.find(User.class, 1);
	}
}
