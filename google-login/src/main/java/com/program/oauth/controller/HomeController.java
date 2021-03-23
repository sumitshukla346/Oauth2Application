package com.program.oauth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return"Any user can access this";
	}
	
	@GetMapping("/prevent")
	public Principal prevent(Principal principal) {
		return principal;
	}

}
