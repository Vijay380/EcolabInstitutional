package com.test.baseclass;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.test.utility.GetPropertiesData;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	String parentWindow=null;
	String childWindow=null;
	
	
	public void launchBrowser() throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.get(GetPropertiesData.getPropertyValue("uaturl"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void deleteReport(File element) {
		
		 File[] f1=element.listFiles(); 
		 int l1=f1.length;
		 System.out.println(l1);
		 
		 for(int i=0;i<f1.length-1;i++){
			 System.out.println(f1[i].getName());
			 f1[i].delete();
		 }
		
	}
	public void getCurrentDate() {
		
		//reporter.log(LogStatus.INFO, "Get Current Date and Time ");
		System.out.println("Get Current Date and Time "); 
		DateFormat dateFormat=null;
		Date date=null;
		String date1=null;
		try {
			dateFormat= new SimpleDateFormat("MM/dd/yyyy ");
			date = new Date();
			date1=dateFormat.format(date);
			System.out.println(date1);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		 
	}
	public boolean switchToParentWindow() {
		boolean flag=false;
		try{
		
		System.out.println("Switch to Parent Window");
		if(parentWindow!=null) {
			driver.switchTo().window(parentWindow);
			flag=true;
			//reporter.log(LogStatus.PASS, "Successfully switched to Parent window ["+parent+"]");
			System.out.println("Successfully switched to Parent window ["+parentWindow+"]");
		}
		}catch(Exception e){
			//reporter.log(LogStatus.FAIL, "Unable to  switch to Parent window ["+parent+"]");
			System.out.println("Unable to  switch to Parent window ["+parentWindow+"]");
		}
		return flag;
	}
	
	public boolean switchToChildWindow() {
		boolean flag=false;
		
		System.out.println("Switch to Child Window ");
		try {
			childWindow=driver.getWindowHandle();
			if(childWindow!=null) {
				driver.switchTo().window(childWindow);
				//reporter.log(LogStatus.PASS, "Successfully switched to child window ["+childWindow+"]");
				flag=true;
				System.out.println("Successfully switched to child window ["+childWindow+"]" );
			}
		}catch(Exception e) {
			e.printStackTrace();
			//reporter.log(LogStatus.FAIL, "Unable to switch to child window ["+childWindow+"]");
			System.out.println("Unable to switch to child window ["+childWindow+"] " +e.getMessage());
		}
		return flag;
	}
	public void switchToFrame(String frameId) {
		
		try {
			driver.switchTo().frame(frameId);
			System.out.println("Successfully switched to Frame.. ["+frameId+"]");
		} catch (Exception e) {
			e.printStackTrace();
			
			System.out.println("Unable to switch to Frame.. ["+frameId+"]");
		}
	}
	public void waitForLoadingElement(WebElement loadingElement){
		
		
		System.out.println("Waiting for Loading element ["+loadingElement+"] to be completed");
		try{
			int count=0;
			while(loadingElement.isDisplayed()){
				Thread.sleep(8000);
				count++;
				if(count==10){
					
					System.out.println("Waiting for Loading element ["+loadingElement+"] is failed");
				}
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public void scrollToElement(WebElement element){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println("scrolled to "+element+" web element");
	} 
	public void scrollDownToPixel(int pixel) {
		try{
			Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+pixel+")", "");
		}catch(Exception e){
			System.out.println("Unable to scroll down to reach to webelement");
		}
	}
	public void scrollToBottom(){
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			System.out.println("Successfully scrolled to bottom");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void scrollToTop(){
		
		JavascriptExecutor jse6 = (JavascriptExecutor)driver;
		jse6.executeScript("scroll(900,0)");
		
	}
	@SuppressWarnings("deprecation")
	public boolean fluentWaitforElement(WebElement element) {
		boolean flag=false;
		try{
		
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS)
	        .pollingEvery(2, TimeUnit.SECONDS)
	        .ignoring(NoSuchElementException.class, TimeoutException.class).ignoring(StaleElementReferenceException.class);
		
	    for (int i = 0; i < 3; i++) {
		        fWait.until(ExpectedConditions.elementToBeClickable(element));
	        	System.out.println("Element Not found trying again - " + element.toString().substring(30));
	        	if(element.isDisplayed()){
	        		flag=true;
	        		break;
	        	}
	    }
		}catch(Exception e){
			//Assert.assertTrue(false, " Unable to locate webelement ["+element+"]");
			System.out.println("Unable to locate element ["+element+"]  "+e.getMessage());
		}
	    return flag;
	}
	
	public void handleAlertpopup() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		}
	public boolean setTextField(WebElement ele,String text) {
		
		boolean flag=fluentWaitforElement(ele);
		if(flag==true){
			ele.click();
			ele.clear();
			ele.sendKeys(text);
			System.out.println("Successfully set ["+text+"] value to ["+ele+"] ");
		}
		return flag;
	}
	public int generateRandonNumber() {
		int rand_int=0;
		  Random rand = new Random(); 
	      rand_int = rand.nextInt(100);
		  return rand_int; 
	}
	public void selectValueFromDynamicDropDown() {
		
		
	}
	public void selectValueFromDropDown(WebElement ele,String text) {
		System.out.println("lead....status");
		
		fluentWaitforElement(ele);
		if(ele.isDisplayed()) {
			Select sel=new Select(ele);
			sel.selectByVisibleText(text);
			
			System.out.println("value ["+text+"] selected from drop down..["+ele+"]");
		}else {
			
			System.out.println("Unable to select value["+text+"] from drop down..["+ele+"]");
		}
	}
	public boolean clickElementByActionsClass(WebElement ele) {
		
		boolean flag=false;
		try {
			Thread.sleep(5000);
			Actions act=new Actions(driver);
			act.moveToElement(ele).click().build().perform();
			//reporter.log(LogStatus.PASS, "<font color=\"green\"><h6><b> successfully Clicked on </b></h6></font> <font color=\"black\"><h6><b> ["+ele+"] </b></h6></font> <font color=\"green\"><h6><b>Web Element </b></h6></font>");
			System.out.println("successfully Clicked on ["+ele+"] Web Element ");
			flag=true;
		}catch(Exception e) {
			flag=false;
			
			//reporter.log(LogStatus.FAIL, "<font color=\"red\"><h6><b> Unable to Click on </b></h6></font> <font color=\"Alloy orange\"><h6><b> ["+ele+"] </b> </h6> </font> <font color=\"green\"><h6><b>Web Element </b></h6></font>");
			System.out.println("Unable to Click on  ["+ele+"] Web Element ");
			e.printStackTrace();
		}
		return flag;
						
	}
	public boolean clickElement(WebElement ele) {
		boolean flag=false;
			try{
			
			flag=fluentWaitforElement(ele);
			if(flag==true){
				ele.click();
				//reporter.log(LogStatus.PASS, "<font color=\"green\"><h6><b> successfully Clicked on </b></h6></font> <font color=\"black\"><h6><b> ["+ele+"] </b></h6></font> <font color=\"green\"><h6><b>Web Element </b></h6></font>");
				System.out.println("successfully Clicked on ["+ele+"] Web Element ");
			}
			
			
			}catch(Exception e){
				System.out.println("unable to Click on ["+ele+"] Web Element ");
			}
		return flag;
		
	}
	public boolean clickElementJavaScript(WebElement ele) {
		
		boolean flag=false;
		try{
		flag= fluentWaitforElement(ele);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		js.executeScript("arguments[0].click();", ele);
		//reporter.log(LogStatus.PASS, "<font color=\"green\"><h6><b> successfully Clicked on </b></h6></font> <font color=\"black\"><h6><b> ["+ele+"] </b></h6></font> <font color=\"green\"><h6><b>Web Element </b></h6></font>");
		System.out.println("successfully Clicked on ["+ele+"] Web Element ");
		}catch(Exception e){
			System.out.println("unable to click on ["+ele+"] Web Element by Javascript "+e.getMessage());
		}
		return flag;
	}
	public boolean waitForURL(String expURL) {
		
		boolean flag=false;
		try {
			WebDriverWait wait=new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.urlContains(expURL));
			flag=true;
		} catch (Exception e) {
			System.out.println("waited for 2 minutes to appear "+expURL+" URL "+e.getMessage());
		}
		return flag;
	}
	
	public boolean validateURL(String url) {
		boolean value=waitForURL(url);
		
		
		try {
			
			if(value==true) {
				
				System.out.println("Successfully navigated to ["+url+"] page.");
			}
			
		}catch(Exception e) {
			
			System.out.println("Unable to navigate to ["+url+"] page.");
			
		}
		
		return value;
	}
	public void enlargeBrowser() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("browser is maximized now");
	}
	
}