package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public static WebDriver driver;

	public SignInPage(WebDriver ldriver) {
		this.driver= ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement EmailField;
	
	@FindBy(id = "passwd")
	private WebElement PasswordField;

	@FindBy(id = "SubmitLogin")
	private WebElement SignInBtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailField() {
		return EmailField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getSignInBtn() {
		return SignInBtn;
	}
	

}


