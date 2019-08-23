package com.qo.m;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Entity
public class Deparment {


	@ManyToOne
	@JoinColumn(name="Faculty_id")
	private Faculty faculty;




	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private String DName;

  private String code;
  private String HOD;
  
  private String Faculty;


  
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
