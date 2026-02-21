package com.pack;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class College {
		@Id
		private int College_id;
		private String name;
		private String Location;
		private String Pincode;
		
		
		
		@OneToMany
		List<Student> student;



		public int getCollege_id() {
			return College_id;
		}



		public void setCollege_id(int college_id) {
			College_id = college_id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getLocation() {
			return Location;
		}



		public void setLocation(String location) {
			Location = location;
		}



		public String getPincode() {
			return Pincode;
		}



		public void setPincode(String pincode) {
			Pincode = pincode;
		}



		public List<Student> getStudent() {
			return student;
		}



		public void setStudent(List<Student> student) {
			this.student = student;
		}



		@Override
		public String toString() {
			return "College [College_id=" + College_id + ", name=" + name + ", Location=" + Location + ", Pincode="
					+ Pincode + ", student=" + student + "]";
		}



	
}
