package com.bus.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.model.UserDetails;
import com.bus.repository.UserDetailsRepository;
import com.bus.service.UserDetailsService;

import sun.security.util.Length;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	UserDetailsRepository userdetailsrepository ;

	
	
	@Override
	public List<UserDetails> getUserDetails() {
		return userdetailsrepository.findAll();
	}

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails){
		UserDetails UserEmailObj=userdetailsrepository.findByuserEmail(userDetails.getUserEmail());
		UserDetails UserNumberObj=userdetailsrepository.findByuserNumber(userDetails.getUserNumber());
	//	if(userDetails.getUserName().isEmpty()&&(userDetails.getUserName()!=null)){
			if((UserNumberObj==null)&&(UserEmailObj==null)|| (UserNewNumber!= null)){
				userDetails.setUserNumber(userDetails.getUserNumber());
				if (UserNumberObj Length == 0) {
					
					UserDetails UserDetailsDb=userdetailsrepository.save(userDetails);
					
				}else {
					//throws IOException("This phone number is allready exist");
				}
				
			}else 
			{
				//throws IOException("username usernumber are manditory");
			
			}
	//	}
			
		UserDetails UserDetailsDb=userdetailsrepository.save(userDetails);
		
		
		return userdetailsrepository.save(UserDetailsDb);
	}

	

	
	

	
	
	
	
	

}
