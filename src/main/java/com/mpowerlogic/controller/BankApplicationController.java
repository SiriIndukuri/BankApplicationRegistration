package com.mpowerlogic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mpowerlogic.BO.RegistrationInterface;
import com.mpowerlogic.Entity.RegisterationResponseEntity;
import com.mpowerlogic.Entity.RegistrationRequestEntity;

@RestController
public class BankApplicationController {

	
	@Autowired
	public RegistrationInterface regint;
	
	
	@RequestMapping("/memberRegister") 
	public RegisterationResponseEntity memberRegisteration(@RequestBody RegistrationRequestEntity reqentity ) {
		System.out.println("from controller");
		regint.memberRegister(reqentity);
		
		
		return null;
	}
	
	  @GetMapping("/test1")
	  public String demo_method1() {
		  return "hello";
	  }
	

}
