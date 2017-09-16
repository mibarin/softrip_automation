package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReservationsPage extends BRBasePageObject {
	
	@FindBy(css = "div.col-md-3.col-sm-12.box1 > table > tbody > tr:nth-child(5) > td > a")
	WebElement newReservButton;
		
	public ReservationsPage(WebDriver driver, String env){
		super(driver, env);
	//	this.driver = driver;
		PageFactory.initElements(driver, this);
		this.moveWindowHandle();
	}	
	
    public ProductSearchPage goToProductSearch(){
    	newReservButton.click();
    	return new ProductSearchPage(driver, env);
    }

}
