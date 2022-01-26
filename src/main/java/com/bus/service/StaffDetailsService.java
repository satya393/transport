package com.bus.service;

import java.util.List;

import com.bus.model.StaffDetails;

public interface StaffDetailsService {

	List<StaffDetails> getStaffDetails();

	StaffDetails saveStaffDetails(StaffDetails staffDetails);

}
