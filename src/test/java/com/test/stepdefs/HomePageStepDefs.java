package com.test.stepdefs;

import com.test.pages.HomePage;

import io.cucumber.java.en.Given;

public class HomePageStepDefs {
	
	
	
	
	private HomePage homePage = new HomePage();
	
	
	@Given("click On CustomerTab")
	public void click_On_CustomerTab() {
		//homePage.clickOn_CustomerTab();
		homePage.clickCustomerTab();
	}
	
	
	
	

	

	
}
