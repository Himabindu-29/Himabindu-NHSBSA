package com.stepDefinition;

import java.util.Map;

import com.runner.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CircumstancePageSD extends BaseClass{
	
	@Given("^I am a person from Wales$")
	public void i_am_a_person_from_Wales() throws Throwable {
		circum.chooseWale();
	   
	}

	@When("^I put my circumstances into the Checker tool$")
	public void i_put_my_circumstances_into_the_Checker_tool(DataTable table) throws Throwable {
		Map<String, String> optionDetails = table.asMap(String.class,String.class);
		circum.enterDOBDetails(optionDetails);
		circum.liveWithPartner(optionDetails);
		circum.claimForBenifits(optionDetails);
		circum.getUnversalCredit(optionDetails);
		circum.jointUniversalCredit(optionDetails);
		circum.combinedTakeHomePay(optionDetails);
	    
	}

	@Then("^I should get a result of whether I will get help or not$")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not() throws Throwable {
		String actual=driver.getTitle();
		Assert.assertTrue(actual.contains("get help paying NHS costs"));
		
	   
	}


}
