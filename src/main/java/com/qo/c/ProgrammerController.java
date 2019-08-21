package com.qo.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qo.m.Programme;
import com.qo.s.Programmeservice;



@RestController
public class ProgrammerController {

	@Autowired
	Programmeservice programmeservice;

	@RequestMapping("/saveprogramme")
	public String saveprogramme(@ModelAttribute("programme") Programme programme, ModelMap modelMap) {
		Programme programmesaved = programmeservice.saveprogramme(programme);
		String msg = "user saved with id " + programmesaved.getname();
		modelMap.addAttribute("msg", msg);

		return "saved";
	}
	
	

		

	
	
	
	
	
	
}
