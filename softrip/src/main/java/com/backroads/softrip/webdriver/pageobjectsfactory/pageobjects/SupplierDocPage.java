package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.backroads.softrip.webdriver.common.url.UrlBuilder;

public class SupplierDocPage extends BasePageObject {
	
	@FindBy(css = "#searchfields > div:nth-child(1) > label")
	WebElement supplierIDLabel;
	
	private WebDriverWait wait;
	private static final int TIMEOUT = 60;
	private String supplierIDLabelTest = "Supplier ID:";
	
	public SupplierDocPage(WebDriver driver, String env){
		super(driver, env);
	//	this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, TIMEOUT);
		wait.until(ExpectedConditions.visibilityOf(supplierIDLabel));
	}	
	
	public SupplierDocPage(WebDriver driver, String env, UrlBuilder ub){
		super(driver, env, ub);
	//	this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, TIMEOUT);
		wait.until(ExpectedConditions.visibilityOf(supplierIDLabel));
	}	
}
