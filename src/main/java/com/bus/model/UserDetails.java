package com.bus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userDetails")
public class UserDetails {
	
	
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
	public Integer userId;
	public String userName;
	public String userEmail;
	public Integer userNumber;
	public String userAddres;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Integer getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserAddres() {
		return userAddres;
	}
	public void setUserAddres(String userAddres) {
		this.userAddres = userAddres;
	}
	
	
	
	
	
	
	
}
