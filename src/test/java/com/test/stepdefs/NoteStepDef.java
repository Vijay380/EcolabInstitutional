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
	@Given("enter note description {string} {string}")
	public void enter_note_description(String sheetName,String testCaseId) {
		boolean flag=notePage.enterNoteDescription(excel.getExcelRowData(sheetName, testCaseId)[4]);
		Assert.assertTrue(flag,"Unable to enter Note subject");
	}
	
	@Given("enter subject of Note {string} {string}")
	public void enter_subject_of_Note(String sheetName,String testCaseId) {
		boolean flag=notePage.enterSubjectOfNote(excel.getExcelRowData(sheetName, testCaseId)[3]);
		Assert.assertTrue(flag,"Unable to enter Note Description");
	}

	
}
