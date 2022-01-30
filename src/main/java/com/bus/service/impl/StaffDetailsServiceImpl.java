package com.bus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.constants.CommonConstansts;
import com.bus.constants.Response;
import com.bus.model.StaffDetails;
import com.bus.repository.StaffDetailsRepository;
import com.bus.service.StaffDetailsService;

@Service
public class StaffDetailsServiceImpl implements StaffDetailsService {
	@Autowired
	StaffDetailsRepository staffdetailsrepository;

	@Override
	public List<StaffDetails> getStaffDetails() {
		return staffdetailsrepository.findAll();
	}

	@Override
	public StaffDetails saveStaffDetails(StaffDetails staffDetails) {
		return staffdetailsrepository.save(staffDetails);
	}

	@Override
	public Response saveSign_in_StaffDetails(StaffDetails staffDetails) {
		Response response = new Response();
		Response.Status status = new Response.Status();
		String staffEmailID = staffDetails.getStaffEmail();
		if (staffEmailID != null && !staffEmailID.isBlank()) {
			StaffDetails staffEmailDbObject = staffdetailsrepository.findByStaffEmail(staffEmailID);
			if (staffEmailDbObject != null) {
				response.setData(staffEmailDbObject);
				status.setMessage(CommonConstansts.StaffDetails.EMAIL_EXIST);
				status.setSuccess(CommonConstansts.ResponseStatus.SUCCESS);
			} else {
				status.setMessage(CommonConstansts.StaffDetails.EMAIL_NOT_FOUND);
				status.setSuccess(CommonConstansts.ResponseStatus.FAIL);
			}
		} else {
			status.setMessage(CommonConstansts.StaffDetails.EMPTY_EMAIL_EXIST);
			status.setSuccess(CommonConstansts.ResponseStatus.FAIL);
		}
		response.setStatus(status);
		return response;
	}

}
