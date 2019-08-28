package com.qo.m;


import java.util.List;

import javax.persistence.*;
@Entity
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;


	@Column(name="FacultyName")
	private String fname;
	
    @Column(name="FacultyCode",nullable=false)
	private String Code;
	
    @Column(name="Shortname")
	private String Shortname;

	public String getShortName() {
		return Shortname;
	}

	public void setShortName(String shortName) {
		Shortname = shortName;
	}


	@Column(name="campus_id")
	private int campus_id;

	public int getIcd() {
		return campus_id;
	}

	public void setIcd(int icd) {
		this. campus_id= icd;
	}


	public Campus getCampus() {
		return Campus;
	}

	public void setCampus(Campus campus) {
		Campus = campus;
	}

	@JoinColumn(name = "Campus_id",nullable=false,insertable = false, updatable =false)
	@ManyToOne(fetch = FetchType.EAGER)
	private Campus Campus;
    
    
    
    public String getFName() {
		return fname;
	}
	public String getCode() {
		return Code;
	}
	public String getSName() {
		return Shortname;
	}

	
	
	public void setFName(String fName) {
		fname = fName;
	}
	public void setCode(String code) {
		Code = code;
	}
	public void setSName(String sName) {
		Shortname = sName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Faculty [Fname=" + fname + ", Code=" + Code + ", SName=" + Shortname +
				 "]";
	}

}
