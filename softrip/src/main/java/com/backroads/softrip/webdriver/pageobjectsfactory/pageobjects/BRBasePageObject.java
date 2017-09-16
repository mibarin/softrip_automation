package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.backroads.softrip.webdriver.common.url.UrlBuilder;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.SignInPage;
import com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects.SuppliersPage;

public class BRBasePageObject extends BasePageObject {

	//protected WebDriver driver;
	//protected WebDriverWait waitFor;
	//protected Actions builder;
	//protected int timeOut = 20;
	public String env;

	public UrlBuilder ub = new UrlBuilder();
	
	@FindBy(css = "#navigationOptions > nav-route-list > ul > li:nth-child(1) > a")
	protected WebElement home;

	@FindBy(css = "#navigationOptions > nav-route-list > ul > li:nth-child(1) > div > nested-menu > div > ul > nested-menu-item:nth-child(1) > li > a")
	protected WebElement dashboard;
	
	@FindBy(css = "#navigationOptions > nav-route-list > ul > li:nth-child(2) > a")
	protected WebElement reservations;

	//product - suppliers, supplier docs, products, projects, Tasks/Services, Hotel Requests
	@FindBy(css = "#navigationOptions > nav-route-list > ul > li:nth-child(4) > a")
	protected WebElement product;

	@FindBy(css = "#navigationOptions > nav-route-list > ul > li:nth-child(4) > div > nested-menu > div > ul > nested-menu-item:nth-child(1) > li > a")
	protected WebElement suppliers;

	@FindBy(css = "#navigationOptions > nav-route-list > ul > li:nth-child(4) > div > nested-menu > div > ul > nested-menu-item:nth-child(1) > li > nested-menu > div > ul > nested-menu-item:nth-child(1) > li > a")
	protected WebElement suppliers2;  

	@FindBy(css = "#navigationOptions > nav-route-list > ul > li:nth-child(4) > div > nested-menu > div > ul > nested-menu-item:nth-child(1) > li > nested-menu > div > ul > nested-menu-item:nth-child(9) > li > a")
	protected WebElement supplierDoc;

	@FindBy(css = "#navUserButton > span.username.style-scope.nav-bar")
	protected WebElement userNameDropDown;

	@FindBy(linkText = "Log out")
	protected WebElement logOutLink;
	
	
	public BRBasePageObject(WebDriver driver, String env) {
		super(driver);

	//    this.waitFor = new WebDriverWait(driver, timeOut);
	    //this.builder = new Actions(driver);
	    ub.setTestEnv(env);	    
	    this.env = env;
//	    PageFactory.initElements(driver, this);
	}
	
	public void moveToProduct(){
		product.click();
	}
	
	public ReservationsPage moveToReservations(){
		reservations.click();
		return new ReservationsPage(driver, env);
	}

	private void mouseOverToProduct(){
		builder.moveToElement(product).build().perform();	  
	}

	private void mouseOverToSuppliers(){
		this.jsExecutorClick(suppliers);
		this.jsExecutorClick(suppliers2);
	}

	private void clickSupplierDoc(){
		supplierDoc.click();	  
	}

	public SignInPage LogOut(){
		waitFor.until(ExpectedConditions.elementToBeClickable(userNameDropDown));
		userNameDropDown.click();
		logOutLink.click();
		return new SignInPage(driver, ub.getTestEnv());
	}

	public void navigateToPage(String pageName){	  
		driver.get(ub.buildUrl(pageName));	  
	}  
/*
	public SupplierDocPage navigateToSupplierDocPage() {
		//   does not work so just get the 
		//		  mouseOverToProduct();
		//		  mouseOverToSuppliers();
		//		  clickSupplierDoc();
		navigateToPage("SUPPLIERDOCS");

		return new SupplierDocPage(driver, env, ub);
	}
*/
	
	public SuppliersPage navigateToSupplierPage(){
		navigateToPage("SUPPLIERS");
		return new SuppliersPage(driver, env);
	}

	public SuppliersPage navigateToSupplierPage2(){
		mouseOverToSuppliers();
		return new SuppliersPage(driver, this.env);
	}
	
//	public 
	
	
/*
	public CompDirectoryPage navigateToCompDirPage(){
		navigateToPage("COMPDIRECTORY");
		return new CompDirectoryPage(driver, env);	  
	}

	public MessageBoardPage navigateToMessageBoardPage(){
		navigateToPage("MESSAGEBOARD");
		return new MessageBoardPage(driver, env);
	}

	public ProjectsPage navigateToProjectsPage(){
		navigateToPage("PROJECTS");
		return new ProjectsPage(driver, env);
	}

	public TasksPage navigateToTaskspage(){
		navigateToPage("TASKS");
		return new TasksPage(driver, env);
	}

	public HotelRequestsPage navigateToHotelReqPage(){
		navigateToPage("HOTELREQUESTS");
		return new HotelRequestsPage(driver, env);
	}

	public ConfReservationsPage navigateToConfResPage(){
		navigateToPage("CONFRESERVATIONS");
		return new ConfReservationsPage(driver, env);
	}

	public MessagesPage navigateToMassagesPage(){
		navigateToPage("MESSAGES");
		return new MessagesPage(driver, env);
	}

	public VendorDirectPage navigateToVenderDirectPage(){
		navigateToPage("VENDORDIRECT");
		return new VendorDirectPage(driver, env);
	}

	public TourSeriesPage navigateToTourSeriesPage(){
		navigateToPage("TOURSERIES");
		return new TourSeriesPage(driver, env);
	}

	public GuideAssignmentsPage navigateToGuideAssgnPage(){
		navigateToPage("GUIDEASSIGNMENTS");
		return new GuideAssignmentsPage(driver, env);
	}

	public InventoryPage navigateToInventoryPage(){
		navigateToPage("INVENTORY");
		return new InventoryPage(driver, env);
	}

	public HistoryPage navigateToHistoryPage(){
		navigateToPage("HISTORY");
		return new HistoryPage(driver, env);
	}

	public OptExpiredPage navigateToOptExpiredPage(){
		navigateToPage("OPTEXPIRED");
		return new OptExpiredPage(driver, env);
	}

	public BlockReleasePage navigateToBlockReleasePage(){
		navigateToPage("BLOCKRELEASE");
		return new BlockReleasePage(driver, env);
	}

	public ResqueueMngmtPage navigateToResqMngmtPage(){
		navigateToPage("RESQMANAGEMENT");
		return new ResqueueMngmtPage(driver, env);
	}

	public UsersPage navigateToUsersPage(){
		navigateToPage("USERS");
		return new UsersPage(driver, env);
	}

	public ExternalUsersPage navigateToExtUsersPage(){
		navigateToPage("EXTERNALUSERS");
		return new ExternalUsersPage(driver, env);
	}

	public LockedAccountsPage navigateToLockedAccountsPage(){
		navigateToPage("LOCKEDACCOUNTS");
		return new LockedAccountsPage(driver, env);
	}
*/	  
}
