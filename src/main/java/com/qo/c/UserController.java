package com.qo.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qo.m.Users;
import com.qo.s.UserService;



@Controller
public class UserController {

	
	@Autowired
	 UserService userservice;
	
    
	@RequestMapping("/user")
	public String userp()
	{
		
		return"Users";
		
	}
	
	
	@RequestMapping("/saveuser")
 public String saveUser(@ModelAttribute("user")Users user,ModelMap modelMap) {
	
	Users usersaved=userservice.saveuser(user);
	String msg="user saved with id "+usersaved.getName();
	modelMap.addAttribute("msg",msg);
	 
	return"Users";
	}
	

}
