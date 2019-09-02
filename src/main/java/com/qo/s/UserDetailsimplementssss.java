package com.qo.s;

import com.qo.m.Users;
import com.qo.respo.UserRespo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class UserDetailsimplementssss implements UserDetailsService {


	@Autowired
	UserRespo userRespo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Users user=	userRespo.findByEmail(email);
     if(user==null)
	 {


	 	 throw new UsernameNotFoundException("user not found "+email);
	 }




	return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getName(),user.getRoles());


	}




}
