package com.test.pages;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.baseclass.BaseClass;

public class NotePage extends BaseClass {

	

	public NotePage() {
		PageFactory.initElements(driver, this);
	}

	String parentWindow=null;
	String childWindow=null;
	
	
	@FindBy(xpath="//input[@class='inputText notesTitle flexInput input']") private WebElement txtbox_NoteSubject;
	@FindBy(xpath="//div[@class='slds-rich-text-editor__textarea slds-grid ql-container']/div[1]") private WebElement txtbox_NoteDescription;
	@FindBy(xpath="//span[text()='Add to Records']") private WebElement btn_AddRecord;
	@FindBy(xpath="//div[@class='footerCmps ']//span[text()='Done']") private WebElement btn_Done;
	@FindBy(xpath="(//span[text()='Notes'])[1]/../../../../..//div[text()='New']") private WebElement btn_New_UnderNoteSection;
	
	public boolean clickOnDoneButton(){
		boolean flag=clickElement(btn_Done);
		return flag;
	}
	public boolean clickOnAddRecordButton(){
		boolean flag=clickElement(btn_AddRecord);
		return flag;
		
	}
	public boolean enterNoteDescription(String text){
		System.out.println("enter note description");
		
		boolean flag=setTextField(txtbox_NoteDescription, text);
		
		
		return flag;
	}
	
	public boolean enterSubjectOfNote(String text){
		System.out.println("enter note description");
		
		boolean flag=setTextField(txtbox_NoteSubject, text);
		
		
		return flag;
	}
	
}
