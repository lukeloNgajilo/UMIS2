package com.qo.m;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Programme {

	
	private String name;
	@Id
	()
	private String code;
	
	private String Otype;
	
	private String ShortName;
	
	private String Year;
	
	private String Faculty;
	
			
	public String getCode() {
		return code;
	}
	public String getFaculty() {
		return Faculty;
	}
	public String getIntervals() {
		return Year;
	}
	public String getname() {
		return name;
	}
	public String getShortName() {
		return ShortName;
	}
	public String getType() {
		return Otype;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setFaculty(String faculty) {
		this.Faculty = faculty;
	}
	public void setIntervals(String intervals) {
		this.Year = intervals;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setShortName(String shortName) {
		ShortName = shortName;
	}
	public void setType(String type) {
		this.Otype = type;
	}
	@Override
	public String toString() {
		return "Programmer [name=" + name + ", code=" + code + ", type=" + Otype + ", ShortName=" + ShortName
				+ ", intervals=" + Year + ", faculty=" + Faculty + "]";
	}
	
}
