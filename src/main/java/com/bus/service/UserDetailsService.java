package com.bus.service;

import java.util.List;

import com.bus.model.UserDetails;

public interface UserDetailsService {

	List<UserDetails> getUserDetails();

    UserDetails saveUserDetails(UserDetails userDetails);



	

}
