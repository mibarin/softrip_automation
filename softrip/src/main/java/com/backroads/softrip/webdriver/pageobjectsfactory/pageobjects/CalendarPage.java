package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarPage extends BRBasePageObject {
	
	/** Use Cases to be implemented
	 * Create a task and assign it to a user
	 * Add Task can load all users.
	 * Add Memo can look up reservation number and related info
	 * Add Memo can look up 
	*/
	@FindBy(id = "caluserselectAuto")
	private WebElement userField;
	@FindBy(id = "caluserselectAuto0")
	private WebElement userFieldDropDownBtn;
	@FindBy(id ="currenttimezone")
	private WebElement timeZoneTextElem;
	
	private String timeZoneText = "America/Los_Angeles";	
	private WebDriverWait wait;
	private static final int TIMEOUT = 60;	

	public CalendarPage(WebDriver driver, String env){
		super(driver, env);
	//	this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, TIMEOUT);
		wait.until(ExpectedConditions.textToBePresentInElement(timeZoneTextElem, timeZoneText));
	}	

	
}
