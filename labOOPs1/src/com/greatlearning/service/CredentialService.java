package com.greatlearning.service;

import com.greatlearning.model.Employee;


	public interface CredentialService {
	
	public char[] generatePassword();
	public String generateEmailAddress(String firstName,String department );
	public void showCredentials(Employee employee,String email,char[] generatePassword);

    }

