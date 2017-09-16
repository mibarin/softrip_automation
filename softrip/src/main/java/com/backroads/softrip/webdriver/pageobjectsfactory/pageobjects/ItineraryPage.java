package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ItineraryPage extends BRBasePageObject {
	
	@FindBy(css = "#main_form > div > div:nth-child(2) > table.box3-row > tbody > tr:nth-child(4) > td:nth-child(6) > font > b")
	WebElement depositDue;

	@FindBy(css = "#main_form > div > div:nth-child(2) > table.box3-row > tbody > tr:nth-child(5) > td:nth-child(6) > b")
	WebElement totalDue;
	
	@FindBy(css = "#main_form > div > div:nth-child(2) > table.box3-row > tbody > tr:nth-child(4) > td:nth-child(4) > font > b")
	WebElement depositDueDate;
	
	@FindBy(css = "#main_form > div > div:nth-child(3) > ul.CartWarnings > li")
	WebElement messageFirstRow;
	
	ItineraryPage(WebDriver driver, String env){
		super(driver, env);
	    PageFactory.initElements(driver, this);
    }
	
	public void acceptAlert(){
		this.driver.switchTo().alert().accept();
	}

	public int getDepositDue(){
		this.waitFor.until(ExpectedConditions.visibilityOf(depositDue));		
		return Integer.parseInt(depositDue.getText());
	}
	
	public int getTotalDue(){
		this.waitFor.until(ExpectedConditions.visibilityOf(totalDue));		
		return Integer.parseInt(totalDue.getText());
	}
	
	public String getFirstMessage(){
		this.waitFor.until(ExpectedConditions.visibilityOf(messageFirstRow));		
		return messageFirstRow.getText();
	}
	
}
