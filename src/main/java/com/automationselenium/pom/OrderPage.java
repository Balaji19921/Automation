package com.automationselenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage {


	@FindBy(xpath ="//*[@id='center_column']/form/p/button")
	private WebElement addcheckout;
	

	
	@FindBy(xpath ="//input[@type='checkbox']")
	private WebElement terms;



	@FindBy(xpath ="//*[@id='form']/p/button")
    private WebElement shipcheckout;




	@FindBy(xpath ="//*[@id='HOOK_PAYMENT']/div[2]/div/p/a")
	private WebElement payment;
	
	
	
	@FindBy(xpath ="//*[@id='cart_navigation']/button")
	private WebElement orderconfirm;

	
	public WebElement getOrderconfirm() {
		return orderconfirm;
	}



	public WebElement getOrderpage() {
		return orderpage;
	}


	@FindBy(xpath = "//*[@id='center_column']/p/a")
    private WebElement orderpage;
	
	
	public WebElement getPayment() {
		return payment;
	}



	public WebElement getAddcheckout() {
		return addcheckout;
	}



	public WebElement getTerms() {
		return terms;
	}
	

	public WebElement getShipcheckout() {
		return shipcheckout;
	}
	
}