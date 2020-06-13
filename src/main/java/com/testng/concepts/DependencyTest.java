package com.testng.concepts;

import org.testng.annotations.Test;

public class DependencyTest {

	@Test(groups = "Launch")
	public void browserLaunch()
	{
		  System.out.println("browser launch");
	}
	
	@Test(groups = "Launch")
	public void enterUrl()
	{
		System.out.println("enter url");
	}

	
	@Test(dependsOnGroups = "Launch")
	public void signIn()
	{
		System.out.println("sign in");
	}
	
	@Test(dependsOnGroups = "Launch")
	public void mobileSearch()
	{
		System.out.println("Mobile search");
		
	}
}
