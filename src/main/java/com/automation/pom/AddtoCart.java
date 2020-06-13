package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='sf-with-ul']")
	private WebElement women;

	@FindBy(xpath = "//a[text()='T-shirts']")
	private WebElement tshirts;

	@FindBy(xpath = "//li[contains(@class,'ajax_block_product ')]")
	private WebElement qview;

	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement adtocart;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedtochkout;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceedtochkout2;

	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement proceedtochkout3;

	@FindBy(id = "uniform-cgv")
	private WebElement agreebtn;

	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement proceedtochkout4;

	@FindBy(xpath = "(//div[@class='col-xs-12 col-md-6'])[2]")
	private WebElement paybychk;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirmorder;

	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;

	public AddtoCart(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirts() {
		return tshirts;
	}

	public WebElement getProceedtochkout() {
		return proceedtochkout;
	}

	public WebElement getQview() {
		return qview;
	}

	public WebElement getAdtocart() {
		return adtocart;
	}

	public WebElement getProceedtochkout2() {
		return proceedtochkout2;
	}

	
	public WebElement getProceedtochkout3() {
		return proceedtochkout3;
	}

	public WebElement getAgreebtn() {
		return agreebtn;
	}

	public WebElement getProceedtochkout4() {
		return proceedtochkout4;
	}

	public WebElement getPaybychk() {
		return paybychk;
	}

	public WebElement getConfirmorder() {
		return confirmorder;
	}

	public WebElement getLogout() {
		return logout;
	}
}
