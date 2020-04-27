package com.test.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.BaseClass;
import com.test.utility.ExcelFactory;


public class Opportunities extends BaseClass{
	
	//BasePage  basePage=null;
	//public ExtentTest reporter=null;
	public ExcelFactory excelFactory=null;
	public Opportunities() {
		PageFactory.initElements(driver, this);
	}
	
	//*************Lightining****************
	
	@FindBy(xpath="//span[text()='Opportunity Name']/../following-sibling::input") private WebElement txtbox_OpportunityName;	
	@FindBy(xpath="//input[@title='Search Customers']") private WebElement srchbox_AccountName;	
	@FindBy(xpath="//span[text()='Close Date']/../following-sibling::div//input[@type='text']") private WebElement datePicker_CloseDate;
	@FindBy(xpath="//span[text()='Amount']/../following-sibling::input") private WebElement txtbox_Amount;	
	@FindBy(xpath="(//span[text()='Stage']/../following-sibling::div[1])[2]") private WebElement ddl_Stage;
	@FindBy(xpath="(//div[@class='select-options'])[7]//a") private WebElement ddl_StageValues;
	@FindBy(xpath="//button[text()='Next']") private WebElement btnPopUp_Next;
	@FindBy(xpath="//h3[text()='Select Opportunity Record Type']/../following-sibling::div[1]/div/div/ol/input") private List<WebElement> rdoBtn_G360RecordType;
	@FindBy(xpath="//div[text()='Edit']") private List<WebElement> btn_Edit;
	@FindBy(xpath="//a[@title='Build Rapport / Explore Customer Needs']") private WebElement btn_BuildRapport;
	@FindBy(xpath="//button[@title='Edit Top - Competitor']") private WebElement btn_EditTopCompetitor;
	@FindBy(xpath="//span[text()='Mark as Current Stage']") private WebElement btn_marksComplete;
	
	
	public void clickOnMarksAsCOmplete(){
		System.out.println("marksa as complete");
		clickElement(btn_marksComplete);
	}
	public void clickOn_BuildRapport(){
		System.out.println("click on build rapport");
		clickElement(btn_BuildRapport);
	}
	public void provideTopCompetitor(){
		System.out.println("Provide top competitor");
		
		try {
			scrollDownToPixel(500);
			clickElement(btn_EditTopCompetitor);
			Thread.sleep(2000);
			WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Competitors...']"));
			
			
			setTextField(ele, "TestA");
			Thread.sleep(3000);
			WebElement ele2=driver.findElement(By.xpath("//strong[text()='TestA']"));
			clickElement(ele2);
			WebElement ele3=driver.findElement(By.xpath("//button[@title='Save']"));
			clickElement(ele3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean clickOnExistingOppty(String text){
		System.out.println("click on existing oppty");
		fluentWaitforElement(driver.findElement(By.xpath("(//a[text()='"+text+"'])[1]")));
		WebElement ele=driver.findElement(By.xpath("(//a[text()='"+text+"'])[1]"));
		boolean flag = clickElement(ele);
		return flag;
	}
	public boolean clickOnEdit_Button(){
		System.out.println("click on edit button");
		boolean flag=false;
		try{
		
		Thread.sleep(5000);
		for(WebElement ele:btn_Edit){
			if(ele.isDisplayed() && ele.isEnabled()){
				flag=clickElement(ele);
				break;
			}
		}
		}catch(Exception e){
			
		}
		return flag;
	}
	public boolean clickOn_NextButton() {
		
		//System.out.println("Click on Next button");
		boolean flag=false;
		try{
		flag=clickElementJavaScript(btnPopUp_Next);
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	public boolean selectOpportunityRecordType(){
		boolean flag=false;
		System.out.println("size .........."+rdoBtn_G360RecordType.size());
		if(rdoBtn_G360RecordType.size()>0){
			clickElement(rdoBtn_G360RecordType.get(0));
			System.out.println("successfully clicked on radio button....");
			flag=true;
		}else{
			flag=true;
		}
		
//		if(rdoBtn_G360RecordType.isDisplayed()){
//			clickElement(rdoBtn_G360RecordType);
//			System.out.println("successfully clicked on radio button....");
//			flag=true;
//		}
		return flag;
		
		//driver.findElement(By.xpath("//h3[text()='Select Opportunity Record Type']/../following-sibling::div[1]/div/div/ol/input")).click();
		
	}
	public boolean validateCreatedOpportunities(String text) {
		
		System.out.println("Validate created Opportunities "+text);
		boolean flag=false;
		try{
		fluentWaitforElement(driver.findElement(By.xpath("//span[text()='"+text+"']")));
		WebElement eleAccName=driver.findElement(By.xpath("//span[text()='"+text+"']"));
		if(eleAccName.isDisplayed()) {
			//System.out.println("Prospect created successfully.."+text);
			flag=true;
			System.out.println("Opportunities created successfully "+text);
		}
		}catch(Exception e){
			e.printStackTrace();
			//System.out.println("Unable to create Customer account."+text);
			System.out.println("Unable to create Opportunities. "+text);
		}
		return flag;
		
		
	}
	public boolean populateDataToCreateOpportunities(String accountName,String amt,String stage,String topComptetior) {
		System.out.println("Enter required data to create Opportunities ");
		boolean flag=false;
		try{
		
		clickElement(srchbox_AccountName);
		setTextField(srchbox_AccountName, accountName);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@title='Search Customers']")).sendKeys("");
		List<WebElement> listCustomers=driver.findElements(By.xpath("//input[@title='Search Customers']/following-sibling::div//li//div[@class='primaryLabel slds-truncate slds-lookup__result-text']"));
		for(WebElement ele:listCustomers){
			if(ele.getText().equals(accountName)){
				clickElement(ele);
				Thread.sleep(3000);			
				break;
			}
		}
		selectCloseDateForOpportunities();
		Thread.sleep(4000);
		setTextField(txtbox_Amount, amt);
		flag = selectStageFromDropDown(stage);
//		WebElement ele =driver.findElement(By.xpath("//input[@title='Search Competitors']"));
//		setTextField(ele, topComptetior);
//		Thread.sleep(3000);
//		WebElement ele2=driver.findElement(By.xpath("//div[@title='TestA']"));
//		clickElement(ele2);
		}catch(Exception e){
			
		}
		return flag;
	}
	
	public boolean selectStageFromDropDown(String stage) {
		
		System.out.println("select Stage value from opportunities pop up window ");
		boolean flag=false;
		try {
			Thread.sleep(4000);
			scrollToElement(ddl_Stage);
			System.out.println("scroll to ddl list");
			clickElement(ddl_Stage);
			Thread.sleep(6000);
			List<WebElement> listStages=driver.findElements(By.xpath("//div[@class='select-options']//a"));
			System.out.println("stage.............."+stage);
			for(WebElement ele:listStages) {
				String s1=ele.getText();
				System.out.println("s1."+s1);
				if(s1.equals(stage)) {
					flag = clickElementJavaScript(ele);
					System.out.println("flag value is.."+flag);
					Thread.sleep(8000);
					break;
				}
			}
			System.out.println("Successfully selected Stage value from drop down in New Opportunities pop up window");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Unable to select Stage value in New Opportunities pop up window");
		}
		return flag;
	}
	public boolean selectCloseDateForOpportunities() {
		
		System.out.println("select Close Date For New Opportunities popup  window ");
		boolean flag=false;
		try {
			clickElementJavaScript(datePicker_CloseDate);
			Thread.sleep(5000);
			DateFormat dateFormat=null;
			Date dates=null;
			String date1=null;
			dateFormat= new SimpleDateFormat("MM/dd/yyyy ");
			dates = new Date();
			date1=dateFormat.format(dates);
			String[] sArr=date1.split("/");
			System.out.println(sArr[0]);
			System.out.println(sArr[1]);
			WebElement eleDate=driver.findElement(By.xpath("//div[@class='dateBar']/following-sibling::div[1]//td//span[text()='"+sArr[1]+"']"));
			flag = clickElementJavaScript(eleDate);
			System.out.println("successfully closed date salected."+flag);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Unable to select close Date: "+flag);
		}
		return flag;
		
	}
	
	
	
	
}
