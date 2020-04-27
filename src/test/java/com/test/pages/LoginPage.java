package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(id="username")
	public WebElement txt_UserName;

	@FindBy(id="password")
	public WebElement txt_Password;
	
	@FindBy(id="Login")
	public WebElement btn_Login;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickOn_SubmitButton() {
		System.out.println("before clicking login button in java file");
		clickElement(btn_Login);
		
	}
	public LoginPage enterUserName(String email) {
		try {
			wait.until(ExpectedConditions.visibilityOf(txt_UserName))
					.sendKeys(email);
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(txt_UserName))
					.sendKeys(email);
		}
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		try {
			wait.until(ExpectedConditions.visibilityOf(txt_Password))
					.sendKeys(password);
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(txt_Password))
					.sendKeys(password);
		}
		return this;
	}

//	public LoginPage clickOnLoginButton() {
//		try {
//			wait.until(ExpectedConditions.visibilityOf(btn_Login))
//					.click();
//		} catch (Exception e) {
//			wait.until(ExpectedConditions.visibilityOf(btn_Login))
//					.click();
//		}
//		finally{
//			try {
//				Thread.sleep(18000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return this;
//	}
}
