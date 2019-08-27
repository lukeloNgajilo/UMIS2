package com.qo.m;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.util.List;


@Entity
public class Deparment {


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="Faculty_id",nullable=false,insertable = false, updatable =false)
	private Faculty faculty;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

   @Column(name="DeparmentName",nullable=false)
	private String DName;

   	@Column(nullable=false)
   	private String code;

	@Column(name="HeadOfdeparmnet",nullable=false)
	private String HOD;

	@Column(nullable=false)
	private String Faculty;

	private int faculty_id;


	public String getHOD() {
		return HOD;
	}

	public void setHOD(String HOD) {
		this.HOD = HOD;
	}


	public int getFaculty_id() {
		return faculty_id;
	}

	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}


public String getDName() {
	return DName;
}
public String getCode() {
	return code;
}
public String getFaculty() {
	return Faculty;
}
public void setDName(String dName) {
	DName = dName;
}
public void setCode(String code) {
	this.code = code;
}
public void setFaculty(String faculty) {
	Faculty = faculty;
}
@Override
public String toString() {
	return "Deparment [DName=" + DName + ", code=" + code + ", HOD=" + HOD + ", Faculty=" + Faculty + "]";
}
}
