package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomSelectionPage extends BRBasePageObject {
	
	@FindBy(id = "selNumRooms")
	WebElement numRoomsDropDown;
	
	@FindBy(id = "numadts")
	WebElement numAdultsDropDown;
	
	@FindBy(name = "numchds")
	WebElement numChdsDropDown;
	
	@FindBy(id = "btnContinue")
	WebElement continueBtn;
		
	RoomSelectionPage(WebDriver driver, String env){
		super(driver, env);
	//	this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public PackageDetailsPage submitRoomForm(int numRooms, int numAdults, String numChild){
		this.selectDropDownByText(numRoomsDropDown, Integer.toString(numRooms));	
		this.selectDropDownByText(numAdultsDropDown, Integer.toString(numAdults));	
		this.selectDropDownByText(numChdsDropDown, numChild);		
		continueBtn.click();
		return new PackageDetailsPage(this.driver, env);
	} 

}
