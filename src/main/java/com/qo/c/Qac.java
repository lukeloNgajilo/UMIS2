package com.qo.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Qac {
     
    
    
    @RequestMapping(value = "/one", method = RequestMethod.GET)
	public String name()
	{
	return "campus";
	}
	
	
	
}
