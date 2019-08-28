package com.qo.m;

import javax.persistence.*;

@Entity
public class Programme {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="ProgrammeName")
	private String name;

	@Column(name="ProgrammeCode")
	private String code;
	
	@Column(name="ProgrammeType")
	private String Otype;
	
	@Column(name="ProgrammeShortname")
	private String ShortName;
	
	@Column(name="DurationofProgramme")
	private String Year;
	
	@Column(name="Faculty")
	private String Faculty;

	public int getDeparmentid() {
		return deparmentid;
	}

	public void setDeparmentid(int deparmentid) {
		this.deparmentid = deparmentid;
	}

	private int deparmentid;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="Deparment_id")
	private Deparment deparment;




	public Deparment getDeparment() {
		return deparment;
	}

	public void setDeparment(Deparment deparment) {
		this.deparment = deparment;
	}

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
