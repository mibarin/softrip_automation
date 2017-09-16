package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductSearchPage extends BRBasePageObject {
	
	@FindBy(css = "#advanced-pill > a")
	WebElement advancedTab;
	
	@FindBy(id = "Request_DepartureDateFromCriteria")
	WebElement deptDateFrom;
	
	@FindBy(id = "Request_DepartureDateToCriteria")
	WebElement deptDateTo;
	
	@FindBy(name = "Request.SaleStatusCriteria")
    WebElement saleStatus;
	
	@FindBy(id = "searchSubmit")
	WebElement searchBtn;
	
	@FindBy(id = "searchResults")
	public WebElement searchResultsPane;
	
	@FindBy(css = "#resultsTable > tr:result-row:nth-of-type(1)")
	WebElement resultFirstRow;
	
	@FindBy(id = "btnBook")
	WebElement bookBtn;
	
	
	String saleStatusClosed = "Closed";
	String saleStatusInternal = "Internal";
	String saleStatusNoDisplay = "No Display";
	String saleStatusOpen = "Open";
	String saleStatusSoldOut = "Sold Out";
	
	
	public ProductSearchPage(WebDriver driver, String env){
		super(driver, env);
	//	this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickAdvancedTab(){
		this.waitFor.until(ExpectedConditions.visibilityOf(advancedTab));
		advancedTab.click();
	}
	
	public void InputDeptDateFrom(String date){
		this.waitFor.until(ExpectedConditions.visibilityOf(deptDateFrom));
		this.jsExecutorSendKeys(deptDateFrom, date);
	}
	
    public void InputDeptDateTo(String date){
		this.waitFor.until(ExpectedConditions.visibilityOf(deptDateTo));
		this.jsExecutorSendKeys(deptDateTo, date);		
	}
	
	public void SelectDropDown(String item){		
		this.waitFor.until(ExpectedConditions.visibilityOf(advancedTab));
		this.SelectDropDown(item);	
	}
		
    public RoomSelectionPage SelectFirstFoundItem(){
    	
    	try {
    		if(this.fluentWaitMethod(searchResultsPane)){
    			resultFirstRow.click();
    		    bookBtn.click();
    		    return new RoomSelectionPage(this.driver, this.env);
    		} 
    	} catch (Exception e){
    		System.out.println("Failed to click first row or book button");
    	}
		return null;
    }
    
    public void doSearch(){
    	this.waitFor.until(ExpectedConditions.visibilityOf(bookBtn));
    	bookBtn.click();
    }
    
	
}
