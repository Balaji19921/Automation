package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	public WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id='search_query_top']")
			private WebElement dresses;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement search;
	
	@FindBy(xpath = "//div[@class='product-container']")
	private WebElement addtocart;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
	private WebElement contnushopping;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[2]/span")
	private WebElement more;
	
	@FindBy(xpath = "//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")
	private WebElement quantity;
	
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
	private WebElement addtocart1;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedchkout;
	
	@FindBy(xpath = "(//a[contains(@class,'button ')])[3]")
	private WebElement proceedchkout1;
	
	public Search(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getContnushopping() {
		return contnushopping;
	}

	public WebElement getMore() {
		return more;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getAddtocart1() {
		return addtocart1;
	}

	public WebElement getProceedchkout() {
		return proceedchkout;
	}

	public WebElement getProceedchkout1() {
		return proceedchkout1;
	}

	
}
