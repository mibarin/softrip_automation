package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test {
	
	private SignInPage sin;	
	private CalendarPage cp;
	
	private WebDriver driver;
	private String strUname = "akikom";
	private String strPassword = "801cedar";
	//private static final String pageURL = "http://softrip.backroads.com/uat/softripnext/#/common/login";
	private static final String env = "UAT";
	private SupplierDocPage sdp;
	
	
	@BeforeClass
	public void SetUp(){	
//		System.setProperty("webdriver.ie.driver", "C:\\webdriver\\IEDriverServer.exe");
//		DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
//		ieCaps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, ub.getLoginPageUrl());
//		driver = new InternetExplorerDriver(ieCaps);	
		driver.manage().deleteAllCookies();
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		sin = new SignInPage(driver, env);						
	}
	
	@Test(priority = 1)
	public void loginTest() throws InterruptedException{
		cp = sin.loginToSoftrip(strUname, strPassword, env);		
	}
	
/*	
	@Test(priority = 2)
	public void navigateSupplier() throws InterruptedException{
		sdp = cp.navigateToSupplierDocPage();	
	}
	
//	@Test(priority = 3)
//	public void logOut () {
//		sdp.LogOut();
//	}
 
 */
	@AfterClass
	public void TearDown(){
//		sdp.LogOut();
		driver.quit();
	}


}
