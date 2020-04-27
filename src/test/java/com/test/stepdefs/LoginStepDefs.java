package com.test.stepdefs;

import com.test.common.ComonActions;
import com.test.model.UserDataModel;
import com.test.pages.CustomerPage;
import com.test.pages.LoginPage;
import com.test.utility.ExcelFactory;
import com.test.utility.GetUserData;

import io.cucumber.java.en.Given;

public class LoginStepDefs {
	private ComonActions comonActions=new ComonActions();
	private GetUserData getUserData=new GetUserData();
	private LoginPage loginPage=new LoginPage(); 
	private CustomerPage custPage = new CustomerPage();
	private ExcelFactory excelFactory=new ExcelFactory();
	
	
	@Given("Login into App {string} {string}")
	public void login_into_App(String sheetName, String testCaseID) {
		System.out.println("Inside login method");
		String uname = excelFactory.getExcelRowData(sheetName, testCaseID)[1];
		String password = excelFactory.getExcelRowData(sheetName, testCaseID)[2];
		System.out.println("uname.."+uname+"  password..."+password);
		comonActions.performLogin(uname,password);	
	}
	@Given("Login into Application {string}")
	public void login_into_Application(String testCaseID) {
		try{
			System.out.println("id is..."+testCaseID);			
			System.out.println("Enter username, password and click on login button "); 
			//UserDataModel userData = getUserData.getTestData(string);
			//
			
			String ds[]=excelFactory.getExcelRowData("TestData", "TC001");
			System.out.println(ds[1]+"hh ID...");
			System.out.println(ds[0]+"Testcase ID...");
			
			//
			comonActions.performLogin(excelFactory.getExcelRowData("TestData", testCaseID)[1],excelFactory.getExcelRowData("TestData", testCaseID)[2]);
			
			}catch(Exception e){
				System.out.println("loginIntoApplication() methods failed.."+e.getMessage());
				
			}
	}

	
	@Given("I login to Salesforce Lightning Appication as {string}")
	public void i_login_to_Salesforce__Lightning_Appication_as(String userType) {
		UserDataModel userData = getUserData.getTestData(userType);
		//comonActions.performLogin(userData.getUserName(), userData.getPassword(),userType);
	}
	
	

	
}
