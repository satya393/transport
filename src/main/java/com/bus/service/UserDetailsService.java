package com.bus.service;

import java.io.IOException;
import java.util.List;

import com.bus.constants.Response;
import com.bus.model.UserDetails;

public interface UserDetailsService {

	List<UserDetails> getUserDetails();

	Response saveOrUpdateUserDetails(UserDetails userDetails) throws IOException;

}
