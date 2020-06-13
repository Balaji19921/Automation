package com.testng.concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	private void setup()
	{
		System.out.println("setup");
	}
	

	
	@BeforeTest
	public void browserLaunch()
	{
		  System.out.println("browser launch");
	}
	
	@BeforeClass
	public void enterUrl()
	{
		System.out.println("enter url");
	}
	
	@BeforeMethod
	public void signIn()
	{
		System.out.println("sign in");
	}
	
	
	@Test
	public void mobileSearch()
	{
		System.out.println("Mobile search");
		
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("logout");
		
		
	}
	
	@AfterClass
	
	public void verifyHomepage()
	{
		System.out.println("verify homepage");
		
	}
	
	@AfterTest
	public void browserClose()
	{
		System.out.println("browser close");
	}
	
	@AfterSuite
	public void deleteCookies()
	{
		System.out.println("Delete Cookies");
	}
	
	}
	
	
 

   



