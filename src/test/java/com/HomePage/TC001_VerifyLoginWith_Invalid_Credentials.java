package com.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.UI_Actions.HomePage;

public class TC001_VerifyLoginWith_Invalid_Credentials {
	
	WebDriver driver;
	HomePage homepage;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "/Drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?");
	}
	
	@Test
	public void verifyLoginWithInvalidCredentials() {
		homepage = new HomePage(driver);
		homepage.login("ravinder@test.com", "password123");
		Assert.assertEquals(homepage.getInvalidLoginText(), "Authentication failed.");
	}
	
	@AfterTest
	public void endTest() {
		
		driver.close();
		
	}

}
