package com.qo.m;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Universit")
public class University {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	@Column(name="")
    private String Contacts;
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
