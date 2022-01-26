package com.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.model.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

	UserDetails findByUserEmail(String userEmail);

	UserDetails findByUserPhoneNumber(String userPhoneNumber);

}
