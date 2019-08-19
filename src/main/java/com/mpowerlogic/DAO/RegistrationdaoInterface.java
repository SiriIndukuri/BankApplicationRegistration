package com.mpowerlogic.DAO;
import com.mpowerlogic.Entity.RegisterationResponseEntity;

public interface RegistrationdaoInterface {

	public abstract RegisterationResponseEntity memberRegister();
	public abstract RegisterationResponseEntity modifyRegiser();
	public abstract RegisterationResponseEntity  deleteRegistration();
	public abstract RegisterationResponseEntity  getRegistrationDetails();
	

}
