package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	
	@RequestMapping("/")
	String GetIndexContent(){
				
		return "config";
	}
	
	@RequestMapping("/protected")
	String ProtectedController(){
		return "protected";
	}
	
}
