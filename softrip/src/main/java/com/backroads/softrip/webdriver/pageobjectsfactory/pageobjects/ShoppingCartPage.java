package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShoppingCartPage extends BRBasePageObject {
	
	@FindBy(name = "btnContinue")
	WebElement continueBtn;
	
	ShoppingCartPage(WebDriver driver, String env){
		super(driver, env);
		PageFactory.initElements(driver, this);
	}
	
	public ContactBillingInfoPage goToFinalConf(){
		this.waitFor.until(ExpectedConditions.visibilityOf(continueBtn));
		continueBtn.click();
		return new ContactBillingInfoPage(this.driver, this.env);		
	}
		
}
