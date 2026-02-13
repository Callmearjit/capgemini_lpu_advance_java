package com.oneToOne_Mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Car {
	@Id
	private int id;
	private String brand;
	private String model;
	private String modelYear;
	private double price;
	
	
	@OneToOne
	private Engine engine;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car(int id, String brand, String model, String modelYear, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.modelYear = modelYear;
		this.price = price;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;		
		
	}
	public Engine getEngine() {
		return engine;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", modelYear=" + modelYear + ", price="
				+ price + ", engine=" + engine + "]";
	}
	
	
	

}
