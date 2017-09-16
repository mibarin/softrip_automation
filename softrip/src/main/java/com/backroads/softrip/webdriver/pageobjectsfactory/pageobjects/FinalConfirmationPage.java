package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FinalConfirmationPage extends BRBasePageObject {
	
	@FindBy(id = "btnconfirm")
	WebElement continueBtn;
	
	@FindBy(id = "txtfirst2")
	WebElement firstNameGuest2;
	
	@FindBy(id = "txtlast2")
	WebElement lastNameGuest2;	
		
	FinalConfirmationPage(WebDriver driver, String env){
		super(driver, env);
		PageFactory.initElements(driver, this);
	}
	
	public BikeAndInsurancePage goToFinalConf(String fName, String lName){
		this.waitFor.until(ExpectedConditions.visibilityOf(firstNameGuest2));
		firstNameGuest2.sendKeys(fName);
		firstNameGuest2.sendKeys(lName);
		return new BikeAndInsurancePage(this.driver, this.env);		
	}
	
}
