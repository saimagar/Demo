package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.MembershipPage;

public class MembershipTest {

	WebDriver driver = null;

	@BeforeSuite
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Selenium%20Software/Offline%20Website/index.html");

	}

	@Test
	public void test01(){

		MembershipPage mp = new MembershipPage(driver);
		mp.Membership();
	}
}
