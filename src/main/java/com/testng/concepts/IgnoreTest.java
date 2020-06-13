package com.testng.concepts;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

	@Test
	private void setup()
	{
		System.out.println("setup");
	}
	

	
	@Test
	public void browserLaunch()
	{
		  System.out.println("browser launch");
	}
	
	
    @Test
	public void verifyHomepage()
	{
		System.out.println("verify homepage");
		
	}
	
	@Test
	public void browserClose()
	{
		System.out.println("browser close");
	}
	
}

   

		