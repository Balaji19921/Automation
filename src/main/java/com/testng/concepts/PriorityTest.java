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

public class PriorityTest {
	
	@Test(priority=-1)
	private void zsetup()
	{
		System.out.println("setup");
	}
	
	@Test
	public void browserLaunch()
	{
		  System.out.println("browser launch");
	}
	
	@Test
	public void enterUrl()
	{
		System.out.println("enter url");
	}
	
	@Test
	public void signIn()
	{
		System.out.println("sign in");
	}
	
	
	@Test(priority=1)
	public void mobileSearch()
	{
		System.out.println("Mobile search");
		
	}
	
	@Test
	public void logOut()
	{
		System.out.println("logout");
		
		
	}
	
	@Test(priority=2)
	public void verifyHomepage()
	{
		System.out.println("verify homepage");
		
	}
	
	@Test
	public void browserClose()
	{
		System.out.println("browser close");
	}
	
	@Test(priority=3)
	public void deleteCookies()
	{
		System.out.println("Delete Cookies");
	}
	
	}
	
	


