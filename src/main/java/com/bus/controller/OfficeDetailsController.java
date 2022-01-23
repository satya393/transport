package com.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.model.OfficeDetails;
import com.bus.repository.OfficeDetailsRepository;

@RestController
@RequestMapping("/offic_details")
public class OfficeDetailsController {

	@Autowired
	OfficeDetailsRepository officeDetailsRepository;

	@PostMapping(value = "/insert")
	public OfficeDetails saveOfficeDetails(@RequestBody OfficeDetails officeDetails) {

		return officeDetailsRepository.save(officeDetails);

	}

}
