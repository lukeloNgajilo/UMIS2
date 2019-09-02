package com.qo.s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class SecurityServiceimplemt implements SecurityService {

	@Autowired
	UserDetailsimplementssss userdetailsss;

	public SecurityServiceimplemt() {
	}

	@Autowired
	@Qualifier("authenticationManagerBean")
	AuthenticationManager authenticationManager;

    @Override
	public boolean login(String username, String password) {
		UserDetails userDetails =userdetailsss.loadUserByUsername(username);

		UsernamePasswordAuthenticationToken token= new UsernamePasswordAuthenticationToken(userDetails,password,userDetails.getAuthorities());

		authenticationManager.authenticate(token);

    boolean result=token.isAuthenticated();

    if (result)
	{
		SecurityContextHolder.getContext().setAuthentication(token);
	}

return result;
	}

}

