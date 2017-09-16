package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuppliersPage extends BRBasePageObject {
	
    @FindBy(id = "searchSupplierName")
	protected WebElement supplierName;
    
    @FindBy(css = "#suppliertab>label")
    protected WebElement supplierTab;
    
    @FindBy(id = "btnSearch")
    protected WebElement searchBtn;
    
    @FindBy(id = "navigationtab")
    protected WebElement menuTab;
    
    @FindBy(css = "#items > supplier-node > div > div")
    protected WebElement firstElement;
    
    @FindBy(css = "#items > supplier-node > div >  div > div > div > div:nth-of-type(3) > button")
    protected WebElement firstElementBtn;
    
    @FindBy(id = "supAll-edit")
    protected WebElement editBtn;
    
    @FindBy(css = "#handle > ul > li:nth-of-type(1)")
    protected WebElement searchTab;
     
    
	public SuppliersPage(WebDriver driver, String env){
		super(driver, env);
	//	this.driver = driver;
		PageFactory.initElements(driver, this);
		this.moveWindowHandle();
	}	
	
	public void typeInSupplierName(String s){
		this.waitFor.until(ExpectedConditions.visibilityOf(supplierName));
		supplierName.clear();
		supplierName.sendKeys(s);
	}
	
	public void clickSupplierTab(){
		this.waitFor.until(ExpectedConditions.visibilityOf(supplierTab));
		supplierTab.click();
		//this.jsExecutorClick(supplierTab);
	}
	
	public void clickFirstItem(){
		this.waitFor.until(ExpectedConditions.visibilityOf(firstElement));
		this.jsExecutorClick(firstElement);		
	}
	
	public SupplierDataEntryPage clickEditBtn(){
		this.waitFor.until(ExpectedConditions.visibilityOf(editBtn));
		this.jsExecutorClick(editBtn);		
		return new SupplierDataEntryPage(this.driver, this.env);	
	}
		
	public void doSearch(String s){
		typeInSupplierName(s);
		this.jsExecutorClick(searchBtn);		
	}
	
	public void clickNavigationTab(){
		this.jsExecutorClick(menuTab);
	}
	
	public void clickSearchTab(){
		this.jsExecutorClick(searchTab);
	}
	
	public void clickFirstItemExpandBtn(){
		this.jsExecutorClick(firstElementBtn);
	}
	

	
}
