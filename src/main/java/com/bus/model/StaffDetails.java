package com.bus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
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

}
