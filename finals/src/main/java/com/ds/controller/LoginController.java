package com.ds.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/security")
public class LoginController { 
	
	@RequestMapping(value="/accessDenied") 
	public String accessDeniedPage() throws Exception { 
		
		return "/security/accessDenied"; 
	}
	
	@RequestMapping(value="/loginPage")
	public String loginPage() throws Exception {
		
		return "/security/login";
	}
	
}

