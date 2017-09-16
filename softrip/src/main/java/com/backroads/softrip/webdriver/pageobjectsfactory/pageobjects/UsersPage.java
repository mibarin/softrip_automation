package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends BasePageObject {
	
	public UsersPage(WebDriver driver, String env){
		super(driver, env);
	//	this.driver = driver;
		PageFactory.initElements(driver, this);
	}	

}
