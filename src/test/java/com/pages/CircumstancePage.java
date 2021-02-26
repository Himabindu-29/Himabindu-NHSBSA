package com.pages;

import java.util.Map;

import org.openqa.selenium.By;

import com.runner.BaseClass;

public class CircumstancePage extends BaseClass{
	public static By WALES   =By.cssSelector("label[for='radio-wales']");
	public static By NXTBTN  =By.cssSelector("#next-button");
	public static By DAY     =By.cssSelector("#dob-day");
	public static By MONTH   =By.cssSelector("#dob-month");
	public static By YEAR    =By.cssSelector("#dob-year");
	public static By OPTION  =By.cssSelector("label[for='radio-yes']");
	public static By OPTION1 =By.cssSelector("[for='yes-universal']");
	
		
	public void chooseWale() throws InterruptedException {
		Thread.sleep(3000);
		action.clickOnButton(WALES);
		Thread.sleep(3000);
		action.clickOnButton(NXTBTN);
	}
	
	public void enterDOBDetails(Map<String,String> detailsMap) throws InterruptedException
	{
		
		action.inputText(DAY,detailsMap.get("day") );
		Thread.sleep(3000);
		action.inputText(MONTH,detailsMap.get("month") );
		action.inputText(YEAR,detailsMap.get("year") );
		action.clickOnButton(NXTBTN);
	}
	public void liveWithPartner(Map<String,String> detailsMap) {
		action.radioBtn(OPTION, detailsMap.get("live with partner"));
		action.clickOnButton(NXTBTN);
	}
	public void claimForBenifits(Map<String,String> detailsMap) {
		action.radioBtn(OPTION, detailsMap.get("tax credits"));
		action.clickOnButton(NXTBTN);
		
	}
	public void getUnversalCredit(Map<String,String> detailsMap) {
		action.radioBtn(OPTION1, detailsMap.get("get universal credit"));
		action.clickOnButton(NXTBTN);
		
		
	}
	public void jointUniversalCredit(Map<String,String> detailsMap) {
		action.radioBtn(OPTION, detailsMap.get("joint universal credit"));
		action.clickOnButton(NXTBTN);
		
	}
	public void combinedTakeHomePay(Map<String,String> detailsMap) {
		action.radioBtn(OPTION, detailsMap.get("homepay of £935 or less"));
		action.clickOnButton(NXTBTN);
	}
	
	

}
