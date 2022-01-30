package com.bus.service;

import java.util.List;

import com.bus.constants.Response;
import com.bus.model.StaffDetails;

public interface StaffDetailsService {

	List<StaffDetails> getStaffDetails();

	StaffDetails saveStaffDetails(StaffDetails staffDetails);

	Response saveSign_in_StaffDetails(StaffDetails staffDetails);

}
