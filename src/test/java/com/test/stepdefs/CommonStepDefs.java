package com.test.stepdefs;

import org.testng.Assert;

import com.test.baseclass.BaseClass;
import com.test.pages.CommonPage;

import io.cucumber.java.en.Given;

public class CommonStepDefs {
	
	private CommonPage commonPage=new CommonPage();
	private BaseClass baseClass=new BaseClass();
	
	
	@Given("scroll Down To Pixel {int}")
	public void scroll_Down_To_Pixel(Integer int1) {
		boolean flag=commonPage.scrollDownToPixel(int1);
		Assert.assertTrue(flag,"Unable to scroll down ");
	}
	@Given("click on opportunities tab")
	public void click_on_opportunities_tab() {
		boolean flag=commonPage.clickOnOpportunities_Tab();
		Assert.assertTrue(flag,"Unable to click on Opportunities Tab");
	}
	@Given("click On Task Tab")
	public void click_On_Task_Tab() {
		boolean flag=commonPage.clickOnOpportunities_Tab();
		Assert.assertTrue(flag,"Unable to click on Task Tab");
	}
	@Given("click On NoteTab")
	public void click_On_NoteTab() {
		boolean flag=commonPage.clickOnNoteTab();
		Assert.assertTrue(flag,"Unable to click on Note Tab");
	}
	@Given("click On New Button")
	public void click_On_New_Button() {
		
		commonPage.clickOn_NewButton();
	}
	
	@Given("switch To ChildWindow")
	public void switch_To_ChildWindow() {
	    
		baseClass.switchToChildWindow();
		
	}
	
}
