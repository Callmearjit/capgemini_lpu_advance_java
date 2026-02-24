package com.Spring_Hibernate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

@Configuration
@ComponentScan(basePackages="com.Spring_Hibernate")
public class DemoConfiguration {
//	@Bean
//	public EntityManager getEntityManager() {
//		return Persistence
//				.createEntityManagerFactory("postgres")
//				.createEntityManager();
//	}
//	

}
