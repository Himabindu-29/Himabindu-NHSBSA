package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	public static By COOCKIE=By.cssSelector("#nhsuk-cookie-banner__link_accept_analytics");
	public static By START=By.cssSelector("#next-button");
		@Before
		public void start() {
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(baseURL);
			driver.manage().window().maximize();
			driver.navigate().refresh();
			action.clickOnButton(COOCKIE);
			action.clickOnButton(START);
			
		}

		@After
		public void close() {
			//driver.close();
		}

	}



