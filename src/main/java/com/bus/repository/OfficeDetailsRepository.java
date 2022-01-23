package com.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.model.OfficeDetails;

@Repository
public interface OfficeDetailsRepository extends JpaRepository<OfficeDetails, Integer>{
	
	

}
