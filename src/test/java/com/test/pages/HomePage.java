package com.test.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.test.baseclass.BaseClass;

public class HomePage extends BaseClass{
	
	private BaseClass baseClass = new BaseClass();
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy(xpath="//img[@title='All Tabs']") private WebElement tab_AllTabs;
	@FindBy(xpath="//span[text()='Customers']") private WebElement tab_Customer;
	@FindBy(xpath="//textarea[@id='tsk6']") private WebElement txtArea_Comments;
	@FindBy(name="save") private WebElement btn_Save;
	@FindBy(xpath="//span[text()='Leads']") private WebElement tab_Leads;
	@FindBy(xpath="//span[text()='Opportunities']") private WebElement tab_Opportunities;
	
	public void clickOn_OpportunitiesTab() {
		
		System.out.println("click on Opportunities tab menu");
		try {
			//clickElementJavaScript(tab_Opportunities);
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println("Unable to Click on Opportunities tab menu");
			System.out.println("Unable to Click on Opportunities tab menu.."+e.getMessage());
		}
		
	}
	public void clickOn_LeadTab() {
		
		System.out.println("click on Leads tab menu");
		try {
			//clickElementJavaScript(tab_Leads);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Unable to Click on Leads tab menu");
		}
		
	}
	public void clickOnSaveButton() {
		//clickElement(btn_Save);
	}
	public void provideCommentsUnderTaskEditSection(String comment) {
		//setTextField(txtArea_Comments, comment);
	}
	public void clickOn_CustomerTab() {
		
		System.out.println("click on Customer tab menu");
		clickElementJavaScript(tab_Customer);
		Assert.assertTrue(baseClass.waitForURL("lightning.force.com/lightning/n/My_Territory")," Unable to Navigate to my business page");
	}
	public void clickOn_AllTabs_Link() {
		
		if(tab_AllTabs.isDisplayed()) {
			tab_AllTabs.click();
			System.out.println("Clicked on All Tabs Icon");
		}else {
			System.out.println("Unable to Click on All Tabs Icon");
		}
		
	}
	
	public void clickCustomerTab()
	{
		wait.until(ExpectedConditions.visibilityOf(tab_Customer));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", tab_Customer);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
