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
	public String staffIdCard;
	public String staffName;
	public Integer staffNumber;
	public String staffAddress;
	public Boolean staffStatus;
	public String staffEmail;

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffIdCard() {
		return staffIdCard;
	}

	public void setStaffIdCard(String staffIdCard) {
		this.staffIdCard = staffIdCard;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public Integer getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(Integer staffNumber) {
		this.staffNumber = staffNumber;
	}

	public String getStaffAddress() {
		return staffAddress;
	}

	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}

	public Boolean getStaffStatus() {
		return staffStatus;
	}

	public void setStaffStatus(Boolean staffStatus) {
		this.staffStatus = staffStatus;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	
	

}
