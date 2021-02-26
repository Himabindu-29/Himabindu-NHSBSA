package com.runner;

import org.openqa.selenium.WebDriver;

import com.driver.Action;
import com.pages.CircumstancePage;

public class BaseClass {
	public static WebDriver driver;
	public static CircumstancePage  circum=new CircumstancePage();
	public static Action action=new Action();
	public static String baseURL="https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
	

}
