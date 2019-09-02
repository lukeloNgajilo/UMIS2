package com.qo.s;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface SecurityService {

	
	boolean login( String email,String password);
	
		
	
}
