package com.test.stepdefs;

import org.testng.Assert;

import com.test.baseclass.BaseClass;
import com.test.context.Context;
import com.test.pages.CommonPage;
import com.test.pages.CustomerPage;
import com.test.pages.HomePage;
import com.test.utility.ExcelFactory;
import com.test.utility.GetUserData;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CustomerStepDefs {
	
	
	
	
	private CustomerPage custPage = new CustomerPage();
	private CommonPage commonPage = new CommonPage();
	private BaseClass baseClass = new BaseClass();
	private ExcelFactory excel=new ExcelFactory();
	
	
	
	@Given("click on save button for new Owner")
	public void click_on_save_button_for_new_Owner() {
		boolean flag = custPage.clickOnSaveButtonOfNewOwner();
	    Assert.assertTrue(flag,"Unable to click on save button of new customer");
	}
	@Given("click on New Contact button")
	public void click_on_New_Contact_button() {
		boolean flag = custPage.clickOnNewContact_Button();
	    Assert.assertTrue(flag,"Unable to click on New Contact button");
	}

	@Given("enter last name of contact {string}")
	public void enter_last_name_of_contact(String string) {
		
		boolean flag =custPage.enterlastNameOfContact(excel.getExcelRowData("TestData", string)[3]);
		Assert.assertTrue(flag,"Unable to enter contact last name");
	}
	@Given("click on Reassign Prospect button")
	public void click_on_Reassign_Prospect_button() {
	    boolean flag = custPage.clickOnReassignProspect_Button();
	    Assert.assertTrue(flag,"Unable to click on Reassign prospect button");
	}

	@Given("enter new account owner name {string}")
	public void enter_new_account_owner_name(String string) {
		boolean flag = custPage.enterAccountOwnerName(excel.getExcelRowData("TestData", string)[3]);
		Assert.assertTrue(flag,"Unable to enter new Account owner name");
	}
	@Given("update account name {string}")
	public void update_account_name(String string) {
		boolean flag = custPage.updateAccountName(string);
	    Assert.assertTrue(flag,"Unable to update Account Name");
	}
	
	@Given("click on clone button")
	public void click_on_clone_button() {
	    boolean flag = custPage.clickOnCloneButton();
	    Assert.assertTrue(flag,"Unable to click on clone button");
	}
	
	@Given("enter Team Role {string}")
	public void enter_Team_Role(String string) {
		boolean flag = custPage.enterTeamRole(string);
	    Assert.assertTrue(flag,"Unable to enter team role");
	}
	
	@Given("enter team username {string}")
	public void enter_team_username(String string) {
		boolean flag = custPage.enterTeamUserName(string);
	    Assert.assertTrue(flag,"Unable to enter team username");
	}
	
	@Given("click on Add Team Member")
	public void click_on_Add_Team_Member() {
	    boolean flag = custPage.clickOnAddTeamMemberButton();
	    Assert.assertTrue(flag,"Unable to click on add team member button");
	}
	
	@Given("click on new event")
	public void click_on_new_event() {
		boolean flag=custPage.clickOnEventTab();
		Assert.assertTrue(flag,"Unable to click on Event tab");
	}

	@Given("enter event subject {string}")
	public void enter_event_subject(String string) {
		boolean flag=custPage.enterEventSubject(excel.getExcelRowData("TestData", string)[3]);
		Assert.assertTrue(flag,"Unable to enter Event subject");
	}
	@Given("click On New Button under note section")
	public void click_On_New_Button_under_note_section() {
		boolean flag=custPage.clickOnNewButtonUnderNote();
	    Assert.assertTrue(flag,"Unable ot click on New Button under Note section");
	}
	@Given("click on related tab")
	public void click_on_related_tab() {
	    boolean flag=custPage.clickOnRelatedTab();
	    Assert.assertTrue(flag,"Unable ot click on Related Tab");
	}
	@Given("click on existing customer")
	public void click_on_existing_customer() {
		custPage.clickOnExistingCustomer();
	}
	@Given("Enter subject text field")
	public void enter_subject_text_field() {
	    custPage.enterSubject();
	}
	@Given("click on New Event Activity")
	public void click_on_New_Event_Activity() {
		custPage.tapOnNewEventActivity();
	}
	@Given("click on Existing Customer")
	public void click_on_Existing_Customer() {
		custPage.clickOnExistingCustomer();
	}
	@Then("validate Created Prospect")
	public void validate_Created_Prospect() {
		Assert.assertTrue(custPage.validateCreatedProspect(),"Unable to validate created customer");
		
	}
	
	@Given("click On Save Button")
	public void click_On_Save_Button() {
		commonPage.clickOnSaveButton();
	}

	@Given("switch To Parent Window")
	public void switch_To_Parent_Window() {
		baseClass.switchToParentWindow();
	}

	
	
	@Given("populate Required Field To Create Prospect {string}")
	public void populate_Required_Field_To_Create_Prospect(String string) {
		GetUserData.setAccountName(custPage.populateRequiredFieldToCreateProspect(string));
	}
	
	
	
	@Given("click On NextButton")
	public void click_On_NextButton() {
		custPage.clickOn_NextButton();
	}
	@Given("select Record Type  {string}")
	public void select_Record_Type(String string) {
		custPage.selectRecordType(string);
	}
	
	
	

	

	
}
