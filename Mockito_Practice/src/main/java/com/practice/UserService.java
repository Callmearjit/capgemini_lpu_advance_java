package com.practice;

//Bussiness Logic
public class UserService {
	UserDao dao;//null value is present currently
	
	public UserService(UserDao dao){//taking dao layer reference to use database
		this.dao=dao;
	}
	
	public String typeOfUser(int id) {
		User user=dao.findById(id);
		if(user.getBalance()>0 && user.getBalance()<1000) {
			return "new User";
			
		}else if(user.getBalance()>1001 && user.getBalance()<=2000) {
			return "regular user";
			
		}
		else {
			return "premium user";
		}
		
	}
	

}
