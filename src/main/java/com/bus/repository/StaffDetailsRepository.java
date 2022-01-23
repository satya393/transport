package com.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.model.StaffDetails;

@Repository
public interface StaffDetailsRepository extends JpaRepository<StaffDetails, Integer>{

}
