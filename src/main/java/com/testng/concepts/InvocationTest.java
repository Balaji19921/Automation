package com.testng.concepts;

import org.testng.annotations.Test;

public class InvocationTest {

	@Test(invocationCount=5)
	public void browserLaunch()
	{
		  System.out.println("browser launch");
	}
	
	@Test
	public void enterUrl()
	{
		System.out.println("enter url");
	}

	
	@Test(invocationCount=5)
	public void signIn()
	{
		System.out.println("sign in");
	}
	
	@Test
	public void mobileSearch()
	{
		System.out.println("Mobile search");
		
	}
}

