package com.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateController {

	@RequestMapping("/private")
	Principal PrivateString(Principal principal){
		
		return principal;
	}
	
}
