package com.Assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Patient {
@Id
private int id;
private String name;
private long contact;

@OneToOne
private MedicalRecord medicalRecord;

public Patient(int id, String name, long contact) {
	super();
	this.id = id;
	this.name = name;
	this.contact = contact;
	
}

public Patient() {}



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
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}

public MedicalRecord getMedicalRecord() {
	return medicalRecord;
	
}










@Override
public String toString() {
	return "Patient [id=" + id + ", name=" + name + ", contact=" + contact + ", medicalRecord=" + medicalRecord
			+ ", getId()=" + getId() + ", getName()=" + getName() + ", getContact()=" + getContact()
			+ ", getMedicalRecord()=" + getMedicalRecord() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

public void setMedicalRecord(MedicalRecord mr) {
	// TODO Auto-generated method stub
	this.medicalRecord = medicalRecord;
}





}
