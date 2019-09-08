package com.spring.boot.entity;

import java.sql.Timestamp;

public class User {

	private String userId;
	private String name;
	private Timestamp dateOfBirth;
	private String email;
	private int phone;
	
	String getUserId() {
		return userId;
	}
	void setUserId(String userId) {
		this.userId = userId;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	Timestamp getDateOfBirth() {
		return dateOfBirth;
	}
	void setDateOfBirth(Timestamp dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	int getPhone() {
		return phone;
	}
	void setPhone(int phone) {
		this.phone = phone;
	}
	
}
