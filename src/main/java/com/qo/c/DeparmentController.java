package com.qo.c;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qo.m.Deparment;
import com.qo.s.DeparmentService;


@RestController
public class DeparmentController {

DeparmentService deparmentservice;

	
	@RequestMapping("/savedeparment")
	 public String savedeparment(@ModelAttribute("deparment")Deparment deparment,ModelMap modelMap) {
		
		Deparment deparmentsaved=deparmentservice.savedeparment(deparment);
		String msg="user saved with id "+deparmentsaved.getDName();
		modelMap.addAttribute("msg",msg);
		 
		return"one";
		}
	
	
	
	
}
