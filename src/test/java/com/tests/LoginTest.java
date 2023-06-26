package com.tests;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashBoardPage;

import com.pages.LoginPage;
import com.pages.UserPage;

public class LoginTest {

	WebDriver driver = null;
	DashBoardPage dp = null;
	UserPage up = null;

	@BeforeSuite
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Selenium%20Software/Offline%20Website/index.html");
        dp = new DashBoardPage(driver);
		up = new UserPage(driver);
	}

	@Test(priority = 1)
	public void test01() {

		LoginPage obj = new LoginPage(driver);
		obj.validLogin();
             
	}

	@Test(priority = 2)
	public void test02() {

		ArrayList<String> expectedCourses = new ArrayList<String>();
		expectedCourses.add("Selenium");
		expectedCourses.add("Java / J2EE");
		expectedCourses.add("Python");
		expectedCourses.add("Php");

		ArrayList<String> actualCourses = dp.VerifyCourses();
		Assert.assertEquals(actualCourses, expectedCourses);

	}
	
	@Test(priority = 3)
	public void test03() {
		
      dp.ClickUser();
      up.UserPageData();
       
	}
}
