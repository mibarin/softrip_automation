package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactBillingInfoPage extends BRBasePageObject {
	
	@FindBy(id = "txtsearchlastname")
	WebElement lastNameField;

	@FindBy(id = "txtsearchfirstname")
	WebElement firstNameField;
	
	@FindBy(id = "txtsearchemail")
	WebElement emailField;
	
	@FindBy(name = "btnSearch")
	WebElement searchBtn;
	
	ContactBillingInfoPage(WebDriver driver, String env){
		super(driver, env);
		PageFactory.initElements(driver, this);
	}
	
	public FinalConfirmationPage goToFinalConfByEmail(String email){
		this.waitFor.until(ExpectedConditions.visibilityOf(emailField));
		emailField.sendKeys(email);
		searchBtn.click();		
		return new FinalConfirmationPage(this.driver, this.env);	
	}
	
}
