package com.qo.m;


import java.util.List;

import javax.persistence.*;
@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;


	@Column(name="FacultyName",nullable=false)
	private String FName;
	
    @Column(name="FacultyCode",nullable=false)
	private String Code;
	
    @Column(name="Shortname",nullable=false)
	private String ShortName;
	
    @Column(name="location",nullable=false)
    private String locaion;


	public String getShortName() {
		return ShortName;
	}

	public void setShortName(String shortName) {
		ShortName = shortName;
	}


	@Column(name="campus_id")
	private int campus_id;

	public int getIcd() {
		return campus_id;
	}

	public void setIcd(int icd) {
		this. campus_id= icd;
	}


	
  //  @JoinColumn(name = "Campus_id",nullable=false)
//	@ManyToOne
	//private Campus Campus;
    
    
    
    public String getFName() {
		return FName;
	}
	public String getCode() {
		return Code;
	}
	public String getSName() {
		return ShortName;
	}
	public String getLocaion() {
		return locaion;
	}
	
	
	public void setFName(String fName) {
		FName = fName;
	}
	public void setCode(String code) {
		Code = code;
	}
	public void setSName(String sName) {
		ShortName = sName;
	}
	public void setLocaion(String locaion) {
		this.locaion = locaion;
	}
	
	@Override
	public String toString() {
		return "Faculty [FName=" + FName + ", Code=" + Code + ", SName=" + ShortName + ", locaion=" + locaion + ", Scampus="
				+ ", SFaculty=" + "]";
	}

}
