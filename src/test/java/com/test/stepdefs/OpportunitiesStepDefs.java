package com.test.stepdefs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.test.baseclass.BaseClass;
import com.test.pages.CommonPage;
import com.test.pages.Opportunities;
import com.test.utility.ExcelFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpportunitiesStepDefs extends BaseClass{
	
	private CommonPage commonPage=new CommonPage();
	private BaseClass baseClass=new BaseClass();
	private Opportunities oppty=new Opportunities();
	private ExcelFactory excelFactory=new ExcelFactory();
	
	
	@Given("provide top competitor")
	public void provide_top_competitor() {
		oppty.provideTopCompetitor();
	}

	@Given("click on build Rapport stage")
	public void click_on_build_Rapport_stage() {
		oppty.clickOn_BuildRapport();
	}

	@Given("click on Mark stage as complete")
	public void click_on_Mark_stage_as_complete() {
		oppty.clickOnMarksAsCOmplete();
	}

	@Given("click on existing opportunities {string} {string}")
	public void click_on_existing_opportunities(String sheetName, String testCaseID) {
		String data[]=excelFactory.getExcelRowData(sheetName, testCaseID);
		boolean flag = oppty.clickOnExistingOppty(data[3]);
		Assert.assertTrue(flag,"Unable to click on existing Opportynity");
	}
	
	@Given("click on Edit button")
	public void click_on_Edit_button() {
		boolean flag = oppty.clickOnEdit_Button();
		Assert.assertTrue(flag,"Unable to click on Edit button");
	}

	@Given("change opportunities stage {string} {string}")
	public void change_opportunities_stage(String sheetName, String testCaseID) {
		
		String data[]=excelFactory.getExcelRowData(sheetName, testCaseID);
		System.out.println("data[4] "+data[4]);
		oppty.scrollDownToPixel(300);
		boolean flag = oppty.selectStageFromDropDown(data[4]);
		Assert.assertTrue(flag,"Unable chnage status of oopty");
	}
	
	@Given("select close date for opportunities")
	public void select_close_date_for_opportunities() {
		boolean flag = oppty.selectCloseDateForOpportunities();
	    Assert.assertTrue(flag,"Unable to select Opportynity record type");
	}

	@Then("validate Created opportunity")
	public void validate_Created_opportunity() {
		boolean flag = oppty.validateCreatedOpportunities("TestAOpp");
	    Assert.assertTrue(flag,"Unable to select Opportynity record type");
	}
	@Given("populate data to create opportunity {string} {string}")
	public void populate_data_to_create_opportunity(String sheetName, String testCaseID) {
		String data[]=excelFactory.getExcelRowData(sheetName, testCaseID);
		oppty.populateDataToCreateOpportunities(data[3], data[4], data[5], data[6]);
	    //Assert.assertTrue(flag,"Unable to click on next button");
	}
	
	
	@Given("click on next button")
	public void click_on_next_button() {
		boolean flag = oppty.clickOn_NextButton();
	    Assert.assertTrue(flag,"Unable to click on next button");
	}
	@Given("select opportunity record type")
	public void select_opportunity_record_type() {
		boolean flag = oppty.selectOpportunityRecordType();
	    Assert.assertTrue(flag,"Unable to select Opportynity record type");
	}

	@When("I click on Mark stage as complete")
	public void i_click_on_Mark_stage_as_complete() {
		clickElementJavaScript(oppty.btn_marksComplete);
		((JavascriptExecutor)driver).executeScript("setTimeout(function(){debugger;}, 3000)");
	}

	@Then("I should see success message displayed")
	public void i_should_see_success_message_displayed() {
		Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(oppty.btn_markStageCompleted)).isDisplayed(),
				"Success message displayed");
	}	
}
