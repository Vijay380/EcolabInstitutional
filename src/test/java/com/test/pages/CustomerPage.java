package com.test.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.test.baseclass.BaseClass;
import com.test.context.Context;
import com.test.utility.ExcelFactory;
import com.test.utility.GetUserData;


public class CustomerPage extends BaseClass{
	
	//BasePage  basePage=null;
	//public ExtentTest reporter=null;
	//public ExcelFactory excelFactory=null;
private ExcelFactory excelFactory=new ExcelFactory();
private Context context=new Context();
	public CustomerPage() {
		PageFactory.initElements(driver, this);
		
		
	}
	String parentWindow=null;
	@FindBy(xpath="//div[text()='New']") private WebElement btn_New;
	@FindBy(id="p3") private WebElement ddl_RecordType;
	@FindBy(xpath="//input[@value='Continue']") private WebElement btn_Continue;
	@FindBy(id="acc2") private WebElement txt_AccountName;
	@FindBy(id="acc18street") private WebElement txt_ShippingStreet;
	@FindBy(id="acc18city") private WebElement txt_ShippingCity;
	@FindBy(id="acc18state") private WebElement txt_ShippingState;
	@FindBy(id="acc18zip") private WebElement txt_ShippingZip;
	@FindBy(id="acc18country") private WebElement txt_ShippingCountry;
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']") private WebElement btn_Save;
	@FindBy(xpath="//h2[text()='Customer Detail']/../following-sibling::td//input[@value='Delete']") private WebElement btn_CustomerDelete;
	@FindBy(xpath="//h2[text()='Customer Detail']/../following-sibling::td//input[@title='Edit']") private WebElement btn_CustomerEdit;
	@FindBy(xpath="(//table[@class='list']//tr[contains(@class,'dataRow')]//th/a)[1]") private WebElement lnk_AccountRecordFirst;
	@FindBy(xpath="//a[text()='Log a Call']") private WebElement btn_LogACall;
	//*************Lightining****************
	@FindBy(xpath="//span[text()='G360 Prospect']/../preceding-sibling::div[1]/input") private WebElement rdoBtn_G360Prospect;
	@FindBy(xpath="//span[text()='Next']") private WebElement btnPopUp_Next;
	@FindBy(xpath="//button[@title='Save']/span") private WebElement btnPopUp_Save;
	@FindBy(xpath="(//span[text()='Account Name'])[2]/../following-sibling::input") private WebElement txtbox_AccountName;
	@FindBy(xpath="(//span[text()='Account Name'])[5]/../following-sibling::input") private WebElement txtbox_AccountName_Clone;
	
	@FindBy(xpath="//span[text()='Phone']/../following-sibling::input") private WebElement txtbox_Phone;
	@FindBy(xpath="//span[text()='Contact Email']/../following-sibling::input") private WebElement txtbox_ContactEmail;
	@FindBy(xpath="//span[text()='Billing Street']/../following-sibling::textarea") private WebElement txtbox_BillingStreet;
	@FindBy(xpath="//span[text()='Billing City']/../following-sibling::input") private WebElement txtbox_BillingCity;
	@FindBy(xpath="//span[text()='Billing State/Province']/../following-sibling::input") private WebElement txtbox_BillingState;
	@FindBy(xpath="//span[text()='Billing Zip/Postal Code']/../following-sibling::input") private WebElement txtbox_BillingZip;
	@FindBy(xpath="//span[text()='Billing Country']/../following-sibling::input") private WebElement txtbox_BillingCountry;
	@FindBy(xpath="//span[text()='Shipping Street']/../following-sibling::textarea") private WebElement txtbox_ShippingStreet;
	@FindBy(xpath="//span[text()='Shipping City']/../following-sibling::input") private WebElement txtbox_ShippingCity;
	@FindBy(xpath="//span[text()='Shipping State/Province']/../following-sibling::input") private WebElement txtbox_ShippingState;
	@FindBy(xpath="//span[text()='Shipping Zip/Postal Code']/../following-sibling::input") private WebElement txtbox_ShippingZip;
	@FindBy(xpath="//span[text()='Shipping Country']/../following-sibling::input") private WebElement txtbox_ShippingCountry;
	@FindBy(xpath="//div[text()='Upload Files']") private WebElement btn_Upload;
	@FindBy(xpath="//flexipage-tab2[@id='tab-53']//li[@class='tabs__item active uiTabItem']//a[@class='tabHeader']") private WebElement tab_NewEvent_Activity;
	@FindBy(xpath="//label[text()='Subject']/following-sibling::div//input") private WebElement txtbox_SUbject;
	@FindBy(xpath="//a[text()='Related']") private WebElement subTab_Related;
	@FindBy(xpath="(//span[text()='Notes'])[1]/../../../../..//div[text()='New']") private WebElement btn_New_Note;
	@FindBy(xpath="(//input[@role='textbox'])[5]") private WebElement txtbox_Subject_Event;
	//(xpath="(//span[text()='New task'])[2]") private WebElement Tab_Event;
	@FindBy(xpath="//div[text()='Add Team Members']") private WebElement btn_AddTeamMember;
	@FindBy(xpath="//span[text()='Edit User: Item 1']") private WebElement txtbox_TeamUser;
	@FindBy(xpath="//span[text()='Edit Team Role: Item 1 Edited']//..//..//button") private WebElement txtbox_TeamRole;
	@FindBy(xpath="//div[text()='Clone']") private WebElement btn_Lone;
	@FindBy(xpath="//div[text()='Reassign Prospect']") private WebElement btn_ReassignProspect;
	@FindBy(xpath="//input[@id='newOwn']") private WebElement lookup_txtbx_OwnerName;
	@FindBy(xpath="//input[@title='Search People']") private WebElement txtbox_SearchPeople;
	@FindBy(xpath="//ul[@class='scrollable']//li//a") private List<WebElement> ddl_TeamRole;
	@FindBy(xpath="//div[text()='New Contact']") private WebElement btn_AddNewContact;
	@FindBy(xpath="//span[text()='Last Name']/../following-sibling::input") private WebElement txtbox_Lastname_Contact;
	@FindBy(xpath="//input[@title='Save']") private WebElement btn_Save_NewOwner;
	
	
	public boolean clickOnSaveButtonOfNewOwner(){
		System.out.println("click on save button for new Owner");
		boolean flag = clickElement(btn_Save_NewOwner);
		return flag;
	}
	public boolean enterlastNameOfContact(String text){
		System.out.println("Enter last name of customer");
		boolean flag = setTextField(txtbox_Lastname_Contact, text);
		return flag;
		
	}
	public boolean clickOnNewContact_Button(){
		System.out.println("click on New contact button");
		boolean flag = clickElementJavaScript(btn_AddNewContact);
		return flag;
		
	}
	public boolean enterAccountOwnerName(String text){
		System.out.println("Enter new Account owner name");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int count=0;
		System.out.println("size.."+driver.findElements(By.xpath("//iframe")).size());
		List<WebElement> els=driver.findElements(By.xpath("//iframe"));
		for(int i=0;i<5;i++){
			
			try{	
				System.out.println("print of I.."+i);
				    driver.switchTo().frame(i);
				    lookup_txtbx_OwnerName.isDisplayed();
				    System.out.println("Element found.");
				    
				    break;
					//clickElementJavaScript(lookup_txtbx_OwnerName);
					//setTextField(lookup_txtbx_OwnerName, "Hello");
				
			}catch(Exception e){
				System.out.println("count is  "+count);
				//System.out.println("ele..."+els.get(i).getAttribute("name"));
			}
			driver.switchTo().defaultContent();
		}
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@name,'vfFrameId')]")));
		//switchToFrame(frameId);
		clickElementJavaScript(lookup_txtbx_OwnerName);
		boolean flag = setTextField(lookup_txtbx_OwnerName, text);
		return flag;
	}
	public boolean clickOnReassignProspect_Button(){
		System.out.println("click on Reassign prospect button");
		boolean flag = clickElement(btn_ReassignProspect);
		return flag;
	}
	public boolean updateAccountName(String text){
		System.out.println("Provide updated account Name");
		boolean flag = false;
		String updateAccountname=null;
		System.out.println("text.."+text);
		String[] data=excelFactory.getExcelRowData("TestData",text);
		System.out.println("data length="+data.length);
		updateAccountname=data[3]+generateRandonNumber();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> ele=driver.findElements(By.xpath("//span[text()='Account Name']/../following-sibling::input"));
		System.out.println("Total ele size="+ele.size());
		for(int i=0;i<ele.size();i++){
			if(ele.get(i).isDisplayed()){
				flag = setTextField(ele.get(i), updateAccountname);
			}
		}
		
		//boolean flag = setTextField(txtbox_AccountName_Clone, updateAccountname);
		return flag;
		
	}

	public boolean clickOnCloneButton(){
		System.out.println("click on clone button");
		boolean flag = clickElement(btn_Lone);
		return flag;
		
	}
	
	public boolean enterTeamRole(String text){
		System.out.println("Enter team role");
		//clickElement(txtbox_TeamRole);
		//txtbox_TeamRole.click();
		
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement ele=driver.findElement(By.xpath("(//span[@class='triggerContainer'])[2]//button"));
		
		ele.click();
		System.out.println("cliked on Team role");
		try {
			Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[text()='--None--']")).click();
		Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<ddl_TeamRole.size();i++){
			System.out.println("Team role.."+ddl_TeamRole.get(i).getText());
			if(ddl_TeamRole.get(i).getText().equals("User")){
				//clickElement(ddl_TeamRole.get(i));
				driver.findElement(By.xpath("//a[text()='User']")).click();
				break;
			}
		}
		
		return true;
	}
	
	public boolean enterTeamUserName(String text){
		System.out.println("Enter team username");
		clickElementJavaScript(txtbox_TeamUser);
		String[] data=excelFactory.getExcelRowData("TestData",text);
		System.out.println("data length="+data.length);
		boolean flag = setTextField(txtbox_SearchPeople, data[3]);
		WebElement ele=driver.findElement(By.xpath("//div[@title='"+data[3]+"']"));
		clickElement(ele);
		new Actions(driver).sendKeys(Keys.TAB).perform();
		return flag;
	}
	public boolean clickOnAddTeamMemberButton(){
		System.out.println("click on add team member button");
		//scrollDownToPixel(400);
		boolean flag=clickElementJavaScript(btn_AddTeamMember);
		return flag;
	}
	public boolean clickOnEventTab(){
		System.out.println("click on event Tab");
		boolean fg=fluentWaitforElement(tab_NewEvent_Activity);
		System.out.println("fg.."+fg);
		boolean flag = clickElementByActionsClass(tab_NewEvent_Activity);
		return flag;
	}
	
	public boolean enterEventSubject(String text){
		System.out.println("Enter event subject");
		
		boolean flag=setTextField(txtbox_Subject_Event, text);
		
		
		return flag;
	}
	public boolean clickOnNewButtonUnderNote(){
		System.out.println("click on new button under Note section");
		scrollDownToPixel(650);
		boolean flag = clickElementJavaScript(btn_New_Note);
		return flag;
	}
	public boolean clickOnRelatedTab(){
		System.out.println("click on related Tab");
		boolean flag = clickElement(subTab_Related);
		scrollDownToPixel(400);
		return flag;
		
	}
	public void enterSubject(){
		setTextField(txtbox_SUbject, "dummy Test");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void tapOnNewEventActivity(){
		clickElement(tab_NewEvent_Activity);
	}
	public void clickOnExistingCustomer(){
		String text=GetUserData.getAccountName();
		System.out.println("Validate created Account "+text);
		fluentWaitforElement(driver.findElement(By.xpath("//*[text()='Account Name']/../../../../../..//tbody/tr//a[text()='"+text+"']")));
		WebElement eleAccName=driver.findElement(By.xpath("//*[text()='Account Name']/../../../../../..//tbody/tr//a[text()='"+text+"']"));
		clickElement(eleAccName);
	}
	
	public boolean validateCreatedProspect() {
		String accountName=GetUserData.getAccountName();
		System.out.println("Validate created Account"+accountName);
		boolean flag=false;
		try{
		fluentWaitforElement(driver.findElement(By.xpath("//*[text()='"+accountName+"']")));
		WebElement eleAccName=driver.findElement(By.xpath("//*[text()='"+accountName+"']"));
		Thread.sleep(4000);
		if(eleAccName.isDisplayed()) {
			//reporter.log(LogStatus.PASS, "Prospect created successfully.."+text);
			flag=true;
			System.out.println("Customer account created successfully"+accountName);
		}
		}catch(Exception e){
			e.printStackTrace();
			//reporter.log(LogStatus.FAIL, "Unable to create Customer account."+text);
			System.out.println("Unable to create Customer account."+accountName);
		}
		return flag;
		
		
		
//		String accName=context.getContextParam("accountName");
//	    WebElement ele=driver.findElement(By.xpath("//span[text()='"+accName+"']"));
//	    if(ele.isDisplayed()){
//	    	String accountNme=ele.getText();
//	    	if(accountNme.equals(context.getContextParam(accountNme))){
//	    		System.out.println("Prospect created successfully: "+accName+"");
//	    	}else{
//	    		Assert.assertTrue(false,"Unable to create prspect");
//	    	}
//	    }
	}
	public void uploadNoteAndAttachment() {
		
		
		
		try {
			
			//**************************
			Thread.sleep(8000);
			WebElement el=driver.findElement(By.xpath("//a[@title='First Unit Prospect']"));
			clickElementJavaScript(el);
			System.out.println("clicked...on customer");
			//**************************
			Thread.sleep(8000);
			scrollToBottom();
			btn_Upload.sendKeys("C:\\Users\\yadavvi\\Desktop\\TestingData.txt");
			//setTextField(btn_Upload, "C:\\Users\\yadavvi\\Desktop\\TestingData.txt");
			Thread.sleep(8000);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	public void switchToAnotherTab() {
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent =  it.next();
		String child =it.next();
		System.out.println("parent.."+parent);
		System.out.println("child.."+child);
		//swtich to parent
		//driver.switchTo().window(parent);
		//System.out.println("Returned to parent");
		// switch to child 
		driver.switchTo().window(child);
		
	}
	
	public void logACallUnderAccountHistory() {
		int a=1400;
		scrollDownToPixel(a); 
		switchToFrame("06670000000QWTf");
		fluentWaitforElement(btn_LogACall);
		clickElement(btn_LogACall);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickOnFirstAccountRecord() {
		clickElement(lnk_AccountRecordFirst);
	}
	public void modifyCustomerName(String name) {
		
		clickElement(btn_CustomerEdit);
		//setTextField(txt_AccountName, name);
		WebElement eleq=driver.findElement(By.xpath("//label[text()='Account Name']/../following-sibling::td[1]//input"));
		eleq.sendKeys(name);
	}
	public void searchForCustomer(String customer) {
		
		WebElement lnk_Customer=driver.findElement(By.xpath("//a[text()='"+customer+"']"));
		if(lnk_Customer.isDisplayed()) {
			clickElement(lnk_Customer);
			
		}else {
			System.out.println("unable to search Customer account ["+customer+"]");
		}
	}
	public void deleteCustomer() {
		
		fluentWaitforElement(btn_CustomerDelete);
		if(btn_CustomerDelete.isDisplayed()) {
			btn_CustomerDelete.click();
			//clickElement(btn_CustomerDelete);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			handleAlertpopup();
			System.out.println("Customer account delete successfully ");
		}else {
			System.out.println("unable to delete Customer account ");
		}
	}
	public boolean validateCreatedProspect(String text) {
		
		System.out.println("Validate created Account"+text);
		boolean flag=false;
		try{
		fluentWaitforElement(driver.findElement(By.xpath("//span[text()='"+text+"']")));
		WebElement eleAccName=driver.findElement(By.xpath("//span[text()='"+text+"']"));
		if(eleAccName.isDisplayed()) {
			//reporter.log(LogStatus.PASS, "Prospect created successfully.."+text);
			flag=true;
			System.out.println("Customer account created successfully"+text);
		}
		}catch(Exception e){
			e.printStackTrace();
			//reporter.log(LogStatus.FAIL, "Unable to create Customer account."+text);
			System.out.println("Unable to create Customer account."+text);
		}
		return flag;
		
		
	}
	public void clickOn_Savebutton() {
		
		System.out.println("click on save button to create Customer account");
		clickElement(btn_Save);
	}
	
	public void clickOn_ContinueButton() {
		
		System.out.println("Click On Continue Button");
		clickElement(btn_Continue);
	}
	
	public boolean clickOn_NextButton() {
		boolean flag=false;
		
		System.out.println("Click on Next button");
		try{
		flag=clickElementJavaScript(btnPopUp_Next);
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	public boolean selectRecordType(String text) {
		
		boolean flag=false;
		System.out.println("Select record type from New Customer Pop Window: "+text+"]");
		try{
		flag=clickElementJavaScript(rdoBtn_G360Prospect);
		}catch(Exception e){
			System.out.println("Unable to select record type ["+text+"] "+e.getMessage());
		}
		return flag;
	}
	
	public String populateRequiredFieldToCreateProspect(String testCaseID) {
		
		System.out.println("Pupulate Required field to create a Customer prospect");
		String account_Name=null;
		try {
			String[] data=excelFactory.getExcelRowData("TestData",testCaseID);
			
			account_Name=data[3]+generateRandonNumber();
			setTextField(txtbox_AccountName, account_Name);
			setTextField(txtbox_Phone, data[4]);
			setTextField(txtbox_ContactEmail, data[5]);
			setTextField(txtbox_BillingStreet, data[6]);
			setTextField(txtbox_BillingCity, data[7]);
			setTextField(txtbox_BillingState, data[8]);
			setTextField(txtbox_BillingZip, data[9]);
			setTextField(txtbox_BillingCountry, data[10]);
			setTextField(txtbox_ShippingStreet, data[11]);
			setTextField(txtbox_ShippingCity, data[12]);
			setTextField(txtbox_ShippingState, data[13]);
			setTextField(txtbox_ShippingZip, data[14]);
			setTextField(txtbox_ShippingCountry, data[15]);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Prospect name is:"+account_Name);
			System.out.println(" Unable to Pupulate Required field to create a Customer prospect ");
			
		}
		return account_Name;
	}
	public void selectValueFromRecordTypeDropDown(String text) {
		
		System.out.println("Select value from Record type drop down list "+text+"]");
		selectValueFromDropDown(ddl_RecordType, text);
	}
	public void clickOn_NewButton() {
		
		System.out.println("click on New Button");
		parentWindow=driver.getWindowHandle();
		clickElement(btn_New);
		//ClickElementJavaScript(btn_New);
	}
	
	
	
	

}
