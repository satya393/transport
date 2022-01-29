package com.bus.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.constants.Response;
import com.bus.model.UserDetails;
import com.bus.service.UserDetailsService;

@RestController
@RequestMapping("/user")
public class UserDetailsController {

	@Autowired
	UserDetailsService userdetailsservice;

	@GetMapping(value = "getuser")
	public List<UserDetails> getUserDetails() {
		return userdetailsservice.getUserDetails();

	}

	@PostMapping(value = "save_user")
	public Response saveOrUpdateUserDetails(@RequestBody UserDetails userDetails) throws IOException {

	return userdetailsservice.saveOrUpdateUserDetails(userDetails);
	}

}
