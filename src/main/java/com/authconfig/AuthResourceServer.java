package com.authconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class AuthResourceServer extends ResourceServerConfigurerAdapter {
	
	 public static final String RESOURCE_ID = "restservice";
	  
	 
	 @Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		 resources.resourceId(RESOURCE_ID);
		 
	}

	
	@Override
	public void configure(HttpSecurity http) throws Exception {
	
		http.csrf().disable().authorizeRequests().antMatchers("/").permitAll().antMatchers("/private").permitAll().and()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	
	}

	
}
