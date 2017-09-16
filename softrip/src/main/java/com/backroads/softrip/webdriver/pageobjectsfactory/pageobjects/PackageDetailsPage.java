package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PackageDetailsPage extends BRBasePageObject {
	
	@FindBy(css = "#SeqResultsTable > tbody > tr:nth-child(5) > td > input:nth-child(10)")
	WebElement bookBtn;
	
	PackageDetailsPage(WebDriver driver, String env){
		super(driver, env);
	//	this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	public ShoppingCartPage goToShoppingCartPage(){
		this.waitFor.until(ExpectedConditions.visibilityOf(bookBtn));
		bookBtn.click();
		return new ShoppingCartPage(this.driver, this.env);
	}	
	
}
