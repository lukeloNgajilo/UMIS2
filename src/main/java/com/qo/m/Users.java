package com.qo.m;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicUpdate;



@Entity
@Table(name="Users")
public class Users {
    
	@Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	private  int id;
	
    @NotBlank(message = "Enter name")
	@Column(name="Name",nullable=false)
	private  String name;

    @Size(max=10)
	@NotBlank(message = "Enter name")
	@Column(name="telephone",nullable=false)
	private String Telephone;

	@NotBlank(message = "Enter name")
	@Column(name="Password",nullable=false)
	private String password;

	@NotBlank(message = "Enter name")
	@Column(nullable=false)
	private String email;
	
	public Users(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public Users() {
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
