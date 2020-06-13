package com.retryanalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;
;

public class SampleTest {
	
	@Test(retryAnalyzer = MyRetry.class)
	private void usernameValidation()
	{
		
		System.out.println("ValidationStarted");
		Assert.assertEquals("Arun","Arunkumar");
		
	}
	
	@Test
	
	private void homePageValidation()
	{
		System.out.println("HomePage Validation");
		Assert.assertEquals("balaji","Arun");
	}
	
}