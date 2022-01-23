package com.bus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.model.UserDetails;
import com.bus.repository.UserDetailsRepository;

@RestController
@RequestMapping("/user")
public class UserDetailsController {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	@GetMapping
	public List<UserDetails> getUserDetails()
	{
		return  userDetailsRepository.findAll();
		
	}
	
	@PostMapping
	public UserDetails saveUserDetails(@RequestBody UserDetails userDetails) {
		
		return userDetailsRepository.save(userDetails);
	}
	
}
