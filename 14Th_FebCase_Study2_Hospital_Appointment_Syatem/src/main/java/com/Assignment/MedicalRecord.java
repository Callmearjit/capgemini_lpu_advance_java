package com.Assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MedicalRecord {
	@Id
	private int id;
	private String bloodGroup;
	private String allergies;
	
	
	
	public MedicalRecord(int id, String bloodGroup, String allergies) {
		super();
		this.id = id;
		this.bloodGroup = bloodGroup;
		this.allergies = allergies;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	@Override
	public String toString() {
		return "MedicalRecord [id=" + id + ", bloodGroup=" + bloodGroup + ", allergies=" + allergies + "]";
	}
	
	

}
