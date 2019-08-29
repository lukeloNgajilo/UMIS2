package com.qo.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qo.m.Users;
import com.qo.s.UserService;

import java.util.List;


@Controller
public class UserController {



	@Autowired
	 UserService userservice;
	
    
	@RequestMapping("/users")
	public String adduser()
	{
		
		return"Users";
		
	}
	
	
	@RequestMapping("/saveuser")
 public String saveUser(@ModelAttribute("user")Users user,ModelMap modelMap) {
	
	Users usersaved=userservice.saveuser(user);

	 
	return"redirect:viewuser";
	}
	
  @RequestMapping("/viewuser")
	public String viewusers() {
	  List<Users> user = userservice.getallusers();


	  return "Users3";
  }

  @RequestMapping("/")
	public String deleteusers()
	{


		return "";
	}




}
