package com.bus.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.model.UserDetails;
import com.bus.repository.UserDetailsRepository;
import com.bus.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsRepository userdetailsrepository;

	@Override
	public List<UserDetails> getUserDetails() {
		return userdetailsrepository.findAll();
	}

	@Override
	public UserDetails saveOrUpdateUserDetails(UserDetails userDetails) throws IOException {
		UserDetails userDetailsResponseObj = null;
		UserDetails userEmailDbObject = userdetailsrepository.findByUserEmail(userDetails.getUserEmail());
		UserDetails userPhoneDbObject = userdetailsrepository.findByUserPhoneNumber(userDetails.getUserPhoneNumber());
		Integer userId = userDetails.getUserId();
		if (userDetails.getUserId() != null) {
			if (userEmailDbObject.getUserId() == userId || userEmailDbObject.getUserId() == userId) {
				userDetailsResponseObj = saveUserDetails(userDetails);
			} else {
				throw new IOException("This phone number or email is already registered by someone");
			}
		} else {
			if (userEmailDbObject == null && userPhoneDbObject == null) {
				userDetailsResponseObj = saveUserDetails(userDetails);
			} else {
				throw new IOException("This phone number or email is already registered by someone");
			}
		}
		return userDetailsResponseObj;
	}

	public UserDetails saveUserDetails(UserDetails userDetails) {
		return userdetailsrepository.save(userDetails);
	}
}
