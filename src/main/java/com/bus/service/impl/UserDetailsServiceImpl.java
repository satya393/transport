package com.bus.service.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.model.UserDetails;
import com.bus.repository.UserDetailsRepository;
import com.bus.service.UserDetailsService;
import com.bus.constants.CommonConstansts;
import com.bus.constants.Response;

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
	public Response saveOrUpdateUserDetails(UserDetails userDetails) throws IOException {
		Response response = new Response();
		Response.Status status = new Response.Status();
		Integer userId = userDetails.getUserId();
		UserDetails userEmailDbObject = userdetailsrepository.findByUserEmail(userDetails.getUserEmail());
		UserDetails userPhoneDbObject = userdetailsrepository.findByUserPhoneNumber(userDetails.getUserPhoneNumber());
		Integer userIDEmailDB = userEmailDbObject == null ? ZERO : userEmailDbObject.getUserId();
		Integer userIDPhoneDB = userPhoneDbObject == null ? ZERO : userPhoneDbObject.getUserId();

		if ((userIDPhoneDB == userId && userIDEmailDB == ZERO) || (userIDEmailDB == userId && userIDPhoneDB == ZERO)
				|| (userIDEmailDB == userId && userIDPhoneDB == userId)) {
			response.setData(saveUserDetails(userDetails));
			status.setMessage(CommonConstansts.UserDetails.USER_UPDATED);
			status.setSuccess(CommonConstansts.ResponseStatus.SUCCESS);
		} else if((userEmailDbObject == null && userPhoneDbObject == null)){
			response.setData(saveUserDetails(userDetails));
			status.setMessage(CommonConstansts.UserDetails.USER_SAVED);
			status.setSuccess(CommonConstansts.ResponseStatus.SUCCESS);
		}else if (userPhoneDbObject != null && userIDPhoneDB != userId) {
			status.setMessage(CommonConstansts.UserDetails.PHONE_EXIST);
			status.setSuccess(CommonConstansts.ResponseStatus.FAIL);
		} else if (userEmailDbObject != null) {
			status.setMessage(CommonConstansts.UserDetails.EMAIL_EXIST);
			status.setSuccess(CommonConstansts.ResponseStatus.FAIL);
		}

		response.setStatus(status);
		return response;
	}

	public UserDetails saveUserDetails(UserDetails userDetails) {
		return userdetailsrepository.save(userDetails);
	}
}