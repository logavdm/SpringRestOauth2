package com.authconfig;

	

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.stereotype.Component;

@Component
public class TokenStore {

	@Autowired
	DataSource dataSource;
	

	public DataSource getDataSource(){
		return this.dataSource;
	}
	
	public JdbcTokenStore getTokenStore(){
		
		return new JdbcTokenStore(dataSource);
	}
	
}
