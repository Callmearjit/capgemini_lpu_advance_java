package com.HospitalEntity.Main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("postgres");

    

	public static EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return emf.createEntityManager();
	}
}

