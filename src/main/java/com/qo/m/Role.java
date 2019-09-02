package com.qo.m;

import org.dom4j.tree.AbstractEntity;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role extends AbstractEntity implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;


    private String name;

    public Set<Users> getUser() {
        return user;
    }

    public void setUser(Set<Users> user) {
        this.user = user;
    }

    @ManyToMany(mappedBy ="roles")
    private Set<Users> user;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return name;
	}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
