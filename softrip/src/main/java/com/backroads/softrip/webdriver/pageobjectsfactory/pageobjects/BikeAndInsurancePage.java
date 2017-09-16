package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BikeAndInsurancePage extends BRBasePageObject {	
	
	@FindBy(css = "#main_form > div > div:nth-child(5) > div > input[type=\"button\"]")
	WebElement submitBtn;
	
	BikeAndInsurancePage(WebDriver driver, String env){
		super(driver, env);
		PageFactory.initElements(driver, this);		
	}
	
	public void selectTravelProtection(int nthPerson, boolean isInsNeeded){
		
		String rowID = "#insuranceoptions" + nthPerson;
	
		if(isInsNeeded){
			this.driver.findElement(By.id(rowID + " > table > table > tr > td > input")).click();
		} else {
			this.driver.findElement(By.id(rowID + " > table > table > tr:nth-of-type(2) > td > input")).click();			
		}		
	}
	
	public void selectTravelProtectionForAll(int numPerson, boolean isInsNeeded){		
		for(int i = 0; i < numPerson; i++){
			selectTravelProtection(i, isInsNeeded);
		}		
	}
	
	public ItineraryPage goToItinerary(){
		submitBtn.click();
		return new ItinreraryPage(this.driver, this.env)
	}	

}
