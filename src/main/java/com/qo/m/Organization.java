package com.qo.m;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Component
public class Organization {
   public Organization() {
		super();
	}

    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;    
    
    
   
   public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}

@Column(name="OrganizationName")
   private String name;

	
	  public Organization(int id, String name) { super(); this.id = id; this.name =
	  name; }
	
	


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
