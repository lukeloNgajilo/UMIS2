package com.qo.c;

import com.qo.m.Organization;
import com.qo.s.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.qo.m.University;
import com.qo.respo.OrganizationRespo;
import com.qo.respo.UniversityRespo;
import com.qo.s.UniversityService;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.Optional;

@Controller
public class UniversityController {

	@Autowired
	OrganizationService organizationservice;
	
	@Autowired
	UniversityService universityservice;
 
	@Autowired
	UniversityRespo universityrespo;
 
	
	@Autowired
	OrganizationRespo organizationrespo;
	
	
	@RequestMapping("university")
	public String adduniversity(ModelMap modelmap)
	{
		  List<Organization> organization=organizationservice.getallOrganization();
		  modelmap.addAttribute("organization",organization);
		return"university";
	}
	
	 @RequestMapping("/viewuniversity")
		public String viewdetails(ModelMap modelmap)
		{
		  List<Organization> organization=organizationservice.getallOrganization();
		  List<University>university=universityservice.getalluniversity();
		  modelmap.addAttribute("university",university);
		  modelmap.addAttribute("organization",organization);
				 
		  return"university2";
			
		}

	 
	
	 
		
	
	@RequestMapping("/saveuniversity")
 public String saveuniversity(@ModelAttribute("university")University university, ModelMap modelMap, @RequestParam("organization")String c) {
		   int a=Integer.parseInt(c); 
		university.setCountry(a);
		universityservice.saveuniversity(university);
	      

	 
	return"redirect:/viewuniversity";
	}

	
	@RequestMapping("/edituniversity")
	public String edituniversity(@RequestParam("id")int b,ModelMap modelmap)
	{
   University university =universityservice.getalluniversitybyId(b);
    List<Organization> organization=organizationservice.getallOrganization();
    modelmap.addAttribute("organization",organization);
    
    modelmap.addAttribute("university",university);
		
		return"university3";
	}
	

	  @RequestMapping("/deleteuniversity")
	public String deleteuniversity(@RequestParam("id")int c,ModelMap modelmap)
	{
		University university=universityservice.getalluniversitybyId(c);
		universityservice.deleteuniversity(university);
		
		return"redirect:/viewuniversity";
	}
	
	
	
	
	
	
	
}
