package com.qo.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qo.m.User;
import com.qo.s.UserService;



@Controller
public class UserController {

	
	@Autowired
	 UserService userservice;
	
    @ResponseBody
	@GetMapping("/lala")
	public String login()
	{		
		return "two";
	}
	

	@RequestMapping("/lap")
	public String lap()
	{		
		return"WELCOME";
	}
	
	@RequestMapping("/lo")
	public String done()
	{
		
		return"campus";
		
	}
	
	
	@RequestMapping("/savelogin")
 public String saveUserLogin(@ModelAttribute("user")User user,ModelMap modelMap) {
	
	User usersaved=userservice.saveuser(user);
	String msg="user saved with id "+usersaved.getName();
	modelMap.addAttribute("msg",msg);
	 
	return"one";
	}
	

}
