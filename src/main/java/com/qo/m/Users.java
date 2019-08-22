package com.qo.m;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;



@Entity
@Table(name="Users")
public class Users {
    
	@Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;
	
	@Column(name="Name")
	private  String name;
	
	@Column(name="telephone")
	private String Telephone;
	
	@Column(name="Password")
	private String password;
	
	private String email;
	
	public Users(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User ["+ "name=" + name + ", password=" + password + ", email=" + email + "]";
	}
}
