package com.mpowerlogic.BOImpl;

import org.springframework.stereotype.Service;

import com.mpowerlogic.BO.RegistrationInterface;
import com.mpowerlogic.Entity.RegisterationResponseEntity;
import com.mpowerlogic.Entity.RegistrationRequestEntity;

@Service
public class RegistrationIntBOIMPL implements RegistrationInterface{

	@Override
	public RegisterationResponseEntity memberRegister(RegistrationRequestEntity  reqentity) {
		// TODO Auto-generated method stub
		System.out.print("Inside  memberRegister method ");
		
		return null;
	}

	@Override
	public RegisterationResponseEntity modifyRegiser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegisterationResponseEntity deleteRegistration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegisterationResponseEntity getRegistrationDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
