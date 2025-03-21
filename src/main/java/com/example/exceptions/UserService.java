package com.example.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	public void printUserName(String username) {	
		if(username.contains("@")) {
			logger.info("invalid user");
			logger.debug("hello user");
			logger.trace("nsbsjxhbsd");
		}  
		else {
			throw new DataInvalidException("user is invalid");
		}
		
	}
}
