package com.automationselenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
	
	public static WebDriver driver;
		

			@FindBy(xpath="//a[@class='login']")
			
			private WebElement SignIn;
			
			public  HomePage(WebDriver ldriver)
		
			{
				this.driver=ldriver;
				PageFactory.initElements(driver, this);
				
			}

			public WebElement getSignIn() {
			
				return SignIn;
			}

			
			
			
			
					
			
			
			
	}
	
	

