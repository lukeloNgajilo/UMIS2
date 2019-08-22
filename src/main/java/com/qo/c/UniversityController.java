package com.qo.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qo.m.University;
import com.qo.s.UniversityService;

import javax.persistence.GeneratedValue;

@Controller
public class UniversityController {

	
	@Autowired
	UniversityService universityservice;

	
	 @GetMapping("university")
		public String uni()
		{
			
			return"university";
			
		}
	
		
	
	@GetMapping("/saveuniversity")
 public String saveuniversity(@ModelAttribute("university")University university,ModelMap modelMap) {
	universityservice.saveuniversity(university);
	University universitysaved=universityservice.saveuniversity(university);
	String msg="university saved with id "+universitysaved.getUname();
	modelMap.addAttribute("msg",msg);
	 
	return"university";
	}
	
	
	
	
	
}
