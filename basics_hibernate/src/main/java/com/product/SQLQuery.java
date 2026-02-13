package com.product;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class SQLQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		//for all DML querry use createNativeQuery  and createQuery() → Used for JPQL / HQ
//		String sql="select * from product";
//		Query query=em.createNativeQuery(sql);
//		List<Product> list=query.getResultList();
//		System.out.println(list);//it will give query

		String sql="update product set price=?1 where price>=?2";
		et.begin();
		Query query=em.createNativeQuery(sql);
		
		query.setParameter(1, 15.0);
		query.setParameter(1, 10.0);
		
		query.executeUpdate();
		et.commit();
	}

}
