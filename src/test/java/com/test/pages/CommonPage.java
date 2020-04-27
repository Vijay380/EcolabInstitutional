package com.test.pages;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.baseclass.BaseClass;

public class CommonPage extends BaseClass {

	

	public CommonPage() {
		PageFactory.initElements(driver, this);
	}

	String parentWindow=null;
	String childWindow=null;
	
	@FindBy(xpath="//div[text()='New']") private WebElement btn_New;
	@FindBy(xpath="//div[text()='ds']") private WebElement btn_New1;
	//*************Lightining****************
	@FindBy(xpath="//span[text()='G360 Prospect']/../preceding-sibling::div[1]/input") private WebElement rdoBtn_G360Prospect;
	@FindBy(xpath="//span[text()='Next']") private WebElement btnPopUp_Next;
	@FindBy(xpath="//button[@title='Save']/span") private WebElement btnPopUp_Save;
	@FindBy(xpath="//a[@title='Notes']/span") private WebElement tab_Note;
	@FindBy(xpath="//a[@title='Tasks']/following-sibling::one-app-nav-bar-item-dropdown/div//a") private WebElement tab_Task;
	@FindBy(xpath="//a[@title='Opportunities']/span") private WebElement tab_Opportunities;
	
	
	public boolean clickOnOpportunities_Tab(){
		System.out.println("click on Opportunities Tab");
		boolean flag=clickElementJavaScript(tab_Opportunities);
		return flag;
	}
	public boolean clickOnTaskTab(){
		System.out.println("click on Task Tab");
		//boolean flag=clickElement(tab_Note);
		boolean flag=clickElementJavaScript(tab_Task);
		
		return flag;
	}
	public boolean clickOnNoteTab(){
		System.out.println("click on Note Tab");
		//boolean flag=clickElement(tab_Note);
		boolean flag=clickElementJavaScript(tab_Note);
		
		return flag;
	}
	public void switchToLeadWindow() {
		
		System.out.println("Switch to new Lead Window ");
		try {
			childWindow=driver.getWindowHandle();
			driver.switchTo().window(childWindow);
			
		}catch(Exception e) {
			System.out.println("Unable to switch to Lead Window ");
		}
	}
		public boolean clickOnSaveButton() {
		
		System.out.println("Click on [Save] button to save created prospect");
		boolean flag=clickElementByActionsClass(btnPopUp_Save);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;
	}
	
	public boolean NewButton(){
		boolean flag=false;
		try{
			flag=clickElement(btn_New1);
		}catch(Exception e){
		}
		return flag;
			
		}
	public String clickOn_NewButton() {
		
		System.out.println("click on New Button");
		try {
			Thread.sleep(7000);
			parentWindow=driver.getWindowHandle();
			
			clickElement(btn_New);
			
		} catch (InterruptedException e) {
			System.out.println("click on new button method is failed "+e.getMessage());
			
		}
		return parentWindow;
	}
}
