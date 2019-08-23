package com.qo.m;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class University {
	

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Universityname",nullable=false)
	private String Uname;
	
	@Column(name="location",nullable=false)
	private String Location;
	
	@Column(name="Campus",nullable=false)
     private String Campus;
	
	@Column(name="website",nullable=false)
	private String Website;
    
	@Column(name="PostalAddress",nullable=false)
	private String PAddress;
	
    @Column(name="NumberOfcampus",nullable=false)
    private int Ncampus;
	
    @Column(name="Contacts",nullable=false)
    private String Contacts;


	//@JoinColumn(name = "Organization_id",nullable=false,insertable = true, updatable = false)
	//@ManyToOne
	//private Organization organization;

   
	private int organization_id;

	
	public int getCountry() {
	return organization_id;
}
public void setCountry(int country) {
	this.organization_id= country;
}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	
	
	public String getLocation() {
		return Location;
	}
	public String getCampus() {
		return Campus;
	}
	public String getWebsite() {
		return Website;
	}
	public String getPAddress() {
		return PAddress;
	}
	public int getNcampus() {
		return Ncampus;
	}
	public String getContacts() {
		return Contacts;
	}
	
	
	public void setLocation(String location) {
		Location = location;
	}
	public void setCampus(String campus) {
		Campus = campus;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public void setPAddress(String pAddress) {
		PAddress = pAddress;
	}
	public void setNcampus(int ncampus) {
		Ncampus = ncampus;
	}
	public void setContacts(String contacts) {
		Contacts = contacts;
	}
	
	@Override
	public String toString() {
		return "University [Uname=" + Uname + ", Otype=" + ", Location=" + Location + ", Campus=" + Campus
				+ ", Website=" + Website + ", PAddress=" + PAddress + ", Ncampus=" + Ncampus + ", Contacts=" + Contacts
				+ "]";
	}

}
