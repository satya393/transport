package com.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.model.StaffDetails;
import com.bus.repository.StaffDetailsRepository;

@RestController
@RequestMapping("/staffDetails")
public class StaffDetailsController {

	@Autowired
	StaffDetailsRepository staffDetailsRepository;

	@PostMapping(value = "/insert")
	public StaffDetails saveStaffDetails(@RequestBody StaffDetails staffDetails) {
		return staffDetailsRepository.save(staffDetails);
	}

}
