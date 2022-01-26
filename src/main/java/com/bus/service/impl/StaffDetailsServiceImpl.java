package com.bus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.model.StaffDetails;
import com.bus.repository.StaffDetailsRepository;
import com.bus.service.StaffDetailsService;

@Service
public class StaffDetailsServiceImpl  implements StaffDetailsService{
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

}
