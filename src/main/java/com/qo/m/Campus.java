package com.qo.m;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Campus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="CampusName")
	private String CName;

	
	private String location;
	
	
	private String Region;
	
	
	private String Contacts;
	

	private String Website;
	
	@Column(name="Shortname")
	private String ShortName;
	
	
	public String getCName() {
		return CName;
	}
	public String getLocation() {
		return location;
	}
	public String getRegion() {
		return Region;
	}
	public String getContacts() {
		return Contacts;
	}
	public String getWebsite() {
		return Website;
	}
	
	
	public String getShortName() {
		return ShortName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public void setContacts(String contacts) {
		Contacts = contacts;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	
	public void setShortName(String shortName) {
		ShortName = shortName;
	}
	@Override
	public String toString() {
		return "Campus [CName=" + CName + ", location=" + location + ", Region=" + Region + ", Contacts=" + Contacts
				+ ", Website=" + Website + ", Faculty=" + ", ShortName=" + ShortName + "]";
	}
	
}
