package com.prac;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Department dept=new Department();
			//dept.setId(101);
			dept.setName("HR");
			dept.setManagerName("Allen");
			dept.setNumOfEmploye(5);
			
			
			
			Employee e1=new Employee();
			//e1.setId(1);
			e1.setName("Miller");
			e1.setDesignation("Ase");
			e1.setSalary(2000);
			e1.setDepartment(dept);
			
			
			Employee e2=new Employee();
			//e2.setId(2);
			e2.setName("Virat");
			e2.setDesignation("Analyst");
			e2.setSalary(3000);
			e2.setDepartment(dept);
			
			et.begin();
			em.persist(dept);
			em.persist(e1);
			em.persist(e2);
			
			et.commit();
			
			
			
		}
}
