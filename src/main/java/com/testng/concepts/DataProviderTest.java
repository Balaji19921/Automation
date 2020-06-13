package com.testng.concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="MyDataProvider")
	public void login(String username,String password)
	{
		
		System.out.println("Username:"+ username);
		System.out.println("Password:"+ password);
	}
	
	
	
    @DataProvider(name="MyDataProvider")
   
    private Object[][] loginData(){
    
    		return new Object[][]
    		{
    			{"aaa","1111"},
    			{"bbb","2222"},
    			{"ccc","3333"},
    			
    		};
    }
}
    		
    
    
   
    	
   
    
    
    
    
    
    
    
    
    
    
    
