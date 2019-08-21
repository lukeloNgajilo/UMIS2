package com.qo.s;

import java.util.List;

import com.qo.m.*;


public interface UniversityService {
	
	University saveuniversity(University university);
	
University updateuniversity(University university);
	
	void deleteuniversity(University university);
	   
    List<University> getalluniversity();

}
