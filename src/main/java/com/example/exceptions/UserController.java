package com.example.exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
@Hidden
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value="/getuser/{user}")
	public void  getUser(@PathVariable String user){
		
		userService.printUserName(user);
		
	}

}
