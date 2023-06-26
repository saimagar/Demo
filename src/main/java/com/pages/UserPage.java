package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	WebDriver driver = null;

	public UserPage(WebDriver driver) {
		this.driver = driver;

	}

	public List<WebElement> UserPageData() {

		List<WebElement> rows_list = driver.findElements(By.tagName("tr"));

		for (int i = 1; i < rows_list.size(); i++) {

			List<WebElement> col_list = rows_list.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < 8; j++) {
				System.out.print(col_list.get(j).getText() + "\t");
			}

			System.out.println("=============");

		}

		return rows_list;
	}

}
