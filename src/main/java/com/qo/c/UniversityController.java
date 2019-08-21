package com.qo.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qo.m.University;
import com.qo.s.UniversityService;

import javax.persistence.GeneratedValue;

@RestController
public class UniversityController {

	
	@Autowired
	UniversityService universityservice;

	@ResponseBody
	 @RequestMapping("/")
		public String uni()
		{
			
			return"university";
			
		}
	 @RequestMapping("/one")
	 public String nam()
	 {
		 return"Tanzania";
	 }
		
	
	@RequestMapping("/saveduni")
 public String saveuniversityLogin(@ModelAttribute("university")University university,ModelMap modelMap) {
	universityservice.saveuniversity(university);
	University universitysaved=universityservice.saveuniversity(university);
	String msg="university saved with id "+universitysaved.getUname();
	modelMap.addAttribute("msg",msg);
	 
	return"uni";
	}
	
	
	
	
	
}
