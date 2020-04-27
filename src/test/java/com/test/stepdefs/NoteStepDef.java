package com.test.stepdefs;

import org.testng.Assert;

import com.test.baseclass.BaseClass;
import com.test.pages.CommonPage;
import com.test.pages.NotePage;
import com.test.utility.ExcelFactory;

import io.cucumber.java.en.Given;

public class NoteStepDef {
	
	private NotePage notePage=new NotePage();
	private BaseClass baseClass=new BaseClass();
	private ExcelFactory excel=new ExcelFactory();
	
	@Given("click on done button")
	public void click_on_done_button() {
		boolean flag=notePage.clickOnDoneButton();
	    Assert.assertTrue(flag,"Unable to click on done Button");
	}
	@Given("click on Add to record button")
	public void click_on_Add_to_record_button() {
	    boolean flag=notePage.clickOnAddRecordButton();
	    Assert.assertTrue(flag,"Unable to click on Add Record Button");
	}
	@Given("enter note description {string}")
	public void enter_note_description(String string) {
		boolean flag=notePage.enterNoteDescription(excel.getExcelRowData("TestData", string)[4]);
		Assert.assertTrue(flag,"Unable to enter Note subject");
	}
	
	@Given("enter subject of Note {string}")
	public void enter_subject_of_Note(String string) {
		boolean flag=notePage.enterSubjectOfNote(excel.getExcelRowData("TestData", string)[3]);
		Assert.assertTrue(flag,"Unable to enter Note Description");
	}

	
}
