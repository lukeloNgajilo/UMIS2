package com.qo.m;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.dom4j.tree.AbstractEntity;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.GrantedAuthority;

import java.time.chrono.AbstractChronology;
import java.util.Set;


@Entity
@Table(name="Users")
public class Users extends AbstractEntity {

	@Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	private  int id;


	@Column(name="Name",nullable=false)
	private  String name;

	@Column(name="telephone",nullable=false)
	private String Telephone;

	@Column(name="Password",nullable=false)
	private String password;


	@Column(nullable=false)
	private String email;

	
	
	public Users(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@ManyToMany
@JoinTable(name="user_role",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns =@JoinColumn(name="role_id") )
private Set<Role> roles;







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
