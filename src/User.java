package com.cottagebooking.fullstackbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class User {
	
	@Id
	private Long id;
	private String name;
	private String emailid;
	private String Religion;
	private int phonenumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getReligion() {
		return Religion;
	}
	public void setReligion(String religion) {
		Religion = religion;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
}
	