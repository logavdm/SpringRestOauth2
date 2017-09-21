package com.authconfig;

import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.stereotype.Component;

@Component
public class TokenStore {

	public static InMemoryTokenStore token=new InMemoryTokenStore();
	
	public static InMemoryTokenStore GetTokenStore(){
		return token;
	}
	
}
