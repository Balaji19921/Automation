package com.testng.concepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@Parameters({"username","password"})
	@Test
	public void login(String username, String password) {
		
		System.out.println("Enter the login details");
		System.out.println("Username:" + username);
		System.out.println("Password:" + password);
	}

}
