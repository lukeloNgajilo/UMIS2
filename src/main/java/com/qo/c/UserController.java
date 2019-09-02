package com.qo.c;

import com.qo.respo.UserRespo;
import com.qo.s.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.qo.m.Users;
import com.qo.s.UserService;

import java.util.List;


@Controller
public class UserController {

	@Autowired
	UserRespo userrespo;


	@Autowired
	 UserService userservice;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Autowired
	 private SecurityService securityService;



    @RequestMapping("users")
	public String index()
	{

		return"Users";
	}


	@RequestMapping("/addusers")
	public String adduser()
	{
		
		return"Usersa";
		
	}
	
	
	@RequestMapping("/saveuser")
 public String saveUser(@ModelAttribute("user")Users user,ModelMap modelMap) {



	Users usersaved=userservice.saveuser(user);

	 
	return"redirect:viewuser";
	}
	
  @RequestMapping("/viewuser")
	public String viewusers() {
	  List<Users> user = userservice.getallusers();


	  return "Users2";
  }


	@RequestMapping("/editusers")
  public String Edit(ModelMap modelmap, @RequestParam("id") int a)
  {

  	  userservice.getbyid(a);
	  List<Users> user = userservice.getallusers();
	  modelmap.addAttribute("user",user);


  	return"Users3";
  }

  @RequestMapping("/deleteusers")
  public String delete(@RequestParam("id")int b)
  {
  	Users user=userservice.getbyid(b);
  	userservice.deleteuser(user);


  	return "redirect:/viewuser";
  }


 @RequestMapping("/save ")
	public String login(@RequestParam("email") String email,@RequestParam("password")String password ,ModelMap modelmap) {


boolean loginresponse =securityService.login(email,password);

	 	Users user=userrespo.findByEmail(email);

	 	if(user.getPassword().equals("password"))
		{
			modelmap.addAttribute("msg","inavlid email or paasword");

		}




	 	return"login";




 }

@RequestMapping("/add")
  public  String man()
  {


  	return"login";
  }














}
