package com.test.pages;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.baseclass.BaseClass;

public class TaskPage extends BaseClass {

	

	public TaskPage() {
		PageFactory.initElements(driver, this);
	}

	String parentWindow=null;
	String childWindow=null;
	
	
	
	@FindBy(xpath="//span[text()='New Task']") private WebElement btn_NewTask;
	@FindBy(xpath="//span[text()='Next']") private WebElement btn_Next;
	@FindBy(xpath="(//input[@role='textbox'])[2]") private WebElement txtboxSubject;
	@FindBy(xpath="(//span[text()='Move selection to Chosen'])[2]") private WebElement arrowChosen;
	@FindBy(xpath="(//span[text()='Save'])[2]") private WebElement btn_Save;
	
	public boolean clickOnSaveButton(){
		System.out.println("click on save button");
		boolean flag=false;
		scrollDownToPixel(550);
		//boolean flag=clickElement(btn_Save);
		List<WebElement> savebtns=driver.findElements(By.xpath("//span[text()='Save']"));
		System.out.println("Total save buttons:"+savebtns.size());
		for(int i=0;i<savebtns.size();i++){
			if(savebtns.get(i).isDisplayed() && savebtns.get(i).isEnabled()){
				//savebtns.get(i).click();
				clickElement(savebtns.get(i));
				flag=true;
				System.out.println("Successfully clicked on save button");
				break;
			}
		}
		return flag;
	}
	public boolean selectProgram(String text){
		System.out.println("Select program type");
		WebElement ele=driver.findElement(By.xpath("//span[text()='"+text+"']"));
		clickElement(ele);
		boolean flag=clickElement(arrowChosen);
		
		return flag;
		
	}
	public boolean enterTaskSubject(String text){
		System.out.println("Enter Task subject");
		boolean flag=setTextField(txtboxSubject, text);
		return flag;
		
	}
	public boolean clickOnNextButton(){
		System.out.println("click on next button");
		boolean flag=clickElement(btn_Next);
		return flag;
	}
	public boolean clickOnNewTaskButton(){
		System.out.println("click on new task button");
		
		boolean flag=clickElementJavaScript(btn_NewTask);
		return flag;
	}
		
}
