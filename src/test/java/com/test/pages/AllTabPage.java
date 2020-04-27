package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.BaseClass;


public class AllTabPage extends BaseClass{
	
	
	//public ExtentTest reporter=null;
	//public ExcelFactory excelFactory=null;
	public AllTabPage(WebDriver driver) {
		
		//excelFactory=PageFactory.initElements(driver, ExcelFactory.class);
		//
	}

	@FindBy(xpath="//img[@title='Customer Performance']/..") private WebElement lnkCustomerPerformance;
	@FindBy(xpath="//img[@title='Industry / Targeting Tool']/..") private WebElement lnkIndustry_Targeting_Tool;
	
	
	public void clickOn_IndustryTargetingToolLink() {
		
		clickElement(lnkIndustry_Targeting_Tool);
	}
	public void validateURLOfHealthReport(String url) {
		
		boolean flagValue=validateURL(url);
		if(flagValue==true) {
			System.out.println("Successfully navigated to Health report page");
		}else {
			System.out.println("Unable to navigate Health report page");
		}
	}
	public void clickOn_CustomerPerformanceLink() {
		
		clickElement(lnkCustomerPerformance);
	}
	
	
	
	
	

}
