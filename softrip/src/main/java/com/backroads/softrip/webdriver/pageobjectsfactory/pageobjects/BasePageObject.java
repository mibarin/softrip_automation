package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class BasePageObject {

	public WebDriver driver;
	public WebDriverWait waitFor;
	public Wait<WebDriver> fluentWait;
	public Actions builder;
	private int timeOut = 30;
	private int pollingTime = 5;
	public Select select;

	public BasePageObject(WebDriver driver) {

		this.waitFor = new WebDriverWait(driver, timeOut);
		this.fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(timeOut,TimeUnit.SECONDS)
				.pollingEvery(pollingTime, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		this.builder = new Actions(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void jsExecutorClick(WebElement e){
		JavascriptExecutor executor = (JavascriptExecutor)this.driver;
		executor.executeScript("arguments[0].click()", e);	  
	}
	
	public void jsExecutorSendKeys(WebElement e, String s){
		JavascriptExecutor executor = (JavascriptExecutor)this.driver;
		executor.executeScript("arguments[0].value='" + s + "'", e);	  
	}
	
	public void moveWindowHandle(){
		String parentHandle = driver.getWindowHandle(); 
//		String [] windowTexts = new String[2];
		Set s = driver.getWindowHandles();
		Iterator ite = s.iterator();
		
		while(ite.hasNext()){
			String anotherWinHandle = ite.next().toString();
			if(!anotherWinHandle.contains(parentHandle)) {
				driver.switchTo().window(anotherWinHandle);				
			}
		}
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	    windowTexts[0] = termsWindowHeader.getText();
//	    windowTexts[1] = termsWindowText.getText();
 		
//		driver.close(); // close newly opened window when done with it
//		driver.switchTo().window(parentHandle); // switch back to the original window'
					
	}
	
	public void jsExecutorscrollWindowTo(WebElement e){
		JavascriptExecutor executor = (JavascriptExecutor)this.driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", e);	  		
	}
	
	public void jsExecutorscrollDown(){
		JavascriptExecutor executor = (JavascriptExecutor)this.driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");		
	}
	
	public void selectDropDownByText(WebElement dropdown, String text){
		this.select = new Select(dropdown);
		select.selectByVisibleText(text);	
	}
	
	public Boolean fluentWaitMethod(WebElement e){
		Boolean checkIfDisplayed = this.fluentWait.until(new Function<WebDriver, Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return e.isDisplayed();
			}
	    });			
		return checkIfDisplayed;
	}

	
	
		
}
