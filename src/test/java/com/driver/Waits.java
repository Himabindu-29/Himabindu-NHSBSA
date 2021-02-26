package com.driver;

import java.util.concurrent.TimeUnit;

import com.runner.BaseClass;

public class Waits extends BaseClass{
	public void impicitWait() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
