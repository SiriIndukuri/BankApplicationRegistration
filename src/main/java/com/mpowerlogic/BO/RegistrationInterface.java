package com.mpowerlogic.BO;
import org.springframework.stereotype.Service;

import com.mpowerlogic.Entity.RegisterationResponseEntity;
import com.mpowerlogic.Entity.RegistrationRequestEntity;

@Service
public interface RegistrationInterface {
	
	public abstract RegisterationResponseEntity memberRegister(RegistrationRequestEntity  reqentity);
	public abstract RegisterationResponseEntity modifyRegiser();
	public abstract RegisterationResponseEntity  deleteRegistration();
	public abstract RegisterationResponseEntity  getRegistrationDetails();
	
	 
	

}
