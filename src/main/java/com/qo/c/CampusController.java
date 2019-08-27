package com.qo.c;

import com.qo.m.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qo.m.Campus;
import com.qo.m.Organization;
import com.qo.respo.CampusRespo;
import com.qo.s.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CampusController {

	@Autowired
	CampusService campusService;
	
	 @Autowired
	UniversityService universityService;
   
	 @Autowired
	 OrganizationService organizationService;

	 @RequestMapping("/campus")
	 public String AddCampus(ModelMap modelmap)
	 {
	
		 List<University>university=universityService.getalluniversity();
	 	modelmap.addAttribute("university",university);

	 	return"campus";
	 }


	   @RequestMapping("/viewcampus")
	   public String Viewcampus(ModelMap modelmap)
	   {
	     	List<Campus>campus=campusService.getallCampus();
		   List<University>university=universityService.getalluniversity();
		   List<Organization>organization=organizationService.getallOrganization();
		   modelmap.addAttribute("university",university);
		   modelmap.addAttribute("campus",campus);

		   return"campus2";
	   }


	@RequestMapping("/savecampus")
	public String savecampus(@ModelAttribute("campus") Campus campus, ModelMap modelMap, @RequestParam("university")String c) {
		int a = Integer.parseInt(c);
		campus.setUniversityid(a);
		campusService.savecampus(campus);


		return "redirect:/viewcampus";
	}



	   @RequestMapping("/editcampus")
	   public String editcampuses(ModelMap modelMap,@RequestParam("id")int b)
	   {
         campusService.getCampusById(b);

	   	List<University>university=universityService.getalluniversity();
	   	List<Campus>campus=campusService.getallCampus();
	   	modelMap.addAttribute("university",university);
        modelMap.addAttribute("campus",campus);
	   	return"campus3";
	   }

	   @RequestMapping("/deletecampus")
	   public String deleteCampus(ModelMap model,@RequestParam("id")int c)
	   {
		   Campus campus=campusService.getCampusById(c);
	   	campusService.deletecampus(campus);


	   	return"redirect:/viewcampus";
	   }






}
