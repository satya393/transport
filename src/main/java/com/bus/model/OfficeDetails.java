package com.bus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Data
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
	
}
