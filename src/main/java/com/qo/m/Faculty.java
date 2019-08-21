package com.qo.m;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String FName;

	private String Code;
	
	private String ShortName;
	private String locaion;
	private String Scampus;
	private String SFaculty;
	
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
	public String getScampus() {
		return Scampus;
	}
	public String getSFaculty() {
		return SFaculty;
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
	public void setScampus(String scampus) {
		Scampus = scampus;
	}
	public void setSFaculty(String sFaculty) {
		SFaculty = sFaculty;
	}
	@Override
	public String toString() {
		return "Faculty [FName=" + FName + ", Code=" + Code + ", SName=" + ShortName + ", locaion=" + locaion + ", Scampus="
				+ Scampus + ", SFaculty=" + SFaculty + "]";
	}

}
