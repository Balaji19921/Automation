package com.automationtesting;

import org.openqa.selenium.WebDriver;
import com.automationselenium.baseclass.BaseClass;
import com.automationselenium.pom.HomePage;
import com.automationselenium.pom.OrderPage;
import com.automationselenium.pom.SignInPage;

public class automationtesting extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) {
		{

			browserLaunch("chrome");
			getUrl("http://automationpractice.com/index.php");
			HomePage hp = new HomePage(driver);
			clickonWebElement(hp.getSignIn());

			SignInPage sp = new SignInPage(driver);
			InputValues(sp.getEmail(), "balaji.gurumoorthi@gmail.com");
			InputValues(sp.getPasswd(), "12345");
			clickonWebElement(sp.getSubmit());

			OrderPage op = new OrderPage();
			clickonWebElement(op.getAddcheckout());
			clickonWebElement(op.getTerms());
			clickonWebElement(op.getShipcheckout());
			ScrollDown(driver);
			// mouseHoverToElement();;
			clickonWebElement(op.getPayment());
			clickonWebElement(op.getOrderconfirm());
			clickonWebElement(op.getOrderpage());

		}
	}

}
