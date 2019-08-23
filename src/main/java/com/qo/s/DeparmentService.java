package com.qo.s;

import java.util.List;

import com.qo.m.Deparment;


public interface DeparmentService {


	Deparment savedeparment(Deparment deparment);
	
	Deparment updatedeparment(Deparment deparment);
	
	void deletedeparment(Deparment deparment);
	
	List<Deparment> getalldeparment();
	
}
