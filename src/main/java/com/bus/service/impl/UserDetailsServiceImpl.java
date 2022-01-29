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

	@SuppressWarnings("unused")
	@Override
	public UserDetails saveOrUpdateUserDetails(UserDetails userDetails) throws IOException {
		UserDetails userDetailsResponseObj = null;
		UserDetails userEmailDbObject = userdetailsrepository.findByUserEmail(userDetails.getUserEmail());
		UserDetails userPhoneDbObject = userdetailsrepository.findByUserPhoneNumber(userDetails.getUserPhoneNumber());
		Integer userId = userDetails.getUserId();
		Integer userEmailID = userEmailDbObject == null ? 0 : userEmailDbObject.getUserId();
		Integer userPhoneID = userPhoneDbObject == null ? 0 : userPhoneDbObject.getUserId();
		if (userId != null) {
			if (userEmailID == userId || userPhoneID == userId) {
				if (userPhoneID == userId && userEmailID == 0) {
					userDetailsResponseObj = saveUserDetails(userDetails);
				} else if (userEmailID == userId && userPhoneID == 0) {
					userDetailsResponseObj = saveUserDetails(userDetails);
				} else if (userEmailID == userId && userPhoneID == userId) {
					userDetailsResponseObj = saveUserDetails(userDetails);
				} else {
					userDetailsResponseObj = saveValidateUserDetails(userDetails, userEmailDbObject, userPhoneDbObject);
				}
			} else {
				userDetailsResponseObj = saveValidateUserDetails(userDetails, userEmailDbObject, userPhoneDbObject);
			}
		} else {
			userDetailsResponseObj = saveValidateUserDetails(userDetails, userEmailDbObject, userPhoneDbObject);
		}
		return userDetailsResponseObj;
	}

	private UserDetails saveValidateUserDetails(UserDetails userDetails, UserDetails userEmailDbObject,
			UserDetails userPhoneDbObject) throws IOException {
		UserDetails userDetailsResponseObj = null;
		if (userEmailDbObject == null && userPhoneDbObject == null) {
			userDetailsResponseObj = saveUserDetails(userDetails);
		} else if (userPhoneDbObject != null && userPhoneDbObject.getUserId() != userDetails.getUserId()) {
			throw new IOException("This phone number is already registered by someone");
		} else if (userEmailDbObject != null) {
			throw new IOException("This EmailID is already registered by someone");
		}
		return userDetailsResponseObj;
	}

	public UserDetails saveUserDetails(UserDetails userDetails) {
		return userdetailsrepository.save(userDetails);
	}
}
