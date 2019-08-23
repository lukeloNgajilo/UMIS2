package com.qo.c;

import com.qo.m.Organization;
import com.qo.s.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.qo.m.University;
import com.qo.respo.OrganizationRespo;
import com.qo.s.UniversityService;

import javax.persistence.GeneratedValue;
import java.util.List;

@Controller
public class UniversityController {

	@Autowired
	OrganizationService organizationservice;
	
	@Autowired
	UniversityService universityservice;
 
	@Autowired
	OrganizationRespo organizationrespo;
	
	 @RequestMapping("university")
		public String uni(ModelMap modelmap)
		{
		  List<Organization> organization=organizationservice.getallOrganization();
		  List<University>university=universityservice.getalluniversity();
		  
		  modelmap.addAttribute("organization",organization);
			
		 
		  return"university";
			
		}
	
		
	
	@RequestMapping("/saveuniversity")
 public String saveuniversity(@ModelAttribute("university")University university, ModelMap modelMap, @RequestParam("organization")String c) {
		   int a=Integer.parseInt(c); 
		university.setCountry(a);
	   
	      
	       System.out.print(a);
		universityservice.saveuniversity(university);
    
	University universitysaved=universityservice.saveuniversity(university);
	String msg="university saved with id "+universitysaved.getUname();
	modelMap.addAttribute("msg",msg);
	 
	return"university";
	}
	
	
	
	
	
}
