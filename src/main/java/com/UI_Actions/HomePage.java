package com.UI_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	WebElement signIn;

	@FindBy(id = "email")
	WebElement emailAddress;

	@FindBy(xpath = "//*[@id='passwd']")
	WebElement password;

	@FindBy(xpath = "//*[@id='SubmitLogin']")
	WebElement submit;

	@FindBy(xpath = "//*[@id='center_column']/div[1]/ol/li")
	WebElement Authenticationfailed;
	
	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void login(String emailaddress, String passwords) {
		signIn.click();
		emailAddress.sendKeys(emailaddress);
		password.sendKeys(passwords);
		submit.click();
	}
public String getInvalidLoginText() {
	
	return Authenticationfailed.getText();
}
	
	
	
}


