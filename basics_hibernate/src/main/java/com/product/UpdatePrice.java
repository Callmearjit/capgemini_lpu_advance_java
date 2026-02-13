package com.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UpdatePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		
		String jpql="Update Product p set p.price=?1 where p.price=?2";
		et.begin();
		Query query = em.createQuery(jpql);
		query.setParameter(1,80.0);
		query.setParameter(2,1000);
		
		query.executeUpdate();
		et.commit();
		em.close();
		emf.close();

	}

}
