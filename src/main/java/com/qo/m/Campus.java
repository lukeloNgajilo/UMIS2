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


//	@JoinColumn(name = "University_id",nullable=false)
	//@ManyToOne
	//private University university;



	@Column(name="CampusName",nullable=false)
	private String CName;

	@Column(nullable=false)
	private String location;
	
	@Column(nullable=false)
	private String Region;
	
	@Column(nullable=false)
	private String Contacts;
	
	@Column(nullable=false)
	private String Website;
	
	@Column(nullable=false)
	private String Shortname;

	@Column(name="university_id")
	private int universityid;


	public int getUniversityid() {
		return universityid;
	}

	public void setUniversityid(int universityid) {
		this.universityid = universityid;
	}

	
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
