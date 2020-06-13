package com.testng.concepts;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void divide()
	{
		int n=1;
		System.out.println(10/0);
	}

}
