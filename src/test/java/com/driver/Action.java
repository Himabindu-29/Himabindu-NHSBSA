package com.driver;

import org.openqa.selenium.By;
import com.runner.BaseClass;


public class Action extends BaseClass{
	public void clickOnButton(By element) {
		driver.findElement(element).click();
	}
	
	public void inputText(By element, String value) {
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(value);
	}
	public void radioBtn(By element,String value) {
		String y="yes";
		
		if (value!=y) {
			driver.findElement(element).click();
			
			
		}
		else {
			
			driver.findElement(By.cssSelector("label[for='radio-no']")).click();
			}
	}


}
