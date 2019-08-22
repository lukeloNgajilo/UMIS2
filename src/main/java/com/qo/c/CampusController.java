package com.qo.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qo.m.Campus;
import com.qo.respo.CampusRespo;
import com.qo.s.*;

@Controller
public class CampusController {

	@Autowired
	CampusService campusService;
	
	
	@RequestMapping("/campus")
	public String campus() {
		
		return"campus";
	}
	
	
	
	@RequestMapping("/savecampus")
 public String savecampus(@ModelAttribute("campus")Campus campus,ModelMap modelMap) {
	
	Campus campussaved=campusService.savecampus(campus);
	String msg="user saved with id "+campussaved.getCName();
	modelMap.addAttribute("msg",msg);
	 
	return"campus";
	}
	

	
	
	
  
}
