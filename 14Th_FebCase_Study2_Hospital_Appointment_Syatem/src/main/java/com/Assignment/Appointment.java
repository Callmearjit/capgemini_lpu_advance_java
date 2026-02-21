package com.Assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Appointment {
	@Id
	private int id;
	private String visitDate;
	private double fee;
	
	
	@ManyToOne
	private Patient patient;
	public Appointment(int id2, String visitDate2, int fee2) {
		// TODO Auto-generated constructor stub
		this.id = id2;
		this.visitDate = visitDate2;
		this.fee = fee2;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getVisitDate() {
		return visitDate;
	}


	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}


	public double getFee() {
		return fee;
	}


	public void setFee(double fee) {
		this.fee = fee;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	@Override
	public String toString() {
		return "Appointment [id=" + id + ", visitDate=" + visitDate + ", fee=" + fee + ", patient=" + patient + "]";
	}
	
	

}
