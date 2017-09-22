package com.authconfig;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

import com.repositry.UserService;

@Configuration
@EnableAuthorizationServer
public class AuthServer extends AuthorizationServerConfigurerAdapter{
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	UserService service;
	
	@Value("${oauth2.client.id}")
	private String ClientId;
	
	@Value("${oauth2.client.client-secret}")
	private String ClientSecret;
	
	@Value("${security.oauth2.client.access-token-validity-seconds}")
	private String Timeout;
	
	@Autowired
	TokenStore tokenStore;
	

 
	
	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
	
		security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
		
	}
	
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		
		clients.jdbc(tokenStore.getDataSource());
		
//		clients.inMemory().withClient(ClientId).secret(ClientSecret).accessTokenValiditySeconds(Integer.parseInt(Timeout))
//		.scopes("read", "write").authorizedGrantTypes("password", "refresh_token").resourceIds("restservice");
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
	
		endpoints.authenticationManager(authenticationManager);
		endpoints.userDetailsService(service);
		endpoints.tokenStore(tokenStore.getTokenStore());
		
	}
	
	
	
}
