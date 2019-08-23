package com.qo.m;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity

public class University {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Universityname")
	private String Uname;
	
	@Column(name="location")
	private String Location;
	
	@Column(name="Campus")
     private String Campus;
	
	@Column(name="website")
	private String Website;
    
	@Column(name="PostalAddress")
	private String PAddress;
	
    @Column(name="NumberOfcampus")
    private int Ncampus;
	
    @Column(name="Contacts")
    private String Contacts;


	@JoinColumn(name = "Organization_id")
	@ManyToOne
	private Organization organization;




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
