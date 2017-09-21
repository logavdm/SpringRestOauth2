package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateController {

	@RequestMapping("/private")
	String PrivateString(){
		
		return "privateString";
	}
	
}
