package com.automatio.runner;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.automation.pom.AddtoCart;
import com.automation.pom.HomePage;
import com.automation.pom.SignInPage;
import com.automationselenium.baseclass.Baseclass_new;

public class Runner extends Baseclass_new {
	public static WebDriver driver;

	//public static void main(String[] args) throws Exception {
	
	@Test
	public void test() throws Exception {

		driver = getBrowser("chrome");
		driver.get("http://automationpractice.com");

		HomePage hp = new HomePage(driver);
		clickonWebelement(hp.getSignInLink());

		SignInPage sp = new SignInPage(driver);
		inputValuestoWebelement(sp.getEmailField(), "aaaaaa@gmail.com");
		inputValuestoWebelement(sp.getPasswordField(), "12345");
		clickonWebelement(sp.getSignInBtn());

		AddtoCart at = new AddtoCart(driver);
		mouseHoverToElement(at.getWomen());
		clickonWebelement(at.getTshirts());
		mouseHoverToElement(at.getQview());
		clickonWebelement(at.getAdtocart());
		mouseHoverToElement(at.getProceedtochkout());
		clickonWebelement(at.getProceedtochkout());
		mouseHoverToElement(at.getProceedtochkout2());
		clickonWebelement(at.getProceedtochkout2());
		mouseHoverToElement(at.getProceedtochkout3());
		clickonWebelement(at.getProceedtochkout3());
		clickonWebelement(at.getAgreebtn());
		mouseHoverToElement(at.getProceedtochkout4());
		clickonWebelement(at.getProceedtochkout4());
		mouseHoverToElement(at.getPaybychk());
		clickonWebelement(at.getPaybychk());
		mouseHoverToElement(at.getConfirmorder());
		clickonWebelement(at.getConfirmorder());
		mouseHoverToElement(at.getLogout());
		clickonWebelement(at.getLogout());

	}

}
