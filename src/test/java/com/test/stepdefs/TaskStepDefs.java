package com.test.stepdefs;

import org.testng.Assert;

import com.test.baseclass.BaseClass;
import com.test.pages.CommonPage;
import com.test.pages.TaskPage;
import com.test.utility.ExcelFactory;

import io.cucumber.java.en.Given;

public class TaskStepDefs {
	
	private ExcelFactory excel=new ExcelFactory();
	private CommonPage commonPage=new CommonPage();
	private BaseClass baseClass=new BaseClass();
	private TaskPage task=new TaskPage();
	
	@Given("click on save button")
	public void click_on_save_button() {
	    
	    boolean flag=task.clickOnSaveButton();
	    Assert.assertTrue(flag,"Unable to click on save button");
	}
	@Given("select available program {string}")
	public void select_available_program(String string) {
		boolean flag=task.selectProgram(excel.getExcelRowData("TestData", string)[4]);
		Assert.assertTrue(flag,"Unable to select program type");
	}
	@Given("enter task subject {string} {string}")
	public void enter_task_subject(String sheetName,String testCaseId)  {
		boolean flag=task.enterTaskSubject(excel.getExcelRowData(sheetName, testCaseId)[3]);
		Assert.assertTrue(flag,"Unable to enter subject of Task");
	}
	@Given("click on Next Button")
	public void click_on_Next_Button() {
		
		boolean flag=task.clickOnNextButton();
		Assert.assertTrue(flag,"Unable to click on Next Button");
		
	}
	@Given("click On New Task")
	public void click_On_New_Task() {
		
		boolean flag=task.clickOnNewTaskButton();
		Assert.assertTrue(flag,"Unable to click on New tsk Button");
	}
	
	
}
