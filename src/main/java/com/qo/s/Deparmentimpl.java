package com.qo.s;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qo.m.*;
import com.qo.respo.*;


@Component
public class Deparmentimpl implements DeparmentService {

@Autowired	
DeparmentRespo deparmentrespo;	
	
	@Override
	public Deparment savedeparment(Deparment deparment) {
		// TODO Auto-generated method stub
	return deparmentrespo.save(deparment);
	}

	@Override
	public Deparment updatedeparment(Deparment deparment) {
		// TODO Auto-generated method stub
		return deparmentrespo.save(deparment);
	}

	@Override
	public void deletedeparment(Deparment deparment) {
		// TODO Auto-generated method stub
         deparmentrespo.delete(deparment);
	}

	@Override
	public List<Deparment> getalldeparment() {
		// TODO Auto-generated method stub
		return deparmentrespo.findAll();
	}

}
