package com.qo.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.qo.s.UserDetailsimplementssss;

@Configuration
@EnableWebSecurity
@Service
@Component





public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


	
	
	@Autowired
	UserDetailsimplementssss userdetailsss;

	
	
   @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return new BCryptPasswordEncoder();
    }


   @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.userDetailsService(userdetailsss).passwordEncoder(bCryptPasswordEncoder());
	}
   

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();


    }


   /*@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }*/


    public void configure(HttpSecurity http) throws Exception{


        http.authorizeRequests().antMatchers("/university","/login","/add","/viewuniversity","/savelogin","/viewuser","/saveuser","/addusers").permitAll()
                .antMatchers("/admin/adduniversity","edituniversity","/edituniversity","/saveuniversity").hasAnyAuthority("ADMIN").anyRequest().authenticated().and().csrf().disable();
    }
}
