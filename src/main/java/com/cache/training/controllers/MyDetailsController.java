package com.cache.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cache.training.entity.MyEmployees;
import com.cache.training.services.MyLoginDetailsService;

@RestController
public class MyDetailsController {

	@Autowired
	private MyLoginDetailsService myLoginDetailsService;

	@GetMapping(value = "getDetails/{userName}/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
	public MyEmployees getDetails(@PathVariable("userName") String userName,
			@PathVariable("password") String password) {
		return myLoginDetailsService.getMyLoginDetails(userName, password);
	}

}
