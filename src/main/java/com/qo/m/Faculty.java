package com.qo.m;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="FacultyName")
	private String FName;
	
    @Column(name="FacultyCode")
	private String Code;
	
    @Column(name="FacultyShortname")
	private String ShortName;
	
    @Column(name="location")
    private String locaion;
	
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
