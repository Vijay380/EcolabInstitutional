package com.test.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.BaseClass;



public class LeadPage extends BaseClass{
	
	//BasePage  basePage=null;
	//public ExtentTest reporter=null;
	//public ExcelFactory excelFactory=null;
	public LeadPage(WebDriver driver) {
		//super(driver);
		//basePage=PageFactory.initElements(driver, BasePage.class);
		//excelFactory=PageFactory.initElements(driver, ExcelFactory.class);
		//
	}
	
	//*************Lightining****************
	
	@FindBy(xpath="(//span[text()='Lead Status'])[2]/../following-sibling::div//a") private WebElement ddl_LeadStatus;
	@FindBy(xpath="//span[text()='Lead Source']/../following-sibling::div//a") private WebElement ddl_LeadSource;
	@FindBy(xpath="(//span[text()='Company'])[2]/../following-sibling::input") private WebElement txtCompany;
	@FindBy(xpath="(//span[text()='Phone'])[2]/../following-sibling::input") private WebElement txtPhone;
	@FindBy(xpath="//span[text()='Last Name']/../following-sibling::input") private WebElement txtLastName;
	
	
	
	public boolean pupulateDataToCreateNewLead(String status,String source,String company,String phone,String lName) {
		
		boolean flag=false;
		System.out.println("Enter required data to create Lead ");
		try {
			selectNewLeadStatus(status);
			selectLeadSource(source);
			setTextField(txtCompany, company);
			setTextField(txtPhone, phone);
			setTextField(txtLastName, lName);
			Thread.sleep(10000);
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public void selectLeadSource(String source) {
		
		System.out.println("Select Lead Source as : "+source);
		try {
			clickElementJavaScript(ddl_LeadSource);
			List<WebElement> ele = driver.findElements(By.xpath("//li[@role='presentation']//a"));
			System.out.println("List size..."+ele.size());
			for(int i=0;i<ele.size();i++) {
				
				if(ele.get(i).getText().equals(source)) {
					clickElement(ele.get(i));
					break;
				}
			}
			//reporter.log(LogStatus.PASS, "Successfully selected Lead Source: "+source);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Unable to select Lead Source: "+source);	
		}
		
	}
	public boolean selectNewLeadStatus(String status) {
		boolean flag=false;
		
		System.out.println("Select status of new lead: "+status);
		try {
			clickElementJavaScript(ddl_LeadStatus);
			List<WebElement> ele = driver.findElements(By.xpath("//li[@role='presentation']//a"));
			System.out.println("List size..."+ele.size());
			for(int i=0;i<ele.size();i++) {
				
				if(ele.get(i).getText().equals(status)) {
					clickElement(ele.get(i));
					break;
				}
			}
			flag=true;
			//reporter.log(LogStatus.PASS, "Successfully selected value from drop down: "+status);	
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println("Unable to select value from drop down: "+status);
		}
		return flag;
	}
	
}
