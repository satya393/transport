package com.bus.service.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.model.UserDetails;
import com.bus.repository.UserDetailsRepository;
import com.bus.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	public static Integer ZERO = BigDecimal.ZERO.intValue();
	@Autowired
	UserDetailsRepository userdetailsrepository;

	@Override
	public List<UserDetails> getUserDetails() {
		return userdetailsrepository.findAll();
	}

	@Override
	public UserDetails saveOrUpdateUserDetails(UserDetails userDetails) throws IOException {
		UserDetails userDetailsResponseObj = null;
		Integer userId = userDetails.getUserId();
		UserDetails userEmailDbObject = userdetailsrepository.findByUserEmail(userDetails.getUserEmail());
		UserDetails userPhoneDbObject = userdetailsrepository.findByUserPhoneNumber(userDetails.getUserPhoneNumber());
		Integer userIDEmailDB = userEmailDbObject == null ? ZERO : userEmailDbObject.getUserId();
		Integer userIDPhoneDB = userPhoneDbObject == null ? ZERO : userPhoneDbObject.getUserId();

		if ((userIDPhoneDB == userId && userIDEmailDB == ZERO) || (userIDEmailDB == userId && userIDPhoneDB == ZERO)
				|| (userIDEmailDB == userId && userIDPhoneDB == userId)
				|| (userEmailDbObject == null && userPhoneDbObject == null)) {
			userDetailsResponseObj = saveUserDetails(userDetails);
		} else if (userPhoneDbObject != null && userIDPhoneDB != userId) {
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
