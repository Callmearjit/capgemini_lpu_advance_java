package com.product;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		String jpql="select p from Product p where p.price>=?1";
//		Query query = em.createQuery(jpql);
//		query.setParameter(1,100.0);
//		List<Product>list=query.getResultList();
//		list.forEach(i->System.out.println(i.getName()));
		
//		String jpql="select p from Product p where p.price>?1 and p.quantity >=?2";
//		Query query = em.createQuery(jpql);
//		query.setParameter(1,10.0);
//		query.setParameter(2,10.0);
		String jpql="select p from Product p where p.price>=:a and p.quantity >=:b";
		Query query = em.createQuery(jpql);
		query.setParameter("a",10.0);
		query.setParameter("b",0);
		
		
		List<Product> list=query.getResultList();
		for(Product p:list) {
			System.out.println(p);
		}

	}

}
