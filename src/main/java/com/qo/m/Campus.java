package com.qo.m;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.NaturalId;
import org.springframework.stereotype.Component;

@Entity

public class Campus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;


	@JoinColumn(name = "University_id")
	@ManyToOne
	private University university;



	@Column(name="CampusName")
	private String CName;

	
	private String location;
	
	
	private String Region;
	
	
	private String Contacts;
	

	private String Website;
	
	
	private String Shortname;
	
	
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
	
	
	public String getShortname() {
		return Shortname;
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
	
	public void setShortname(String shortName) {
		Shortname = shortName;
	}
	@Override
	public String toString() {
		return "Campus [CName=" + CName + ", location=" + location + ", Region=" + Region + ", Contacts=" + Contacts
				+ ", Website=" + Website + ", Faculty=" + ", ShortName=" + Shortname + "]";
	}
	
}
