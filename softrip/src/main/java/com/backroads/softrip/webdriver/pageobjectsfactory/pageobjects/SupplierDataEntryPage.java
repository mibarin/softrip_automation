package com.backroads.softrip.webdriver.pageobjectsfactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SupplierDataEntryPage extends BRBasePageObject  {

    //Voucher Contact
	@FindBy(id = "supFormDocContact")
    protected WebElement voucherContact;
        
    @FindBy(id = "supFormDocPhone")
    protected WebElement voucherPhone;
    
    @FindBy(id = "supFormDocFax")
    protected WebElement voucherFax;    
    
    @FindBy(id = "supFormDocEmail")
    protected WebElement voucherEmail;   
    
    //Ops Contact
	@FindBy(id = "supFormOpsContact")
    protected WebElement opsContact;
        
    @FindBy(id = "supFormOpsPhone")
    protected WebElement opsPhone;
    
    @FindBy(id = "supFormOpsFax")
    protected WebElement opsFax;    
    
    @FindBy(id = "supFormOpsEmail")
    protected WebElement opsEmail;   
    
    //Tour Contact
	@FindBy(id = "supFormTourContact")
    protected WebElement tourContact;
        
    @FindBy(id = "supFormTourPhone")
    protected WebElement tourPhone;
    
    @FindBy(id = "supFormTourFax")
    protected WebElement tourFax;    
    
    @FindBy(id = "supFormTourEmail")
    protected WebElement tourEmail;         
    
    //Group Contact
	@FindBy(id = "supFormGroupContact")
    protected WebElement groupContact;
        
    @FindBy(id = "supFormGroupPhone")
    protected WebElement groupPhone;
    
    @FindBy(id = "supFormGroupFax")
    protected WebElement groupFax;    
    
    @FindBy(id = "supFormGroupEmail")
    protected WebElement groupEmail;          
    
    //Acct Contact
	@FindBy(id = "supFormAccContact")
    protected WebElement acctContact;
        
    @FindBy(id = "supFormAccPhone")
    protected WebElement acctPhone;
    
    @FindBy(id = "supFormAccFax")
    protected WebElement acctFax;    
    
    @FindBy(id = "supFormAccEmail")
    protected WebElement acctEmail;                 
    
    //Contract Contact
	@FindBy(id = "supFormContractContact")
    protected WebElement contractContact;
        
    @FindBy(id = "supFormContractPhone")
    protected WebElement contractPhone;
    
    @FindBy(id = "supFormContractFax")
    protected WebElement contractFax;    
    
    @FindBy(id = "supFormContractEmail")
    protected WebElement contractEmail;   
    
    //btn
    @FindBy(css = "#supplierForm > div:nth-of-type(2) > div > div > button:nth-of-type(2)")
    protected WebElement saveBtn;    
  
    public SupplierDataEntryPage(WebDriver driver, String env) {
 		super(driver, env);
 		PageFactory.initElements(driver, this);
 	}

    public void makeVoucherContactEntry(String s){
		this.waitFor.until(ExpectedConditions.visibilityOf(voucherContact));
		voucherContact.clear();
		voucherContact.sendKeys(s);    	
    }

    public void makeVoucherPhoneEntry(String s){
		this.waitFor.until(ExpectedConditions.visibilityOf(voucherPhone));
		voucherPhone.clear();
		voucherPhone.sendKeys(s);    	
    }

    public void makeVoucherFaxEntry(String s){
		this.waitFor.until(ExpectedConditions.visibilityOf(voucherFax));
		voucherFax.clear();
		voucherFax.sendKeys(s);    	
    }        

    public void makeVoucherEmailEntry(String s){
		this.waitFor.until(ExpectedConditions.visibilityOf(voucherEmail));
		voucherEmail.clear();
		voucherEmail.sendKeys(s);    	
    }
    
    
    //Ops Contact

      public void makeOpsContactEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(opsContact));
  		opsContact.clear();
  		opsContact.sendKeys(s);    	
      }

      public void makeOpsPhoneEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(opsPhone));
  		opsPhone.clear();
  		opsPhone.sendKeys(s);    	
      }

      public void makeOpsFaxEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(opsFax));
  		opsFax.clear();
  		opsFax.sendKeys(s);    	
      }        

      public void makeOpsEmailEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(opsEmail));
  		opsEmail.clear();
  		opsEmail.sendKeys(s);    	
      }
      
           
      //Tour Contact
      public void makeTourContactEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(tourContact));
  		tourContact.clear();
  		tourContact.sendKeys(s);    	
      }

      public void makeTourPhoneEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(tourPhone));
  		tourPhone.clear();
  		tourPhone.sendKeys(s);    	
      }

      public void makeTourFaxEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(tourFax));
  		tourFax.clear();
  		tourFax.sendKeys(s);    	
      }        

      public void makeTourEmailEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(tourEmail));
  		tourEmail.clear();
  		tourEmail.sendKeys(s);    	
      }
      
      
      //Group Contact
      public void makeGroupContactEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(groupContact));
  		groupContact.clear();
  		groupContact.sendKeys(s);    	
      }

      public void makeGroupPhoneEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(groupPhone));
  		groupPhone.clear();
  		groupPhone.sendKeys(s);    	
      }

      public void makeGroupFaxEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(groupFax));
  		groupFax.clear();
  		groupFax.sendKeys(s);    	
      }        

      public void makeGroupEmailEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(groupEmail));
  		groupEmail.clear();
  		groupEmail.sendKeys(s);    	
      }
      
      
      //Acct Contact

      public void makeAcctContactEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(acctContact));
  		acctContact.clear();
  		acctContact.sendKeys(s);    	
      }

      public void makeAcctPhoneEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(acctPhone));
  		acctPhone.clear();
  		acctPhone.sendKeys(s);    	
      }

      public void makeAcctFaxEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(acctFax));
  		acctFax.clear();
  		acctFax.sendKeys(s);    	
      }        

      public void makeAcctEmailEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(acctEmail));
  		acctEmail.clear();
  		acctEmail.sendKeys(s);    	
      }
      
      
      //Contract Contact      
      public void makeContractContactEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(contractContact));
  		contractContact.clear();
  		contractContact.sendKeys(s);    	
      }

      public void makeContractPhoneEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(contractPhone));
  		contractPhone.clear();
  		contractPhone.sendKeys(s);    	
      }

      public void makeContractFaxEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(contractFax));
  		contractFax.clear();
  		contractFax.sendKeys(s);    	
      }        

      public void makeContractEmailEntry(String s){
  		this.waitFor.until(ExpectedConditions.visibilityOf(contractEmail));
  		contractEmail.clear();
  		contractEmail.sendKeys(s);    	
      }
      
      public void clickSaveBtn(){
    	  this.jsExecutorscrollDown();
    	  this.jsExecutorClick(saveBtn);	   	  
      }
      
}
