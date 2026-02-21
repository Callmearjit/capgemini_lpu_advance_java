package com.prac;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="number_sequence")
	@SequenceGenerator(name="number",sequenceName="number_sequence",initialValue=100,allocationSize=1)
	private int id;
	private String name;
	private String managerName;
	private int numOfEmploye;
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
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getNumOfEmploye() {
		return numOfEmploye;
	}
	public void setNumOfEmploye(int numOfEmploye) {
		this.numOfEmploye = numOfEmploye;
	}
	@Override
	public String toString() {
		return "Department [did=" + id + ", name=" + name + ", managerName=" + managerName + ", numOfEmploye="
				+ numOfEmploye + "]";
	}
	
	

}
