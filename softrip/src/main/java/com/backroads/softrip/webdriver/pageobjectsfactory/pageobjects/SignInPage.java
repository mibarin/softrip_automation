package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

//import com.backroads..webdriver.common.core.element.Wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BRBasePageObject {
	
	@FindBy(id = "txtlogin")
	private WebElement loginField;
	@FindBy(id = "loginPasswordIn")
	private WebElement psswdField;
	@FindBy(id = "btnlogin")
//	@FindBy(css = "#btnlogin > span:nth-child(2)")
	private WebElement loginBtn;
	
//	private WebDriver driver;
//	private static final String pageURL = "http://softrip.backroads.com/uat/softripnext/#/common/login";
//	private WebDriverWait waitFor;
//	private static final int TIMEOUT = 30;
	
	public SignInPage(WebDriver driver, String env){
		super(driver, env);
	//	waitFor = new WebDriverWait(driver, TIMEOUT);
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String strUname){
		this.waitFor.until(ExpectedConditions.visibilityOf(loginField));
		loginField.sendKeys(strUname);
	}
	
	public void setPassword(String strPassword){
		this.waitFor.until(ExpectedConditions.visibilityOf(psswdField));
		psswdField.sendKeys(strPassword);
	}
	
	public void clickLoginBtn() throws InterruptedException{
		this.jsExecutorClick(loginBtn);
	}
	
	public CalendarPage loginToSoftrip(String strUname, String strPassword, String env) throws InterruptedException{		
		setUserName(strUname);
		setPassword(strPassword);
		clickLoginBtn();
		return new CalendarPage(this.driver, env);
	}
	
}
