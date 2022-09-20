package com.greatlearning.service;

import java.util.Random;
import com.greatlearning.model.Employee;


public class CredentialServiceimpl implements CredentialService {

	
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters ="abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_+";
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		// TODO Auto-generated method stub
				
		Random random= new Random();
		char[]password = new char[8];
		
		for(int i=0; i<8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return firstName+lastName+"@"+department+"xyz.com";
	}

	
	public void showCredentials(Employee employee, String email, char[] generatePassword) {
		// TODO Auto-generated method stub
		System.out.println("Dear "+ employee.getFirstName() +" Your generted credentials are as follows ");
		System.out.println("Email :-" +email);
		System.out.println("Password :-" +generatePassword.toString());
	}


	@Override
	public String generateEmailAddress(String firstName, String department) {
		// TODO Auto-generated method stub
		return null;
	}

}
