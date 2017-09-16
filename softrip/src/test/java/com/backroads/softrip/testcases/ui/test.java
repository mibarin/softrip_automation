package com.backroads.softrip.testcases.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.backroads.softrip.webdriver.common.datalprovider.DataProviderSource;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.CalendarPage;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.ContactBillingInfoPage;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.PackageDetailsPage;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.ProductSearchPage;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.ReservationsPage;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.RoomSelectionPage;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.ShoppingCartPage;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.SignInPage;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.SupplierDataEntryPage;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.SupplierDocPage;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.SuppliersPage;


public class test {
	
	private SignInPage sin;	
	private CalendarPage cp;
	
	private WebDriver driver;
	private String strUname = "akikom";
	private String strPassword = "801cedar";
	//private static final String pageURL = "http://softrip.backroads.com/uat/softripnext/#/common/login";
	private static final String env = "UAT";
	private SupplierDocPage sdp;
	private SuppliersPage sp;
	private SupplierDataEntryPage sde;	
	private ReservationsPage res;
	private ProductSearchPage psp;
	private RoomSelectionPage rsp;
	private PackageDetailsPage pdp;
	private ShoppingCartPage scp;
	private ContactBillingInfoPage cbip;
	
	@BeforeClass
	public void SetUp(){	
//		System.setProperty("webdriver.ie.driver", "C:\\webdriver\\IEDriverServer.exe");
//		DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
//		ieCaps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, ub.getLoginPageUrl());
//		driver = new InternetExplorerDriver(ieCaps);
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("test-type");
//		options.addArguments("start-maximized");
//		options.addArguments("--js-flags=--expose-gc");  
//		options.addArguments("--enable-precise-memory-info"); 
//		options.addArguments("--disable-popup-blocking");
//		options.addArguments("--disable-default-apps");
//		options.addArguments("test-type=browser");
//		options.addArguments("disable-infobars");
//		driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		sin = new SignInPage(driver, env);	
		driver.get(sin.ub.buildUrl("LOGIN"));				
//		driver.manage().window().setSize(new Dimension(1024,937));			
//		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1)
	public void loginTest() throws InterruptedException{
		cp = sin.loginToSoftrip(strUname, strPassword, env);		
	}

	/*
	@Test(priority = 2, dataProvider = "SupplierInfo_TorreDelRemei", dataProviderClass=DataProviderSource.class)
	public void suppliersContactWorkflow_56630(String [] inputs) throws InterruptedException{
		sp = cp.navigateToSupplierPage2();
	    sp.doSearch(inputs[0]);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    sp.clickNavigationTab();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    sp.clickFirstItem();
	    sde = sp.clickEditBtn();
	    sde.makeVoucherContactEntry(inputs[1]);
	    sde.makeVoucherPhoneEntry(inputs[2]);
	    sde.makeVoucherFaxEntry(inputs[3]);
	    sde.makeVoucherEmailEntry(inputs[4]);
	    
	    sde.makeOpsContactEntry(inputs[1]);
	    sde.makeOpsPhoneEntry(inputs[2]);
	    sde.makeOpsFaxEntry(inputs[3]);
	    sde.makeOpsEmailEntry(inputs[4]);
	    
	    sde.makeTourContactEntry(inputs[1]);
	    sde.makeTourPhoneEntry(inputs[2]);
	    sde.makeTourFaxEntry(inputs[3]);
	    sde.makeTourEmailEntry(inputs[4]);
	    
	    sde.makeGroupContactEntry(inputs[1]);
	    sde.makeGroupPhoneEntry(inputs[2]);
	    sde.makeGroupFaxEntry(inputs[3]);
	    sde.makeGroupEmailEntry(inputs[4]);
	    
	    sde.makeAcctContactEntry(inputs[1]);
	    sde.makeAcctPhoneEntry(inputs[2]);
	    sde.makeAcctFaxEntry(inputs[3]);
	    sde.makeAcctEmailEntry(inputs[4]);
	    
	    sde.makeContractContactEntry(inputs[1]);
	    sde.makeContractPhoneEntry(inputs[2]);
	    sde.makeContractFaxEntry(inputs[3]);
	    sde.makeContractEmailEntry(inputs[4]);
	    sde.clickSaveBtn();	    

	    sp.clickSearchTab();
	    sp.doSearch(inputs[0]);
	    sp.clickFirstItemExpandBtn();
	}	

	
	@Test(priority = 3)
	public void navigateSupplier() throws InterruptedException{
		sdp = cp.navigateToSupplierDocPage();
		
	}	
	*/
	
	@Test
	public void simpleReservationFlow(){
	
		res = cp.moveToReservations();
		psp = res.goToProductSearch();
		psp.ClickAdvancedTab();
		psp.InputDeptDateFrom("1 Nov 2017");
		psp.InputDeptDateTo("1 Jan 2018");
		rsp = psp.SelectFirstFoundItem();
		Assert.assertNotNull(rsp);
	    pdp = rsp.submitRoomForm(1, 2, "--");
	    scp = pdp.goToShoppingCartPage();
	    cbip = scp.goToFinalConf();
	    
	}

	
//	@Test(priority = 3)
//	public void logOut () {
//		sdp.LogOut();
//	}
	@AfterClass
	public void TearDown(){
	//	sdp.LogOut();
	//	driver.quit();
	}


}
