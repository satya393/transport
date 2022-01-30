package com.bus.controller;

//import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bus.constants.Response;
import com.bus.model.StaffDetails;
import com.bus.model.UserDetails;
import com.bus.service.StaffDetailsService;

@RestController
@RequestMapping(value = "/staffDetails")
public class StaffDetailsController {

	@Autowired
	StaffDetailsService staffdetailsservice;

	@GetMapping(value = "/get_staffDetails")
	public List<StaffDetails> getStaffDetails() {
		return staffdetailsservice.getStaffDetails();
	}

	@PostMapping(value = "/insert")
	public StaffDetails saveStaffDetails(@RequestBody StaffDetails staffDetails) {
		return staffdetailsservice.saveStaffDetails(staffDetails);
	}

	@PostMapping(value = "staff_sign_in")
	public Response saveSign_in_StaffDetails(@RequestBody StaffDetails staffDetails) {
		return staffdetailsservice.saveSign_in_StaffDetails(staffDetails);

	}

}
