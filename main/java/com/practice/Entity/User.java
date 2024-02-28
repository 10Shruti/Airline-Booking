package com.practice.Entity;

import jakarta.persistence.*;



@Entity
public class User {
	
	@Column()
	 private long id;       
	 private String name; 
	 @Id
	 private String Email;    
	 private String Gender;   
	 private String Country;  
	 private String Contact; 
	 private String Password;
	
	 
	 public User() {
			super();

	 }

	 
	 
	 public User(long id, String name, String email, String gender, String country, String contact, String password) {
			super();
			this.id = id;
			this.name = name;
			Email = email;
			Gender = gender;
			Country = country;
			Contact = contact;
			Password = password;
		}
	 
	 @Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Email=" + Email + ", Gender=" + Gender + ", Country=" + Country + ", Contact=" + Contact + ", Password=" + Password + "]";
		}

	 
	
	 public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	 

	
}
