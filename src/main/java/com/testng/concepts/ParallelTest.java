package com.testng.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ParallelTest {

	public static WebDriver driver;
	
	@Test
	private void amazonTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BALAJI\\Downloads\\driver\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--incognito");
		opt.addArguments("--ignore-certificate-errors");
		opt.addArguments("chrome.switches", "--disable-extensions");
		opt.addArguments("--disable-notifications");
		opt.addArguments("enable-automation");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, opt);
		opt.merge(cap);
		driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.com");
	}
	
	@Test
	private void flipkartTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BALAJI\\Downloads\\driver\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--incognito");
		opt.addArguments("--ignore-certificate-errors");
		opt.addArguments("chrome.switches", "--disable-extensions");
		opt.addArguments("--disable-notifications");
		opt.addArguments("enable-automation");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, opt);
		opt.merge(cap);
		driver = new ChromeDriver(opt);
		driver.get("https://www.flipkart.com");
	}

}
