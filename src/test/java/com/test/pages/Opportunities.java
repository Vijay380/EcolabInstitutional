package com.test.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.baseclass.BaseClass;
import com.test.utility.ExcelFactory;


public class Opportunities extends BaseClass{
	
	//BasePage  basePage=null;
	//public ExtentTest reporter=null;
	
	private ExcelFactory excelFactory=new ExcelFactory();
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
	@FindBy(xpath="//div[contains(@class,'pathassistantPathAssistantTabSet')]//li[3]") private WebElement btn_BuildRapport;
	@FindBy(xpath="//button[@title='Edit Top - Competitor']") private WebElement btn_EditTopCompetitor;
	@FindBy(xpath="(//button[@title='Clear Selection'])[2]") private WebElement btn_close;
	@FindBy(xpath="//span[text()='Mark as Current Stage'] | //span[text()='Select Closed Stage'] | //span[text()='Change Closed Stage']") public WebElement btn_marksComplete;
	@FindBy(xpath="//button[.='Mark Stage as Complete'] | //span[text()='Change Closed Stage']") public WebElement btn_markStageCompleted;
	@FindBy(xpath="//button[text()='Done']") public WebElement btn_DoneCloseStage;
	@FindBy(xpath="//button[@title='Edit G360 Initiative']") public WebElement btn_G360Initiative;
	@FindBy(xpath="//span[@title='Global Sales Blitz']") public WebElement multiSelect_GlobalSalesBlitz;
	@FindBy(xpath="(//button[@title='Move selection to Chosen'])[1]//span") public WebElement rightArrow_G360Initiative;
	@FindBy(xpath="//button[@title='Save']") public List<WebElement> btn_Save;
	@FindBy(xpath="//div[text()='Add Opportunity Team Members']") public List<WebElement> btn_AddOpporTeamMember;
	@FindBy(xpath="//span[text()='Edit User: Item 1']") private WebElement txtbox_OpporTeamUser;
	@FindBy(xpath="//input[@title='Search People']") private WebElement txtbox_OpporSearchPeople;
	@FindBy(xpath="(//span[text()='Save'])[2]") private WebElement btn_SaveOppor;
	
	
	public boolean clickOnSaveButton(){
		System.out.println("click on save button");
		
		scrollDownToPixel(550);
		boolean flag=clickElementJavaScript(btn_SaveOppor);
		
		return flag;
	}
	public boolean enterOpporTeamUserName(String sheetName,String text){
		System.out.println("Enter Oppor team username");
		clickElementJavaScript(txtbox_OpporTeamUser);
		String[] data=excelFactory.getExcelRowData(sheetName,text);
		System.out.println("data length="+data.length);
		boolean flag = setTextField(txtbox_OpporSearchPeople, data[4]);
		WebElement ele=driver.findElement(By.xpath("//div[@title='"+data[4]+"']"));
		clickElement(ele);
		new Actions(driver).sendKeys(Keys.TAB).perform();
		return flag;
	}
	public boolean clickOnAddOpporTeamMember(){
		System.out.println("click on Oppor Team Member");
		boolean flag = false;
		for(WebElement ele: btn_AddOpporTeamMember){
			if(ele.isDisplayed()){
				flag = clickElementJavaScript(ele);
				break;
			}
		}
		
		return flag;
	}
	public boolean G360Initiative(){
		boolean flag=false;
		try{
		System.out.println("Add 360 initiative");
		clickElementJavaScript(btn_G360Initiative);
		clickElement(multiSelect_GlobalSalesBlitz);
		clickElementJavaScript(rightArrow_G360Initiative);
		for(WebElement ele : btn_Save){
			if(ele.isDisplayed()){
				flag = clickElement(ele);
				System.out.println("Successfully clicked on save button");
				break;
			}
		}
		}catch(Exception e){
			
		}
		return flag;
		
	}
	public boolean clickOnDoneButton(){
		System.out.println("click on done button");
		boolean flag=false;
		try{
			Thread.sleep(4000);
			flag = clickElement(btn_DoneCloseStage);
			System.out.println("successfully clicked on done button");
		}catch(Exception e){
			System.out.println("Unable to click on done button");
		}
		
		return flag;
		
	}
	public boolean changeOpporStage(String stage){
		System.out.println("Change oppor stage to ["+stage+"]");
		boolean flag=false;
		try{
			Thread.sleep(2000);
			//WebElement ele=driver.findElement(By.xpath("//a[@title='"+stage+"'] | //a[@title='Closed Won']"));
			flag = clickElementJavaScript(driver.findElement(By.xpath("//a[@title='"+stage+"'] | //a[@title='Closed Won']")));
		}catch(Exception e){
			System.out.println("unable to click on ["+stage+"] stage");
		}
		return flag;
	}  
	public void clickOnMarksAsCOmplete(){
		System.out.println("marksa as complete");
		clickElement(btn_marksComplete);
	}

	public void clickOn_BuildRapport() {
		System.out.println("click on build rapport");
		clickElementJavaScript(btn_BuildRapport);
	}
	public boolean provideTopCompetitor_V2(){
		System.out.println("Provide top competitor");
		boolean flag=false;
		try {
			scrollDownToPixel(500);
			//clickElement(btn_EditTopCompetitor);
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOf(btn_close)).click();
			WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Competitors...']"));
			setTextField(ele, "TestA");
			Thread.sleep(3000);
			WebElement ele2=driver.findElement(By.xpath("//strong[text()='TestA']"));
			clickElement(ele2);
			//WebElement ele3=driver.findElement(By.xpath("//button[@title='Save']"));
			//flag = clickElement(ele3);
			//wait.until(ExpectedConditions.invisibilityOf(ele3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	public boolean provideTopCompetitor(){
		System.out.println("Provide top competitor");
		boolean flag=false;
		try {
			scrollDownToPixel(500);
			clickElement(btn_EditTopCompetitor);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(btn_close)).click();
			WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Competitors...']"));
			setTextField(ele, "TestA");
			Thread.sleep(3000);
			WebElement ele2=driver.findElement(By.xpath("//strong[text()='TestA']"));
			clickElement(ele2);
			WebElement ele3=driver.findElement(By.xpath("//button[@title='Save']"));
			flag = clickElement(ele3);
			wait.until(ExpectedConditions.invisibilityOf(ele3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
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
		//selectCloseDateForOpportunities();
		Thread.sleep(4000);
		setTextField(txtbox_Amount, amt);
		flag = selectStageFromDropDown(stage);
		provideTopCompetitor_V2();
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
			// single date format
			WebElement eleDate=null;
			if(sArr.length==2){
				eleDate=driver.findElement(By.xpath("//div[@class='dateBar']/following-sibling::div[1]//td//span[text()='"+sArr[1]+"']"));
			}else{
				String d=sArr[1];
				char singleDigitDate=d.charAt(1);
				eleDate=driver.findElement(By.xpath("//div[@class='dateBar']/following-sibling::div[1]//td//span[text()='"+singleDigitDate+"']"));
			}
			
			flag = clickElementJavaScript(eleDate);
			System.out.println("successfully closed date salected."+flag);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Unable to select close Date: "+flag);
		}
		return flag;
		
	}
	
	
	
	
}
