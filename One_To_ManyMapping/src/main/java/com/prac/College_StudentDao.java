package com.prac;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class College_StudentDao {
	public static void main(String[] args) {
		
		deleteCollege_Student(105);
		
	}
	public static void deleteCollege_Student(int studentId) {

	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
	    EntityManager em = emf.createEntityManager();
	    EntityTransaction et = em.getTransaction();
	    et.begin();
	    //String sqlDeletesc="delete from College_Student where Student ";
	    String Sql1="delete from College_Student where Student_Student_id=?1";
	    //delete from join table
	    Query delete_College_Student=em.createNativeQuery(Sql1);
	    delete_College_Student.setParameter(1, studentId);
	    delete_College_Student.executeUpdate();
	    //delte from student table
	    Query student=em.createNativeQuery("Delete from Student where Student_id=?1");
		  student.setParameter(1,studentId);
		  student.executeUpdate();

	  
	 	  
	  et.commit();
	  em.close();

	}
}
