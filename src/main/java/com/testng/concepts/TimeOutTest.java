package com.testng.concepts;

import org.testng.annotations.Test;

public class TimeOutTest {

	@Test
	public void mobileSearch()
	{
		System.out.println("Mobile search");
		
	}
	
	@Test(timeOut = 4000)
	public void laptopSearch() throws InterruptedException
	{
		System.out.println("Laptop search");
		Thread.sleep(6000);
		System.out.println("Latop search completed");
		
	}
	
	@Test
	public void tvSearch()
	{
		System.out.println("TV search");
	}
}
