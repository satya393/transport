package com.bus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "officeDetails")
public class OfficeDetails {
	
	@Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
	public Integer OfficeId;
	public Integer Office_id_card;
	public String officeBranch;
	public String officeAddress;
	public String office_phone_number;
	
	public Integer getOfficeId() {
		return OfficeId;
	}
	public void setOfficeId(Integer officeId) {
		OfficeId = officeId;
	}
	public Integer getOffice_id_card() {
		return Office_id_card;
	}
	public void setOffice_id_card(Integer office_id_card) {
		Office_id_card = office_id_card;
	}
	public String getOfficeBranch() {
		return officeBranch;
	}
	public void setOfficeBranch(String officeBranch) {
		this.officeBranch = officeBranch;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getOffice_phone_number() {
		return office_phone_number;
	}
	public void setOffice_phone_number(String office_phone_number) {
		this.office_phone_number = office_phone_number;
	}
	
	

}
