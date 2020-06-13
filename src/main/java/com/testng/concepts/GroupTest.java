package com.testng.concepts;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups="Selenium Test")
	private void SeleniumTest1()
	{
		System.out.println("SeleniumTest1");
	}
	
	@Test(groups="Selenium Test")
	public void SeleniumTest2()
	{
		  System.out.println("SeleniumTest2");
	}
	
	@Test(groups="Selenium Test")
	public void SeleniumTest3()
	{
		System.out.println("SeleniumTest3");
	}
	
	@Test(groups="API Test")
	public void APITest1()
	{
		System.out.println("APITest1");
	}
	
	
	@Test(groups="APT Test")
	public void APITest2()
	{
		System.out.println("APITest2");
		
	}
	
	@Test(groups="Apium Test")
	public void ApiumTest1()
	{
		System.out.println("ApiumTest1");
		
		
	}
	
	@Test(groups="Apium Test")
	public void ApiumTest2()
	{
		System.out.println("ApiumTest2");
		
	}
	

	

}
