package com.bus.service;

import java.io.IOException;
import java.util.List;

import com.bus.model.UserDetails;

public interface UserDetailsService {

	List<UserDetails> getUserDetails();

	UserDetails saveOrUpdateUserDetails(UserDetails userDetails) throws IOException;

}
