package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MembershipPage {
	
	WebDriver driver = null;
	
	public MembershipPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Register a new membership")
	WebElement login;
	
	public void Membership() {
		login.click();
	}
}
