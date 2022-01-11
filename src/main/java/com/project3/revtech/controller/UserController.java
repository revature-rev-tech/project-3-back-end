package com.project3.revtech.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.ProductPojo;
import com.project3.revtech.pojo.UserPojo;
import com.project3.revtech.response.JwtResponse;
import com.project3.revtech.service.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/")

//@CrossOrigin (origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	  AuthenticationManager authenticationManager;
	@Autowired
	UserService userService;

	// http://localhost:7777/api/users/2

	@PutMapping("users/{uid}")
	UserPojo updateUser(@Valid @RequestBody UserPojo userPojo) throws ApplicationException {
		return userService.updateUserService(userPojo);
	}
	
    @GetMapping("users/{uid}")
	    UserPojo getAuser(@PathVariable("uid") int user_id) throws ApplicationException{
	        return userService.getAUserService(user_id);
	    }
	
}
