package com.Many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	private int id;
	private String name;
	
	
	@ManyToMany
	private List<Student> student;
	
	public int getId() {
		return id;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	@Override
//	public String toString() {
//		return "Subject [id=" + id + ", name=" + name + ", no_of_days=" + no_of_days + "]";
//	}
	
	
	
}