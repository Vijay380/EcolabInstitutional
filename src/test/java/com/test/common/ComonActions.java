package com.test.common;

import org.testng.Assert;

import com.test.baseclass.BaseClass;
import com.test.pages.LoginPage;

public class ComonActions extends BaseClass{
	private LoginPage loginPage = new LoginPage();
	private BaseClass baseClass = new BaseClass();
	public ComonActions performLogin(String userName, String password) {
		System.out.println("Entering username.."+userName);
		System.out.println("Entering password.."+password);
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.clickOn_SubmitButton();
		Assert.assertTrue(baseClass.waitForURL("lightning.force.com/lightning/n/My_Territory")," Unable to Navigate on Landing Page");
		return this;
	}
}
