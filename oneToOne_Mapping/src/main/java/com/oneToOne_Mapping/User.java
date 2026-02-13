package com.oneToOne_Mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class User {
	public static void main(String[] args) {
	//insertCarAndEngine();
//		findByCarId();
		deleteEngineByCarReference();
	}
	
//	public static void deleteCarById() {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		Engine e=em.find(Engine.class,100);
//		et.begin();
//		em.remove(e);//we cannot delete the foreign key
//		et.commit();
//	}//we cant use this directly deletionof foregin key problem arrises here so we use below method
	
	public static void deleteEngineByCarReference() {

	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
	    EntityManager em = emf.createEntityManager();
	    EntityTransaction et = em.getTransaction();

	    
	    
	  Query updateQuery = em.createNativeQuery("Update car set engine_id=null where engine_id=?1");
	    updateQuery.setParameter(1, 100);
	  Query deleteQuery=em.createNativeQuery("Delete from engine where id=?1");
	  deleteQuery.setParameter(1, 100);
	  et.begin();
	  updateQuery.executeUpdate();
	  deleteQuery.executeUpdate();
	  et.commit();

	}

	public static void findByCarId() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Car c=em.find(Car.class,1);
		System.out.println(c);
	}

	public static void insertCarAndEngine(){
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Engine e=new Engine();
		e.setId(100);
		e.setType("V8");
		e.setFuelType("Petrol");
		e.setMileage("12");
		e.setCc("3000");
		
		Car c=new Car();
		c.setId(1);
		c.setBrand("Volkswagen");
		c.setModel("polo gt10");
		c.setModel("fijbv");
		c.setPrice(20202020);
		c.setEngine(e);
		
		et.begin();
		em.persist(e);
		em.persist(c);
		et.commit();
		

	}

}
