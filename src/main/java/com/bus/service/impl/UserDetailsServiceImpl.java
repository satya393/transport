package com.bus.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.model.UserDetails;
import com.bus.repository.UserDetailsRepository;
import com.bus.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	UserDetailsRepository userdetailsrepository ;

	@Override
	public List<UserDetails> getUserDetails() {
		return userdetailsrepository.findAll();
	}

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails) {
		return userdetailsrepository.save(userDetails);
	}

	

	
	

	
	
	
	
	

}
