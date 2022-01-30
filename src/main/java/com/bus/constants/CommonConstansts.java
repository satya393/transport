package com.bus.constants;

public interface CommonConstansts {

	public interface ResponseStatus {
		String SUCCESS = "Success";
		String FAIL = "Fail";
		String SERVERUNDERMAINTANENCE = "Sorry!! Server is under maintenance";
	}

	public interface UserDetails {
		String EMAIL_EXIST = "User Email already exists!!";
		String PHONE_EXIST = "User Phone Number already exist";
		String CLIENT_DELETED = "User Details Deleted Successfully";
		String CLIENT_NOTDELETED = "Oops!! Client Details Not Deleted";
		String USER_SAVED = "User Detais Saved Successfully!!";
		String USER_UPDATED = "User Detais Updated Successfully!!";
	}
	
	public interface StaffDetails {
		String EMAIL_EXIST = "User Email already exists!!";
		String EMPTY_EMAIL_EXIST = "Please Fill The Email Feald!!";
	}
	

}
