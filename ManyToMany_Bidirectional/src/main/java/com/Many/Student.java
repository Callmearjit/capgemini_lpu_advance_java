package com.Many;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)   
	private int id;
	private String name;
	
	private String branch;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable
	private List<Subject> subject;	
	
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubjects(List<Subject> subject) {
		this.subject = subject;
	}
	
	public int getId() {
		return id;
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
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
//	@Override
//	public String toString() {
//		return "Student_Details [id=" + id + ", name=" + name + ", gender=" + gender + ", branch=" + branch + "]";
//	}
	
	
}