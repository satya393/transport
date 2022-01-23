package com.bus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staffDetails")
public class StaffDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer staffId;
	public String StaffIdCard;
	public String StaffName;
	public Integer StaffNumber;
	public String StaffAddress;
	public String StaffStatus;

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffIdCard() {
		return StaffIdCard;
	}

	public void setStaffIdCard(String staffIdCard) {
		StaffIdCard = staffIdCard;
	}

	public String getStaffName() {
		return StaffName;
	}

	public void setStaffName(String staffName) {
		StaffName = staffName;
	}

	public Integer getStaffNumber() {
		return StaffNumber;
	}

	public void setStaffNumber(Integer staffNumber) {
		StaffNumber = staffNumber;
	}

	public String getStaffAddress() {
		return StaffAddress;
	}

	public void setStaffAddress(String staffAddress) {
		StaffAddress = staffAddress;
	}

	public String getStaffStatus() {
		return StaffStatus;
	}

	public void setStaffStatus(String staffStatus) {
		StaffStatus = staffStatus;
	}

}
