package com.Assignment;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Doctor {
	@Id
	private int id;
	private String ename;
	private String specialization;
	
	@OneToMany
	private List<Appointment> list;

	public Doctor(int id, String ename, String specialization) {
		super();
		this.id = id;
		this.ename = ename;
		this.specialization = specialization;
	}
	
	
	
	public Doctor() {}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public String getSpecialization() {
		return specialization;
	}



	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}



	public List<Appointment> getList() {
		return list;
	}



	public void setList(List<Appointment> list) {
		this.list = list;
	}



	@Override
	public String toString() {
		return "Doctor [id=" + id + ", ename=" + ename + ", specialization=" + specialization + ", list=" + list + "]";
	}



	
}
