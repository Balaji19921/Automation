package com.testng.concepts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
   @Test
  public void validation()
  {
	  System.out.println("Testing Started");
	  assertEquals("A","a");
	  System.out.println("Validaton completed");
	  System.out.println("Testing completed");
	  
  }
  
   @Test
  public void validation1()
  {  
	  SoftAssert soft = new SoftAssert();
	  System.out.println("Testing started");
	  soft.assertEquals("A","a");
	  System.out.println("Validation started");
	  System.out.println("Testing completed");
	  soft.assertAll();
  }
}
