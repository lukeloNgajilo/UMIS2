package com.qo.m;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Component
public class Organization {
   @Id
    private int id;

   @Column(name="OrganizationName")
    private String name;



    public Organization() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
